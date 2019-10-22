package com.alchemy.admin.retrofitapp.centmodel;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class RespOrders {


    /**
     * success : true
     * message : Order list found
     * total_count : 662
     * data : [{"date":"2019-02-18 06:21:04","orders":[{"patient_full_name":"-","phone":null,"patient_id":null,"order_id":8364,"order_pub_id":"CEN29B4ED18C549E","redeem_amount":null,"delivery_charge":null,"service_fee":"0.00","delivery_status":4,"order_placed":"2019-02-18 06:21:04","total_items":1,"order_platform":"self-checkout","check_status":"unseen","reschedule_count":0,"pickup_time":null,"total_bill":"2.79","delivery_status_text":"CANCELLED","order_status_text":"SELF CHECKOUT","reschedule":0,"latitude":"49.26437070","longitude":"-123.17474010","store_id":53,"store_name":"Chronic Hub","chain_name":"Chronic Hub","payment_mode":"","order_placed_by":"Lucas Allen","city_id":80,"city_name":"Vancouver","state_id":3,"state_name":"British Columbia","country_id":1,"country_name":"Canada"}]},{"date":"2019-02-11 06:07:02","orders":[{"patient_full_name":"-","phone":null,"patient_id":null,"order_id":8296,"order_pub_id":"CEN5E98E6F3C4A56","redeem_amount":null,"delivery_charge":null,"service_fee":"0.00","delivery_status":4,"order_placed":"2019-02-11 06:07:02","total_items":1,"order_platform":"self-checkout","check_status":"unseen","reschedule_count":0,"pickup_time":null,"total_bill":"1.98","delivery_status_text":"CANCELLED","order_status_text":"SELF CHECKOUT","reschedule":0,"latitude":"49.26437070","longitude":"-123.17474010","store_id":53,"store_name":"Chronic Hub","chain_name":"Chronic Hub","payment_mode":"","order_placed_by":"Lucas Allen","city_id":80,"city_name":"Vancouver","state_id":3,"state_name":"British Columbia","country_id":1,"country_name":"Canada"}]},{"date":"2019-02-07 11:16:50","orders":[{"patient_full_name":"-","phone":null,"patient_id":null,"order_id":8294,"order_pub_id":"CEN6ADEF77C02A2A","redeem_amount":null,"delivery_charge":null,"service_fee":"0.00","delivery_status":4,"order_placed":"2019-02-07 11:16:50","total_items":1,"order_platform":"self-checkout","check_status":"unseen","reschedule_count":0,"pickup_time":null,"total_bill":"2.09","delivery_status_text":"CANCELLED","order_status_text":"SELF CHECKOUT","reschedule":0,"latitude":"49.26437070","longitude":"-123.17474010","store_id":53,"store_name":"Chronic Hub","chain_name":"Chronic Hub","payment_mode":"","order_placed_by":"Lucas Allen","city_id":80,"city_name":"Vancouver","state_id":3,"state_name":"British Columbia","country_id":1,"country_name":"Canada"}]},{"date":"2019-02-07 11:16:15","orders":[{"patient_full_name":"-","phone":null,"patient_id":null,"order_id":8293,"order_pub_id":"CEN96A74C409C363","redeem_amount":null,"delivery_charge":null,"service_fee":"0.00","delivery_status":4,"order_placed":"2019-02-07 11:16:15","total_items":1,"order_platform":"self-checkout","check_status":"unseen","reschedule_count":0,"pickup_time":null,"total_bill":"2.09","delivery_status_text":"CANCELLED","order_status_text":"SELF CHECKOUT","reschedule":0,"latitude":"49.26437070","longitude":"-123.17474010","store_id":53,"store_name":"Chronic Hub","chain_name":"Chronic Hub","payment_mode":"","order_placed_by":"Lucas Allen","city_id":80,"city_name":"Vancouver","state_id":3,"state_name":"British Columbia","country_id":1,"country_name":"Canada"}]},{"date":"2019-02-06 11:53:14","orders":[{"patient_full_name":"-","phone":null,"patient_id":null,"order_id":8284,"order_pub_id":"CEN839036B4EFB66","redeem_amount":null,"delivery_charge":null,"service_fee":"0.00","delivery_status":4,"order_placed":"2019-02-06 11:53:14","total_items":1,"order_platform":"self-checkout","check_status":"unseen","reschedule_count":0,"pickup_time":null,"total_bill":"2.61","delivery_status_text":"CANCELLED","order_status_text":"SELF CHECKOUT","reschedule":0,"latitude":"49.26437070","longitude":"-123.17474010","store_id":53,"store_name":"Chronic Hub","chain_name":"Chronic Hub","payment_mode":"","order_placed_by":"Lucas Allen","city_id":80,"city_name":"Vancouver","state_id":3,"state_name":"British Columbia","country_id":1,"country_name":"Canada"}]},{"date":"2019-02-06 11:28:48","orders":[{"patient_full_name":"-","phone":null,"patient_id":null,"order_id":8283,"order_pub_id":"CENDFF4092753D22","redeem_amount":null,"delivery_charge":null,"service_fee":"0.00","delivery_status":4,"order_placed":"2019-02-06 11:28:48","total_items":1,"order_platform":"self-checkout","check_status":"unseen","reschedule_count":0,"pickup_time":null,"total_bill":"2.61","delivery_status_text":"CANCELLED","order_status_text":"SELF CHECKOUT","reschedule":0,"latitude":"49.26437070","longitude":"-123.17474010","store_id":53,"store_name":"Chronic Hub","chain_name":"Chronic Hub","payment_mode":"","order_placed_by":"Lucas Allen","city_id":80,"city_name":"Vancouver","state_id":3,"state_name":"British Columbia","country_id":1,"country_name":"Canada"}]},{"date":"2019-02-06 10:21:58","orders":[{"patient_full_name":"Test Card Abc","phone":null,"patient_id":33896,"order_id":8282,"order_pub_id":"CEN0463881DDA06B","redeem_amount":null,"delivery_charge":null,"service_fee":"0.00","delivery_status":4,"order_placed":"2019-02-06 10:21:58","total_items":1,"order_platform":"self-checkout","check_status":"unseen","reschedule_count":0,"pickup_time":null,"total_bill":"52.50","delivery_status_text":"CANCELLED","order_status_text":"SELF CHECKOUT","reschedule":0,"latitude":"49.26437070","longitude":"-123.17474010","store_id":53,"store_name":"Chronic Hub","chain_name":"Chronic Hub","payment_mode":"","order_placed_by":"Lucas Allen","city_id":80,"city_name":"Vancouver","state_id":3,"state_name":"British Columbia","country_id":1,"country_name":"Canada"}]},{"date":"2019-02-04 11:47:21","orders":[{"patient_full_name":"-","phone":null,"patient_id":null,"order_id":8261,"order_pub_id":"CEN03DE3215B545D","redeem_amount":null,"delivery_charge":null,"service_fee":"0.00","delivery_status":4,"order_placed":"2019-02-04 11:47:21","total_items":1,"order_platform":"self-checkout","check_status":"unseen","reschedule_count":0,"pickup_time":null,"total_bill":"2.09","delivery_status_text":"CANCELLED","order_status_text":"SELF CHECKOUT","reschedule":0,"latitude":"49.26437070","longitude":"-123.17474010","store_id":53,"store_name":"Chronic Hub","chain_name":"Chronic Hub","payment_mode":"","order_placed_by":"Lucas Allen","city_id":80,"city_name":"Vancouver","state_id":3,"state_name":"British Columbia","country_id":1,"country_name":"Canada"}]},{"date":"2019-02-04 11:47:01","orders":[{"patient_full_name":"-","phone":null,"patient_id":null,"order_id":8260,"order_pub_id":"CEN7BAE3B80C4EC6","redeem_amount":null,"delivery_charge":null,"service_fee":"0.00","delivery_status":4,"order_placed":"2019-02-04 11:47:01","total_items":1,"order_platform":"self-checkout","check_status":"unseen","reschedule_count":0,"pickup_time":null,"total_bill":"2.09","delivery_status_text":"CANCELLED","order_status_text":"SELF CHECKOUT","reschedule":0,"latitude":"49.26437070","longitude":"-123.17474010","store_id":53,"store_name":"Chronic Hub","chain_name":"Chronic Hub","payment_mode":"","order_placed_by":"Lucas Allen","city_id":80,"city_name":"Vancouver","state_id":3,"state_name":"British Columbia","country_id":1,"country_name":"Canada"}]},{"date":"2019-02-04 11:46:50","orders":[{"patient_full_name":"-","phone":null,"patient_id":null,"order_id":8259,"order_pub_id":"CEN80E3C2AB52365","redeem_amount":null,"delivery_charge":null,"service_fee":"0.00","delivery_status":4,"order_placed":"2019-02-04 11:46:50","total_items":1,"order_platform":"self-checkout","check_status":"unseen","reschedule_count":0,"pickup_time":null,"total_bill":"2.09","delivery_status_text":"CANCELLED","order_status_text":"SELF CHECKOUT","reschedule":0,"latitude":"49.26437070","longitude":"-123.17474010","store_id":53,"store_name":"Chronic Hub","chain_name":"Chronic Hub","payment_mode":"","order_placed_by":"Lucas Allen","city_id":80,"city_name":"Vancouver","state_id":3,"state_name":"British Columbia","country_id":1,"country_name":"Canada"}]}]
     */

    @SerializedName("success")
    private boolean success;
    @SerializedName("message")
    private String message;
    @SerializedName("total_count")
    private int totalCount;
    @SerializedName("data")
    private ArrayList<Data> data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public ArrayList<Data> getData() {
        return data;
    }

    public void setData(ArrayList<Data> data) {
        this.data = data;
    }
}
