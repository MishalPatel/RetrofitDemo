package com.alchemy.admin.retrofitapp.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data {
    /**
     * user_id : 238
     * user_email : sim@152tech.com
     * user_mobile : 7894561230
     * user_pin : 1472
     * user_otp : null
     * user_email_verify : 1
     * user_otp_verify : 0
     * user_status : 1
     * user_type : 3
     * user_creation_date : 2019-01-07 10:46:23
     * user_update_date : -0001-11-30 00:00:00
     * created_by : 1
     * deleted_at : null
     * name : Sim Virk
     * country_name : Canada
     * state_name : British Columbia
     * city_name : Vancouver
     * country : 1
     * state : 3
     * city : 80
     * user_image : https://devapi.centreel.app/images/avatar-m.png
     * user_role : ["chain_manager"]
     * stores : [{"store_id":49,"name":"Baked Potato Dispensary","chain_id":12,"age_limit":19,"carrying_limit":30,"latitude":"49.27780250","longitude":"-123.11001900","is_store_manager":1,"tax_type":"GST + PST","provincial_rate":"7.00","country_rate":"5.00","role":"Chain Manager","currency_denomination":[{"denomination_id":8,"denomination":"$5","value":"5.00","type":"N"},{"denomination_id":9,"denomination":"$10","value":"10.00","type":"N"},{"denomination_id":10,"denomination":"$20","value":"20.00","type":"N"},{"denomination_id":11,"denomination":"$50","value":"50.00","type":"N"},{"denomination_id":2,"denomination":"5¢","value":"0.05","type":"C"},{"denomination_id":3,"denomination":"10¢","value":"0.10","type":"C"},{"denomination_id":4,"denomination":"25¢","value":"0.25","type":"C"},{"denomination_id":6,"denomination":"$1","value":"1.00","type":"C"},{"denomination_id":7,"denomination":"$2","value":"2.00","type":"C"},{"denomination_id":12,"denomination":"$100","value":"100.00","type":"N"}],"currency":{"code":"CAD","symbol_left":"$","symbol_right":""},"till_id":172,"till_name":"Baked Potato 2"},{"store_id":50,"name":"onefiddytwo","chain_id":12,"age_limit":19,"carrying_limit":30,"latitude":"49.19874350","longitude":"-122.81251890","is_store_manager":1,"tax_type":"GST + PST","provincial_rate":"7.00","country_rate":"5.00","role":"Chain Manager","currency_denomination":[{"denomination_id":8,"denomination":"$5","value":"5.00","type":"N"},{"denomination_id":9,"denomination":"$10","value":"10.00","type":"N"},{"denomination_id":10,"denomination":"$20","value":"20.00","type":"N"},{"denomination_id":11,"denomination":"$50","value":"50.00","type":"N"},{"denomination_id":2,"denomination":"5¢","value":"0.05","type":"C"},{"denomination_id":3,"denomination":"10¢","value":"0.10","type":"C"},{"denomination_id":4,"denomination":"25¢","value":"0.25","type":"C"},{"denomination_id":6,"denomination":"$1","value":"1.00","type":"C"},{"denomination_id":7,"denomination":"$2","value":"2.00","type":"C"},{"denomination_id":12,"denomination":"$100","value":"100.00","type":"N"}],"currency":{"code":"CAD","symbol_left":"$","symbol_right":""},"till_id":113,"till_name":"Till 4"},{"store_id":86,"name":"Centreel Alchemy","chain_id":12,"age_limit":21,"carrying_limit":30,"latitude":"0.00000000","longitude":"0.00000000","is_store_manager":1,"tax_type":"GST + QST","provincial_rate":"9.98","country_rate":"5.00","role":"Chain Manager","currency_denomination":[{"denomination_id":8,"denomination":"$5","value":"5.00","type":"N"},{"denomination_id":9,"denomination":"$10","value":"10.00","type":"N"},{"denomination_id":10,"denomination":"$20","value":"20.00","type":"N"},{"denomination_id":11,"denomination":"$50","value":"50.00","type":"N"},{"denomination_id":2,"denomination":"5¢","value":"0.05","type":"C"},{"denomination_id":3,"denomination":"10¢","value":"0.10","type":"C"},{"denomination_id":4,"denomination":"25¢","value":"0.25","type":"C"},{"denomination_id":6,"denomination":"$1","value":"1.00","type":"C"},{"denomination_id":7,"denomination":"$2","value":"2.00","type":"C"},{"denomination_id":12,"denomination":"$100","value":"100.00","type":"N"}],"currency":{"code":"CAD","symbol_left":"$","symbol_right":""},"till_id":"","till_name":""},{"store_id":89,"name":"Thane Dale","chain_id":12,"age_limit":19,"carrying_limit":30,"latitude":"0.00000000","longitude":"0.00000000","is_store_manager":1,"tax_type":"HST","provincial_rate":"10.00","country_rate":"5.00","role":"Chain Manager","currency_denomination":[{"denomination_id":8,"denomination":"$5","value":"5.00","type":"N"},{"denomination_id":9,"denomination":"$10","value":"10.00","type":"N"},{"denomination_id":10,"denomination":"$20","value":"20.00","type":"N"},{"denomination_id":11,"denomination":"$50","value":"50.00","type":"N"},{"denomination_id":2,"denomination":"5¢","value":"0.05","type":"C"},{"denomination_id":3,"denomination":"10¢","value":"0.10","type":"C"},{"denomination_id":4,"denomination":"25¢","value":"0.25","type":"C"},{"denomination_id":6,"denomination":"$1","value":"1.00","type":"C"},{"denomination_id":7,"denomination":"$2","value":"2.00","type":"C"},{"denomination_id":12,"denomination":"$100","value":"100.00","type":"N"}],"currency":{"code":"CAD","symbol_left":"$","symbol_right":""},"till_id":"","till_name":""}]
     * clock_status : in
     * total_hours : 00:00:00
     */

    @SerializedName("user_id")
    private int userId;
    @SerializedName("user_email")
    private String userEmail;
    @SerializedName("user_mobile")
    private String userMobile;
    @SerializedName("user_pin")
    private String userPin;
    @SerializedName("user_otp")
    private Object userOtp;
    @SerializedName("user_email_verify")
    private int userEmailVerify;
    @SerializedName("user_otp_verify")
    private int userOtpVerify;
    @SerializedName("user_status")
    private int userStatus;
    @SerializedName("user_type")
    private int userType;
    @SerializedName("user_creation_date")
    private String userCreationDate;
    @SerializedName("user_update_date")
    private String userUpdateDate;
    @SerializedName("created_by")
    private int createdBy;
    @SerializedName("deleted_at")
    private Object deletedAt;
    @SerializedName("name")
    private String name;
    @SerializedName("country_name")
    private String countryName;
    @SerializedName("state_name")
    private String stateName;
    @SerializedName("city_name")
    private String cityName;
    @SerializedName("country")
    private int country;
    @SerializedName("state")
    private int state;
    @SerializedName("city")
    private int city;
    @SerializedName("user_image")
    private String userImage;
    @SerializedName("clock_status")
    private String clockStatus;
    @SerializedName("total_hours")
    private String totalHours;
    @SerializedName("user_role")
    private List<String> userRole;
    @SerializedName("stores")
    private List<Stores> stores;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public String getUserPin() {
        return userPin;
    }

    public void setUserPin(String userPin) {
        this.userPin = userPin;
    }

    public Object getUserOtp() {
        return userOtp;
    }

    public void setUserOtp(Object userOtp) {
        this.userOtp = userOtp;
    }

    public int getUserEmailVerify() {
        return userEmailVerify;
    }

    public void setUserEmailVerify(int userEmailVerify) {
        this.userEmailVerify = userEmailVerify;
    }

    public int getUserOtpVerify() {
        return userOtpVerify;
    }

    public void setUserOtpVerify(int userOtpVerify) {
        this.userOtpVerify = userOtpVerify;
    }

    public int getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(int userStatus) {
        this.userStatus = userStatus;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public String getUserCreationDate() {
        return userCreationDate;
    }

    public void setUserCreationDate(String userCreationDate) {
        this.userCreationDate = userCreationDate;
    }

    public String getUserUpdateDate() {
        return userUpdateDate;
    }

    public void setUserUpdateDate(String userUpdateDate) {
        this.userUpdateDate = userUpdateDate;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public Object getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Object deletedAt) {
        this.deletedAt = deletedAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCountry() {
        return country;
    }

    public void setCountry(int country) {
        this.country = country;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getCity() {
        return city;
    }

    public void setCity(int city) {
        this.city = city;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public String getClockStatus() {
        return clockStatus;
    }

    public void setClockStatus(String clockStatus) {
        this.clockStatus = clockStatus;
    }

    public String getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(String totalHours) {
        this.totalHours = totalHours;
    }

    public List<String> getUserRole() {
        return userRole;
    }

    public void setUserRole(List<String> userRole) {
        this.userRole = userRole;
    }

    public List<Stores> getStores() {
        return stores;
    }

    public void setStores(List<Stores> stores) {
        this.stores = stores;
    }
}
