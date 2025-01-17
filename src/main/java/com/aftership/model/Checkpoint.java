/*
 * This code was auto generated by AfterShip SDK Generator.
 * Do not edit the class manually.
 */
package com.aftership.model;

import com.google.gson.annotations.SerializedName;
import com.aftership.base.Resource;

public class Checkpoint extends Resource {

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("slug")
    private String slug;

    @SerializedName("checkpoint_time")
    private String checkpointTime;

    @SerializedName("location")
    private String location;

    @SerializedName("city")
    private String city;

    @SerializedName("state")
    private String state;

    @SerializedName("zip")
    private String zip;

    @SerializedName("coordinate")
    private CoordinateCheckpoint coordinate;

    @SerializedName("country_iso3")
    private String countryIso3;

    @SerializedName("country_name")
    private String countryName;

    @SerializedName("message")
    private String message;

    @SerializedName("tag")
    private TagV1 tag;

    @SerializedName("subtag")
    private String subtag;

    @SerializedName("subtag_message")
    private String subtagMessage;

    @SerializedName("raw_tag")
    private String rawTag;

    @SerializedName("events")
    private java.util.List<EventsCheckpoint> events;

    public  String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt( String createdAt) {
        this.createdAt = createdAt;
    }

    public  String getSlug() {
        return slug;
    }

    public void setSlug( String slug) {
        this.slug = slug;
    }

    public  String getCheckpointTime() {
        return checkpointTime;
    }

    public void setCheckpointTime( String checkpointTime) {
        this.checkpointTime = checkpointTime;
    }

    public  String getLocation() {
        return location;
    }

    public void setLocation( String location) {
        this.location = location;
    }

    public  String getCity() {
        return city;
    }

    public void setCity( String city) {
        this.city = city;
    }

    public  String getState() {
        return state;
    }

    public void setState( String state) {
        this.state = state;
    }

    public  String getZip() {
        return zip;
    }

    public void setZip( String zip) {
        this.zip = zip;
    }

    public  CoordinateCheckpoint getCoordinate() {
        return coordinate;
    }

    public void setCoordinate( CoordinateCheckpoint coordinate) {
        this.coordinate = coordinate;
    }

    public  String getCountryIso3() {
        return countryIso3;
    }

    public void setCountryIso3( String countryIso3) {
        this.countryIso3 = countryIso3;
    }

    public  String getCountryName() {
        return countryName;
    }

    public void setCountryName( String countryName) {
        this.countryName = countryName;
    }

    public  String getMessage() {
        return message;
    }

    public void setMessage( String message) {
        this.message = message;
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

    public  String getRawTag() {
        return rawTag;
    }

    public void setRawTag( String rawTag) {
        this.rawTag = rawTag;
    }

    public java.util.List<EventsCheckpoint>  getEvents() {
        return events;
    }

    public void setEvents(java.util.List<EventsCheckpoint>  events) {
        this.events = events;
    }

}
