/*
 * This code was auto generated by AfterShip SDK Generator.
 * Do not edit the class manually.
 */
package com.aftership.model;

import com.google.gson.annotations.SerializedName;
import com.aftership.base.Resource;

public class GetAllCouriersResponse extends Resource {

    @SerializedName("total")
    private Integer total;

    @SerializedName("couriers")
    private java.util.List<Courier> couriers;

    public  Integer getTotal() {
        return total;
    }

    public void setTotal( Integer total) {
        this.total = total;
    }

    public java.util.List<Courier>  getCouriers() {
        return couriers;
    }

    public void setCouriers(java.util.List<Courier>  couriers) {
        this.couriers = couriers;
    }

}
