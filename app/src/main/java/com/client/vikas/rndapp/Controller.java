package com.client.vikas.rndapp;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Controller implements Callback<RateDetailModel> {

    static final String BASE_URL = "https://www.nationwide.co.uk";

    public void start() {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        RateAPI gerritAPI = retrofit.create(RateAPI.class);

        Map<String, String> params = new HashMap<>();
        params.put("buyerType", "ftb");
        params.put("loanToValueTier", "90.00");
        params.put("mortgageTerm", "35");
        params.put("mortgageAmount", "0");
        params.put("depositAmount", "50000");
        params.put("additionalBorrowingAmount", "0");
        params.put("propertyValue", "500000");
        params.put("isHelpToBuy", "0");
        params.put("isSaveToBuy", "0");
        params.put("isFdm", "0");
        params.put("mortgageType", "all");
        params.put("dealPeriod", "");
        params.put("productFee", "all");

        Call<RateDetailModel> call = gerritAPI.loadChanges(params);
        call.enqueue(this);

    }

    @Override
    public void onResponse(Call<RateDetailModel> call, Response<RateDetailModel> response) {
        if(response.isSuccessful()) {
            RateDetailModel changesList = response.body();
            System.out.println(changesList);
        } else {
            System.out.println(response.errorBody());
        }
    }

    @Override
    public void onFailure(Call<RateDetailModel> call, Throwable t) {
        t.printStackTrace();
    }
}