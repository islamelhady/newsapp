package com.elhady.newsapp.Interface;

import com.elhady.newsapp.models.WebSite;

import retrofit2.Call;
import retrofit2.http.GET;

public interface NewsService {

    @GET("v2/sources?language=en")
    Call<WebSite> getSources();
}
