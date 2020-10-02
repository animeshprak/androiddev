package com.client.vikas.rndapp;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RateDetailModel {

    @SerializedName("Rates")
    @Expose
    private List<RateModel> rates = null;
    @SerializedName("RequestDate")
    @Expose
    private String requestDate;
    @SerializedName("ResultCount")
    @Expose
    private Integer resultCount;

    public List<RateModel> getRates() {
        return rates;
    }

    public void setRates(List<RateModel> rates) {
        this.rates = rates;
    }

    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }

    public Integer getResultCount() {
        return resultCount;
    }

    public void setResultCount(Integer resultCount) {
        this.resultCount = resultCount;
    }

}
