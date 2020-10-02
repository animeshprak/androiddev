package com.client.vikas.rndapp;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface RateAPI {
    @GET("/services/toolservice.svc/GetMortgageSelectorRates")
    Call<RateDetailModel> loadChanges(@QueryMap Map<String, String> params);
}
