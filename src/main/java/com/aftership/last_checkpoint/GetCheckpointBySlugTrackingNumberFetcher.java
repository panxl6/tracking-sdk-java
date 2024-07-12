/*
 * This code was auto generated by AfterShip SDK Generator.
 * Do not edit the class manually.
 */
package com.aftership.last_checkpoint;

import com.aftership.base.Fetcher;
import com.aftership.constant.ErrorEnum;
import com.aftership.exception.ApiException;
import com.aftership.http.*;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.HashMap;
import java.util.Map;
import com.aftership.http.Request;
import com.aftership.model.GetCheckpointBySlugTrackingNumberResponse;
import com.aftership.base.Page;

import com.aftership.model.GetCheckpointBySlugTrackingNumberResponse;

public class GetCheckpointBySlugTrackingNumberFetcher extends Fetcher<GetCheckpointBySlugTrackingNumberResponse> {
    private final Map<String, String> headerParams= new HashMap<>(8);

    public GetCheckpointBySlugTrackingNumberFetcher addHeaderParam(final String name, final String value) {
        if (value == null || value.equals("null")) {
            return this;
        }

        if (!headerParams.containsKey(name)) {
            headerParams.put(name, value);
        }
        return this;
    }

    private void setHeaderParams(final Request request) {
        for (final Map.Entry<String, String> entry : headerParams.entrySet()) {
            request.addHeaderParam(entry.getKey(), entry.getValue());
        }
    }
     private String fields;

     private String lang;

     private String trackingAccountNumber;

     private String trackingOriginCountry;

     private String trackingDestinationCountry;

     private String trackingKey;

     private String trackingPostalCode;

     private String trackingShipDate;

     private String trackingState;

    private String slug;

    private String tracking_number;


    public GetCheckpointBySlugTrackingNumberFetcher setFields(String fields) {
        this.fields = fields;
        return this;
    }

    public GetCheckpointBySlugTrackingNumberFetcher setLang(String lang) {
        this.lang = lang;
        return this;
    }

    public GetCheckpointBySlugTrackingNumberFetcher setTrackingAccountNumber(String trackingAccountNumber) {
        this.trackingAccountNumber = trackingAccountNumber;
        return this;
    }

    public GetCheckpointBySlugTrackingNumberFetcher setTrackingOriginCountry(String trackingOriginCountry) {
        this.trackingOriginCountry = trackingOriginCountry;
        return this;
    }

    public GetCheckpointBySlugTrackingNumberFetcher setTrackingDestinationCountry(String trackingDestinationCountry) {
        this.trackingDestinationCountry = trackingDestinationCountry;
        return this;
    }

    public GetCheckpointBySlugTrackingNumberFetcher setTrackingKey(String trackingKey) {
        this.trackingKey = trackingKey;
        return this;
    }

    public GetCheckpointBySlugTrackingNumberFetcher setTrackingPostalCode(String trackingPostalCode) {
        this.trackingPostalCode = trackingPostalCode;
        return this;
    }

    public GetCheckpointBySlugTrackingNumberFetcher setTrackingShipDate(String trackingShipDate) {
        this.trackingShipDate = trackingShipDate;
        return this;
    }

    public GetCheckpointBySlugTrackingNumberFetcher setTrackingState(String trackingState) {
        this.trackingState = trackingState;
        return this;
    }

    public GetCheckpointBySlugTrackingNumberFetcher setSlug(String slug) {
        this.slug = slug;
        return this;
    }

    public GetCheckpointBySlugTrackingNumberFetcher setTrackingNumber(String tracking_number) {
        this.tracking_number = tracking_number;
        return this;
    }

    @Override
    public GetCheckpointBySlugTrackingNumberResponse fetch(AfterShipClient client) throws Exception {
        if (slug == null || slug.isEmpty()) {
            throw new ApiException(ErrorEnum.BAD_REQUEST.getCode(), ErrorEnum.BAD_REQUEST.getMessage() + ": `slug` is invalid");
        }
        if (tracking_number == null || tracking_number.isEmpty()) {
            throw new ApiException(ErrorEnum.BAD_REQUEST.getCode(), ErrorEnum.BAD_REQUEST.getMessage() + ": `tracking_number` is invalid");
        }
        String path = String.format("/tracking/2024-04/last_checkpoint/%s/%s", slug,tracking_number);
        Request request = new Request(HttpMethod.GET, path);
        addQueryParams(request);
        setHeaderParams(request);
        Response response = client.request(request);
        AfterShipResponse<GetCheckpointBySlugTrackingNumberResponse> trackingResponse = new Gson().fromJson(response.getContent(), new TypeToken<AfterShipResponse<GetCheckpointBySlugTrackingNumberResponse>>() {
            }.getType());
        return trackingResponse.getData();

    }

    private void addQueryParams(final Request request) {
        if (fields != null) {
            request.addQueryParam("fields", fields);
        }
        if (lang != null) {
            request.addQueryParam("lang", lang);
        }
        if (trackingAccountNumber != null) {
            request.addQueryParam("tracking_account_number", trackingAccountNumber);
        }
        if (trackingOriginCountry != null) {
            request.addQueryParam("tracking_origin_country", trackingOriginCountry);
        }
        if (trackingDestinationCountry != null) {
            request.addQueryParam("tracking_destination_country", trackingDestinationCountry);
        }
        if (trackingKey != null) {
            request.addQueryParam("tracking_key", trackingKey);
        }
        if (trackingPostalCode != null) {
            request.addQueryParam("tracking_postal_code", trackingPostalCode);
        }
        if (trackingShipDate != null) {
            request.addQueryParam("tracking_ship_date", trackingShipDate);
        }
        if (trackingState != null) {
            request.addQueryParam("tracking_state", trackingState);
        }

    }
}
