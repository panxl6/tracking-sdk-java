/*
 * This code was auto generated by AfterShip SDK Generator.
 * Do not edit the class manually.
 */
package com.aftership.model;

import com.google.gson.annotations.SerializedName;
import com.aftership.base.Resource;

public class NextCouriersTracking extends Resource {

    @SerializedName("slug")
    private String slug;

    @SerializedName("tracking_number")
    private String trackingNumber;

    @SerializedName("source")
    private String source;

    public  String getSlug() {
        return slug;
    }

    public void setSlug( String slug) {
        this.slug = slug;
    }

    public  String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber( String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public  String getSource() {
        return source;
    }

    public void setSource( String source) {
        this.source = source;
    }

}
