package com.elhady.newsapp.common;

import com.elhady.newsapp.Interface.NewsService;
import com.elhady.newsapp.remote.RetrofitClient;

public class Common {
    private static final String BASE_URL = "https://newsapi.org/";
    public static final String API_KEY = "e4befc80710444afa7f93f67a5790d57";

    public static NewsService getNewsService() {
        return RetrofitClient.getClient(BASE_URL).create(NewsService.class);
    }
}
