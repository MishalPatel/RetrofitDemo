package com.alchemy.admin.retrofitapp.centmodel;

import com.google.gson.annotations.SerializedName;

public class Orders {
    /**
     * patient_full_name : -
     * phone : null
     * patient_id : null
     * order_id : 8364
     * order_pub_id : CEN29B4ED18C549E
     * redeem_amount : null
     * delivery_charge : null
     * service_fee : 0.00
     * delivery_status : 4
     * order_placed : 2019-02-18 06:21:04
     * total_items : 1
     * order_platform : self-checkout
     * check_status : unseen
     * reschedule_count : 0
     * pickup_time : null
     * total_bill : 2.79
     * delivery_status_text : CANCELLED
     * order_status_text : SELF CHECKOUT
     * reschedule : 0
     * latitude : 49.26437070
     * longitude : -123.17474010
     * store_id : 53
     * store_name : Chronic Hub
     * chain_name : Chronic Hub
     * payment_mode :
     * order_placed_by : Lucas Allen
     * city_id : 80
     * city_name : Vancouver
     * state_id : 3
     * state_name : British Columbia
     * country_id : 1
     * country_name : Canada
     */

    @SerializedName("patient_full_name")
    private String patientFullName;
    @SerializedName("phone")
    private Object phone;
    @SerializedName("patient_id")
    private Object patientId;
    @SerializedName("order_id")
    private int orderId;
    @SerializedName("order_pub_id")
    private String orderPubId;
    @SerializedName("redeem_amount")
    private Object redeemAmount;
    @SerializedName("delivery_charge")
    private Object deliveryCharge;
    @SerializedName("service_fee")
    private String serviceFee;
    @SerializedName("delivery_status")
    private int deliveryStatus;
    @SerializedName("order_placed")
    private String orderPlaced;
    @SerializedName("total_items")
    private int totalItems;
    @SerializedName("order_platform")
    private String orderPlatform;
    @SerializedName("check_status")
    private String checkStatus;
    @SerializedName("reschedule_count")
    private int rescheduleCount;
    @SerializedName("pickup_time")
    private Object pickupTime;
    @SerializedName("total_bill")
    private String totalBill;
    @SerializedName("delivery_status_text")
    private String deliveryStatusText;
    @SerializedName("order_status_text")
    private String orderStatusText;
    @SerializedName("reschedule")
    private int reschedule;
    @SerializedName("latitude")
    private String latitude;
    @SerializedName("longitude")
    private String longitude;
    @SerializedName("store_id")
    private int storeId;
    @SerializedName("store_name")
    private String storeName;
    @SerializedName("chain_name")
    private String chainName;
    @SerializedName("payment_mode")
    private String paymentMode;
    @SerializedName("order_placed_by")
    private String orderPlacedBy;
    @SerializedName("city_id")
    private int cityId;
    @SerializedName("city_name")
    private String cityName;
    @SerializedName("state_id")
    private int stateId;
    @SerializedName("state_name")
    private String stateName;
    @SerializedName("country_id")
    private int countryId;
    @SerializedName("country_name")
    private String countryName;

    public String getPatientFullName() {
        return patientFullName;
    }

    public void setPatientFullName(String patientFullName) {
        this.patientFullName = patientFullName;
    }

    public Object getPhone() {
        return phone;
    }

    public void setPhone(Object phone) {
        this.phone = phone;
    }

    public Object getPatientId() {
        return patientId;
    }

    public void setPatientId(Object patientId) {
        this.patientId = patientId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderPubId() {
        return orderPubId;
    }

    public void setOrderPubId(String orderPubId) {
        this.orderPubId = orderPubId;
    }

    public Object getRedeemAmount() {
        return redeemAmount;
    }

    public void setRedeemAmount(Object redeemAmount) {
        this.redeemAmount = redeemAmount;
    }

    public Object getDeliveryCharge() {
        return deliveryCharge;
    }

    public void setDeliveryCharge(Object deliveryCharge) {
        this.deliveryCharge = deliveryCharge;
    }

    public String getServiceFee() {
        return serviceFee;
    }

    public void setServiceFee(String serviceFee) {
        this.serviceFee = serviceFee;
    }

    public int getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(int deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public String getOrderPlaced() {
        return orderPlaced;
    }

    public void setOrderPlaced(String orderPlaced) {
        this.orderPlaced = orderPlaced;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    public String getOrderPlatform() {
        return orderPlatform;
    }

    public void setOrderPlatform(String orderPlatform) {
        this.orderPlatform = orderPlatform;
    }

    public String getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(String checkStatus) {
        this.checkStatus = checkStatus;
    }

    public int getRescheduleCount() {
        return rescheduleCount;
    }

    public void setRescheduleCount(int rescheduleCount) {
        this.rescheduleCount = rescheduleCount;
    }

    public Object getPickupTime() {
        return pickupTime;
    }

    public void setPickupTime(Object pickupTime) {
        this.pickupTime = pickupTime;
    }

    public String getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(String totalBill) {
        this.totalBill = totalBill;
    }

    public String getDeliveryStatusText() {
        return deliveryStatusText;
    }

    public void setDeliveryStatusText(String deliveryStatusText) {
        this.deliveryStatusText = deliveryStatusText;
    }

    public String getOrderStatusText() {
        return orderStatusText;
    }

    public void setOrderStatusText(String orderStatusText) {
        this.orderStatusText = orderStatusText;
    }

    public int getReschedule() {
        return reschedule;
    }

    public void setReschedule(int reschedule) {
        this.reschedule = reschedule;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getChainName() {
        return chainName;
    }

    public void setChainName(String chainName) {
        this.chainName = chainName;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getOrderPlacedBy() {
        return orderPlacedBy;
    }

    public void setOrderPlacedBy(String orderPlacedBy) {
        this.orderPlacedBy = orderPlacedBy;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getStateId() {
        return stateId;
    }

    public void setStateId(int stateId) {
        this.stateId = stateId;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
