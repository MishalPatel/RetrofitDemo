package com.alchemy.admin.retrofitapp.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Stores {
    /**
     * store_id : 49
     * name : Baked Potato Dispensary
     * chain_id : 12
     * age_limit : 19
     * carrying_limit : 30
     * latitude : 49.27780250
     * longitude : -123.11001900
     * is_store_manager : 1
     * tax_type : GST + PST
     * provincial_rate : 7.00
     * country_rate : 5.00
     * role : Chain Manager
     * currency_denomination : [{"denomination_id":8,"denomination":"$5","value":"5.00","type":"N"},{"denomination_id":9,"denomination":"$10","value":"10.00","type":"N"},{"denomination_id":10,"denomination":"$20","value":"20.00","type":"N"},{"denomination_id":11,"denomination":"$50","value":"50.00","type":"N"},{"denomination_id":2,"denomination":"5¢","value":"0.05","type":"C"},{"denomination_id":3,"denomination":"10¢","value":"0.10","type":"C"},{"denomination_id":4,"denomination":"25¢","value":"0.25","type":"C"},{"denomination_id":6,"denomination":"$1","value":"1.00","type":"C"},{"denomination_id":7,"denomination":"$2","value":"2.00","type":"C"},{"denomination_id":12,"denomination":"$100","value":"100.00","type":"N"}]
     * currency : {"code":"CAD","symbol_left":"$","symbol_right":""}
     * till_id : 172
     * till_name : Baked Potato 2
     */

    @SerializedName("store_id")
    private int storeId;
    @SerializedName("name")
    private String name;
    @SerializedName("chain_id")
    private int chainId;
    @SerializedName("age_limit")
    private int ageLimit;
    @SerializedName("carrying_limit")
    private int carryingLimit;
    @SerializedName("latitude")
    private String latitude;
    @SerializedName("longitude")
    private String longitude;
    @SerializedName("is_store_manager")
    private int isStoreManager;
    @SerializedName("tax_type")
    private String taxType;
    @SerializedName("provincial_rate")
    private String provincialRate;
    @SerializedName("country_rate")
    private String countryRate;
    @SerializedName("role")
    private String role;
    @SerializedName("currency")
    private Currency currency;
    @SerializedName("till_id")
    private int tillId;
    @SerializedName("till_name")
    private String tillName;
    @SerializedName("currency_denomination")
    private List<CurrencyDenomination> currencyDenomination;

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChainId() {
        return chainId;
    }

    public void setChainId(int chainId) {
        this.chainId = chainId;
    }

    public int getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(int ageLimit) {
        this.ageLimit = ageLimit;
    }

    public int getCarryingLimit() {
        return carryingLimit;
    }

    public void setCarryingLimit(int carryingLimit) {
        this.carryingLimit = carryingLimit;
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

    public int getIsStoreManager() {
        return isStoreManager;
    }

    public void setIsStoreManager(int isStoreManager) {
        this.isStoreManager = isStoreManager;
    }

    public String getTaxType() {
        return taxType;
    }

    public void setTaxType(String taxType) {
        this.taxType = taxType;
    }

    public String getProvincialRate() {
        return provincialRate;
    }

    public void setProvincialRate(String provincialRate) {
        this.provincialRate = provincialRate;
    }

    public String getCountryRate() {
        return countryRate;
    }

    public void setCountryRate(String countryRate) {
        this.countryRate = countryRate;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public int getTillId() {
        return tillId;
    }

    public void setTillId(int tillId) {
        this.tillId = tillId;
    }

    public String getTillName() {
        return tillName;
    }

    public void setTillName(String tillName) {
        this.tillName = tillName;
    }

    public List<CurrencyDenomination> getCurrencyDenomination() {
        return currencyDenomination;
    }

    public void setCurrencyDenomination(List<CurrencyDenomination> currencyDenomination) {
        this.currencyDenomination = currencyDenomination;
    }
}
