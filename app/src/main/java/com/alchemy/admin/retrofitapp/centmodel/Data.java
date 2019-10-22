package com.alchemy.admin.retrofitapp.centmodel;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Data {
    /**
     * date : 2019-02-18 06:21:04
     * orders : [{"patient_full_name":"-","phone":null,"patient_id":null,"order_id":8364,"order_pub_id":"CEN29B4ED18C549E","redeem_amount":null,"delivery_charge":null,"service_fee":"0.00","delivery_status":4,"order_placed":"2019-02-18 06:21:04","total_items":1,"order_platform":"self-checkout","check_status":"unseen","reschedule_count":0,"pickup_time":null,"total_bill":"2.79","delivery_status_text":"CANCELLED","order_status_text":"SELF CHECKOUT","reschedule":0,"latitude":"49.26437070","longitude":"-123.17474010","store_id":53,"store_name":"Chronic Hub","chain_name":"Chronic Hub","payment_mode":"","order_placed_by":"Lucas Allen","city_id":80,"city_name":"Vancouver","state_id":3,"state_name":"British Columbia","country_id":1,"country_name":"Canada"}]
     */

    @SerializedName("date")
    private String date;
    @SerializedName("orders")
    private ArrayList<Orders> orders;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ArrayList<Orders> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Orders> orders) {
        this.orders = orders;
    }
}
