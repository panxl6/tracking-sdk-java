/*
 * This code was auto generated by AfterShip SDK Generator.
 * Do not edit the class manually.
 */
package com.aftership.model;

import com.google.gson.annotations.SerializedName;
import com.aftership.base.Resource;

public class GetCheckpointByTrackingIdResponse extends Resource {

    @SerializedName("id")
    private String id;

    @SerializedName("tracking_number")
    private String trackingNumber;

    @SerializedName("slug")
    private String slug;

    @SerializedName("tag")
    private TagV1 tag;

    @SerializedName("subtag")
    private String subtag;

    @SerializedName("subtag_message")
    private String subtagMessage;

    @SerializedName("checkpoint")
    private Checkpoint checkpoint;

    public  String getId() {
        return id;
    }

    public void setId( String id) {
        this.id = id;
    }

    public  String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber( String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public  String getSlug() {
        return slug;
    }

    public void setSlug( String slug) {
        this.slug = slug;
    }

    public  TagV1 getTag() {
        return tag;
    }

    public void setTag( TagV1 tag) {
        this.tag = tag;
    }

    public  String getSubtag() {
        return subtag;
    }

    public void setSubtag( String subtag) {
        this.subtag = subtag;
    }

    public  String getSubtagMessage() {
        return subtagMessage;
    }

    public void setSubtagMessage( String subtagMessage) {
        this.subtagMessage = subtagMessage;
    }

    public  Checkpoint getCheckpoint() {
        return checkpoint;
    }

    public void setCheckpoint( Checkpoint checkpoint) {
        this.checkpoint = checkpoint;
    }

}
