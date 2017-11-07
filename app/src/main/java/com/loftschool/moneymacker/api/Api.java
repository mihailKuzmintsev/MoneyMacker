package com.loftschool.moneymacker.api;


import com.loftschool.moneymacker.Item;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {

    @GET("items")
    Call<List<Item>> items(@Query("type") String type);
}
