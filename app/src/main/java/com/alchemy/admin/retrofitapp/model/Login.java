package com.alchemy.admin.retrofitapp.model;

import com.google.gson.annotations.SerializedName;

public class Login {

    /**
     * success : true
     * message : Signed In
     * total_count : 0
     * data : {"user_id":238,"user_email":"sim@152tech.com","user_mobile":"7894561230","user_pin":"1472","user_otp":null,"user_email_verify":1,"user_otp_verify":0,"user_status":1,"user_type":3,"user_creation_date":"2019-01-07 10:46:23","user_update_date":"-0001-11-30 00:00:00","created_by":1,"deleted_at":null,"name":"Sim Virk","country_name":"Canada","state_name":"British Columbia","city_name":"Vancouver","country":1,"state":3,"city":80,"user_image":"https://devapi.centreel.app/images/avatar-m.png","user_role":["chain_manager"],"stores":[{"store_id":49,"name":"Baked Potato Dispensary","chain_id":12,"age_limit":19,"carrying_limit":30,"latitude":"49.27780250","longitude":"-123.11001900","is_store_manager":1,"tax_type":"GST + PST","provincial_rate":"7.00","country_rate":"5.00","role":"Chain Manager","currency_denomination":[{"denomination_id":8,"denomination":"$5","value":"5.00","type":"N"},{"denomination_id":9,"denomination":"$10","value":"10.00","type":"N"},{"denomination_id":10,"denomination":"$20","value":"20.00","type":"N"},{"denomination_id":11,"denomination":"$50","value":"50.00","type":"N"},{"denomination_id":2,"denomination":"5¢","value":"0.05","type":"C"},{"denomination_id":3,"denomination":"10¢","value":"0.10","type":"C"},{"denomination_id":4,"denomination":"25¢","value":"0.25","type":"C"},{"denomination_id":6,"denomination":"$1","value":"1.00","type":"C"},{"denomination_id":7,"denomination":"$2","value":"2.00","type":"C"},{"denomination_id":12,"denomination":"$100","value":"100.00","type":"N"}],"currency":{"code":"CAD","symbol_left":"$","symbol_right":""},"till_id":172,"till_name":"Baked Potato 2"},{"store_id":50,"name":"onefiddytwo","chain_id":12,"age_limit":19,"carrying_limit":30,"latitude":"49.19874350","longitude":"-122.81251890","is_store_manager":1,"tax_type":"GST + PST","provincial_rate":"7.00","country_rate":"5.00","role":"Chain Manager","currency_denomination":[{"denomination_id":8,"denomination":"$5","value":"5.00","type":"N"},{"denomination_id":9,"denomination":"$10","value":"10.00","type":"N"},{"denomination_id":10,"denomination":"$20","value":"20.00","type":"N"},{"denomination_id":11,"denomination":"$50","value":"50.00","type":"N"},{"denomination_id":2,"denomination":"5¢","value":"0.05","type":"C"},{"denomination_id":3,"denomination":"10¢","value":"0.10","type":"C"},{"denomination_id":4,"denomination":"25¢","value":"0.25","type":"C"},{"denomination_id":6,"denomination":"$1","value":"1.00","type":"C"},{"denomination_id":7,"denomination":"$2","value":"2.00","type":"C"},{"denomination_id":12,"denomination":"$100","value":"100.00","type":"N"}],"currency":{"code":"CAD","symbol_left":"$","symbol_right":""},"till_id":113,"till_name":"Till 4"},{"store_id":86,"name":"Centreel Alchemy","chain_id":12,"age_limit":21,"carrying_limit":30,"latitude":"0.00000000","longitude":"0.00000000","is_store_manager":1,"tax_type":"GST + QST","provincial_rate":"9.98","country_rate":"5.00","role":"Chain Manager","currency_denomination":[{"denomination_id":8,"denomination":"$5","value":"5.00","type":"N"},{"denomination_id":9,"denomination":"$10","value":"10.00","type":"N"},{"denomination_id":10,"denomination":"$20","value":"20.00","type":"N"},{"denomination_id":11,"denomination":"$50","value":"50.00","type":"N"},{"denomination_id":2,"denomination":"5¢","value":"0.05","type":"C"},{"denomination_id":3,"denomination":"10¢","value":"0.10","type":"C"},{"denomination_id":4,"denomination":"25¢","value":"0.25","type":"C"},{"denomination_id":6,"denomination":"$1","value":"1.00","type":"C"},{"denomination_id":7,"denomination":"$2","value":"2.00","type":"C"},{"denomination_id":12,"denomination":"$100","value":"100.00","type":"N"}],"currency":{"code":"CAD","symbol_left":"$","symbol_right":""},"till_id":"","till_name":""},{"store_id":89,"name":"Thane Dale","chain_id":12,"age_limit":19,"carrying_limit":30,"latitude":"0.00000000","longitude":"0.00000000","is_store_manager":1,"tax_type":"HST","provincial_rate":"10.00","country_rate":"5.00","role":"Chain Manager","currency_denomination":[{"denomination_id":8,"denomination":"$5","value":"5.00","type":"N"},{"denomination_id":9,"denomination":"$10","value":"10.00","type":"N"},{"denomination_id":10,"denomination":"$20","value":"20.00","type":"N"},{"denomination_id":11,"denomination":"$50","value":"50.00","type":"N"},{"denomination_id":2,"denomination":"5¢","value":"0.05","type":"C"},{"denomination_id":3,"denomination":"10¢","value":"0.10","type":"C"},{"denomination_id":4,"denomination":"25¢","value":"0.25","type":"C"},{"denomination_id":6,"denomination":"$1","value":"1.00","type":"C"},{"denomination_id":7,"denomination":"$2","value":"2.00","type":"C"},{"denomination_id":12,"denomination":"$100","value":"100.00","type":"N"}],"currency":{"code":"CAD","symbol_left":"$","symbol_right":""},"till_id":"","till_name":""}],"clock_status":"in","total_hours":"00:00:00"}
     */

    @SerializedName("success")
    private boolean success;
    @SerializedName("message")
    private String message;
    @SerializedName("total_count")
    private int totalCount;
//    @SerializedName("data")
//    private Data data;

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

//    public Data getData() {
//        return data;
//    }
//
//    public void setData(Data data) {
//        this.data = data;
//    }
}
