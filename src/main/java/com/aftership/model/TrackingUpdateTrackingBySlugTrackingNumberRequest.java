/*
 * This code was auto generated by AfterShip SDK Generator.
 * Do not edit the class manually.
 */
package com.aftership.model;

import com.google.gson.annotations.SerializedName;
import com.aftership.base.Resource;

public class TrackingUpdateTrackingBySlugTrackingNumberRequest extends Resource {

    @SerializedName("smses")
    private java.util.List<String> smses;

    @SerializedName("emails")
    private java.util.List<String> emails;

    @SerializedName("title")
    private String title;

    @SerializedName("customer_name")
    private String customerName;

    @SerializedName("order_id")
    private String orderId;

    @SerializedName("order_id_path")
    private String orderIdPath;

    @SerializedName("custom_fields")
    private CustomFieldsTrackingUpdateTrackingBySlugTrackingNumberRequest customFields;

    @SerializedName("note")
    private String note;

    @SerializedName("language")
    private String language;

    @SerializedName("order_promised_delivery_date")
    private String orderPromisedDeliveryDate;

    @SerializedName("delivery_type")
    private String deliveryType;

    @SerializedName("pickup_location")
    private String pickupLocation;

    @SerializedName("pickup_note")
    private String pickupNote;

    @SerializedName("slug")
    private String slug;

    @SerializedName("tracking_account_number")
    private String trackingAccountNumber;

    @SerializedName("tracking_origin_country")
    private String trackingOriginCountry;

    @SerializedName("tracking_destination_country")
    private String trackingDestinationCountry;

    @SerializedName("tracking_key")
    private String trackingKey;

    @SerializedName("tracking_postal_code")
    private String trackingPostalCode;

    @SerializedName("tracking_ship_date")
    private String trackingShipDate;

    @SerializedName("tracking_state")
    private String trackingState;

    @SerializedName("order_number")
    private String orderNumber;

    @SerializedName("order_date")
    private String orderDate;

    @SerializedName("location_id")
    private String locationId;

    @SerializedName("shipping_method")
    private String shippingMethod;

    public java.util.List<String>  getSmses() {
        return smses;
    }

    public void setSmses(java.util.List<String>  smses) {
        this.smses = smses;
    }

    public java.util.List<String>  getEmails() {
        return emails;
    }

    public void setEmails(java.util.List<String>  emails) {
        this.emails = emails;
    }

    public  String getTitle() {
        return title;
    }

    public void setTitle( String title) {
        this.title = title;
    }

    public  String getCustomerName() {
        return customerName;
    }

    public void setCustomerName( String customerName) {
        this.customerName = customerName;
    }

    public  String getOrderId() {
        return orderId;
    }

    public void setOrderId( String orderId) {
        this.orderId = orderId;
    }

    public  String getOrderIdPath() {
        return orderIdPath;
    }

    public void setOrderIdPath( String orderIdPath) {
        this.orderIdPath = orderIdPath;
    }

    public  CustomFieldsTrackingUpdateTrackingBySlugTrackingNumberRequest getCustomFields() {
        return customFields;
    }

    public void setCustomFields( CustomFieldsTrackingUpdateTrackingBySlugTrackingNumberRequest customFields) {
        this.customFields = customFields;
    }

    public  String getNote() {
        return note;
    }

    public void setNote( String note) {
        this.note = note;
    }

    public  String getLanguage() {
        return language;
    }

    public void setLanguage( String language) {
        this.language = language;
    }

    public  String getOrderPromisedDeliveryDate() {
        return orderPromisedDeliveryDate;
    }

    public void setOrderPromisedDeliveryDate( String orderPromisedDeliveryDate) {
        this.orderPromisedDeliveryDate = orderPromisedDeliveryDate;
    }

    public  String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType( String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public  String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation( String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public  String getPickupNote() {
        return pickupNote;
    }

    public void setPickupNote( String pickupNote) {
        this.pickupNote = pickupNote;
    }

    public  String getSlug() {
        return slug;
    }

    public void setSlug( String slug) {
        this.slug = slug;
    }

    public  String getTrackingAccountNumber() {
        return trackingAccountNumber;
    }

    public void setTrackingAccountNumber( String trackingAccountNumber) {
        this.trackingAccountNumber = trackingAccountNumber;
    }

    public  String getTrackingOriginCountry() {
        return trackingOriginCountry;
    }

    public void setTrackingOriginCountry( String trackingOriginCountry) {
        this.trackingOriginCountry = trackingOriginCountry;
    }

    public  String getTrackingDestinationCountry() {
        return trackingDestinationCountry;
    }

    public void setTrackingDestinationCountry( String trackingDestinationCountry) {
        this.trackingDestinationCountry = trackingDestinationCountry;
    }

    public  String getTrackingKey() {
        return trackingKey;
    }

    public void setTrackingKey( String trackingKey) {
        this.trackingKey = trackingKey;
    }

    public  String getTrackingPostalCode() {
        return trackingPostalCode;
    }

    public void setTrackingPostalCode( String trackingPostalCode) {
        this.trackingPostalCode = trackingPostalCode;
    }

    public  String getTrackingShipDate() {
        return trackingShipDate;
    }

    public void setTrackingShipDate( String trackingShipDate) {
        this.trackingShipDate = trackingShipDate;
    }

    public  String getTrackingState() {
        return trackingState;
    }

    public void setTrackingState( String trackingState) {
        this.trackingState = trackingState;
    }

    public  String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber( String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public  String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate( String orderDate) {
        this.orderDate = orderDate;
    }

    public  String getLocationId() {
        return locationId;
    }

    public void setLocationId( String locationId) {
        this.locationId = locationId;
    }

    public  String getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod( String shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

}
