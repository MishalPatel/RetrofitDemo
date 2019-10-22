package com.alchemy.admin.retrofitapp.model;

import com.google.gson.annotations.SerializedName;

public class Currency {
    /**
     * code : CAD
     * symbol_left : $
     * symbol_right :
     */

    @SerializedName("code")
    private String code;
    @SerializedName("symbol_left")
    private String symbolLeft;
    @SerializedName("symbol_right")
    private String symbolRight;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSymbolLeft() {
        return symbolLeft;
    }

    public void setSymbolLeft(String symbolLeft) {
        this.symbolLeft = symbolLeft;
    }

    public String getSymbolRight() {
        return symbolRight;
    }

    public void setSymbolRight(String symbolRight) {
        this.symbolRight = symbolRight;
    }
}
