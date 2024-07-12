/*
 * This code was auto generated by AfterShip SDK Generator.
 * Do not edit the class manually.
 */
package com.aftership.model;

import com.google.gson.annotations.SerializedName;

public enum AdditionalFieldsV1 {
    @SerializedName("tracking_account_number")
    TrackingAccountNumber("tracking_account_number"),

    @SerializedName("tracking_postal_code")
    TrackingPostalCode("tracking_postal_code"),

    @SerializedName("tracking_ship_date")
    TrackingShipDate("tracking_ship_date"),

    @SerializedName("tracking_key")
    TrackingKey("tracking_key"),

    @SerializedName("tracking_origin_country")
    TrackingOriginCountry("tracking_origin_country"),

    @SerializedName("tracking_destination_country")
    TrackingDestinationCountry("tracking_destination_country"),

    @SerializedName("tracking_state")
    TrackingState("tracking_state");

    private final String content;

    AdditionalFieldsV1(final String content) {
        this.content = content;
    }

    public String toString() {
        return content;
    }
}