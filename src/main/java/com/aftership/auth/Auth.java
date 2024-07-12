/*
 * This code was auto generated by AfterShip SDK Generator.
 * Do not edit the class manually.
 */
package com.aftership.auth;

import com.aftership.http.Request;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.*;


public class Auth {

    private final String apiKey;

    private final String apiSecret;

    private final AuthType authenticationType;

    public Auth(String apiKey, String apiSecret, AuthType authenticationType) {
        this.apiKey = apiKey;
        this.apiSecret = apiSecret;
        this.authenticationType = authenticationType;
    }

    public Map<String, String> getAuthHeader(Request request) throws Exception {
        HashMap<String, String> headers = new HashMap<>(8);
        headers.put("as-api-key", this.apiKey);
        if (this.authenticationType == AuthType.AES) {
            headers.put("as-signature-hmac-sha256", getAesSign(request));
            headers.put("date", request.getDate());
        }
        if (this.authenticationType == AuthType.RSA) {
            headers.put("as-signature-rsa-sha256", getRsaSign(request));
            headers.put("date", request.getDate());
        }
        return headers;
    }

    private String getAesSign(Request request) throws Exception{
        Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
        SecretKeySpec secret_key = new SecretKeySpec(this.apiSecret.getBytes(), "HmacSHA256");
        sha256_HMAC.init(secret_key);
        String signString = getSignString(request);
        return Base64.getEncoder().encodeToString(sha256_HMAC.doFinal(signString.getBytes()));
    }

    private String getRsaSign(Request request) throws Exception{
        java.security.Security.addProvider(
            new org.bouncycastle.jce.provider.BouncyCastleProvider()
        );
        String signString = getSignString(request);
        String privateKeyPEM = apiSecret
                .replace("-----BEGIN RSA PRIVATE KEY-----", "")
                .replaceAll(System.lineSeparator(), "")
                .replace("-----END RSA PRIVATE KEY-----", "");
        byte[] encoded = Base64.getDecoder().decode(privateKeyPEM);
        KeyFactory kf = KeyFactory.getInstance("RSA");
        PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(encoded);
        RSAPrivateKey privateKey = (RSAPrivateKey) kf.generatePrivate(keySpec);

        Signature signature = Signature.getInstance("SHA256withRSA/PSS");
        signature.initSign(privateKey);
        signature.update(signString.getBytes(StandardCharsets.UTF_8));
        return Base64.getEncoder().encodeToString(signature.sign());
    }

    private String getSignString(Request request) {
        StringBuilder buffer = new StringBuilder();
        buffer.append(request.getMethod());
        buffer.append("\n");
        String body = request.getBody();
        if (body == null) {
            body = "";
        }
        String contentType = "application/json";
        if (!body.isEmpty()) {
            body = getMD5Str(body).toUpperCase();
        } else {
            contentType = "";
        }
        Map<String, String> headers = new HashMap<>(8);
        headers.put("as-api-key", this.apiKey);
        buffer.append(body).append("\n");
        buffer.append(contentType).append("\n");
        buffer.append(request.getDate()).append("\n");
        buffer.append(getCanonicalAmHeaders(headers)).append("\n");
        buffer.append(getCanonicalResource(request.getPath(), request.getQueryString()));
        return buffer.toString();
    }

    private String getCanonicalAmHeaders(Map<String, String> headers) {
        List<String> sortedHeaders = new ArrayList<>(headers.keySet());
        StringBuilder buffer = new StringBuilder();
        sortedHeaders.sort(String.CASE_INSENSITIVE_ORDER);
        for (String key : sortedHeaders) {
            String newKey = key.toLowerCase();
            if (!newKey.startsWith("as-")) {
                continue;
            }
            String value = headers.get(key);
            buffer.append(newKey);
            buffer.append(":");
            if (value != null) {
                buffer.append(value);
            }
            buffer.append("\n");
        }
        return buffer.toString().trim();
    }

    private String getCanonicalResource(String path, String queryString) {
        StringBuilder buffer = new StringBuilder();
        buffer.append(path);
        if (queryString == null) {
            return buffer.toString();
        }
        String[] params = queryString.split("&");
        Arrays.sort(params);
        String queryStr = String.join("&", params);
        buffer.append("?");
        buffer.append(queryStr);
        return buffer.toString();
    }

    private String getMD5Str(String str) {
        String result = "";
        try {
            MessageDigest md5 = MessageDigest.getInstance("md5");
            byte[] digest = md5.digest(str.getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(String.format("%02x", b & 0xff));
            }
            result = sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return result;
    }
}
