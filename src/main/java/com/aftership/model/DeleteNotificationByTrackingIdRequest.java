/*
 * This code was auto generated by AfterShip SDK Generator.
 * Do not edit the class manually.
 */
package com.aftership.model;

import com.google.gson.annotations.SerializedName;
import com.aftership.base.Resource;

public class DeleteNotificationByTrackingIdRequest extends Resource {

    @SerializedName("notification")
    private NotificationRequestV1 notification;

    public  NotificationRequestV1 getNotification() {
        return notification;
    }

    public void setNotification( NotificationRequestV1 notification) {
        this.notification = notification;
    }

}
