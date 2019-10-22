package com.alchemy.admin.retrofitapp.model;

import com.google.gson.annotations.SerializedName;

public class CurrencyDenomination {
    /**
     * denomination_id : 8
     * denomination : $5
     * value : 5.00
     * type : N
     */

    @SerializedName("denomination_id")
    private int denominationId;
    @SerializedName("denomination")
    private String denomination;
    @SerializedName("value")
    private String value;
    @SerializedName("type")
    private String type;

    public int getDenominationId() {
        return denominationId;
    }

    public void setDenominationId(int denominationId) {
        this.denominationId = denominationId;
    }

    public String getDenomination() {
        return denomination;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
