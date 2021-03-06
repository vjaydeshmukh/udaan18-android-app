package com.udaan18.udaan18.android.util;


import com.udaan18.udaan18.android.model.eventCategory.Category;
import com.udaan18.udaan18.android.model.eventCategory.Container;
import com.udaan18.udaan18.android.model.eventCategory.Developer;
import com.udaan18.udaan18.android.model.eventCategory.Feed;
import com.udaan18.udaan18.android.model.eventCategory.Filters;
import com.udaan18.udaan18.android.model.eventCategory.VersionCheck;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by jack on 27-02-2018.
 */

public interface ApiHelper {
    String BASE_URL = "https://raw.githubusercontent.com/bvmites/udaan18-android-app/master/mock-api/";

    @GET("event.json")
    Call<Container> getEvents();

    @GET("developer.json")
    Call<List<Developer>> getDevelopers();

    @GET("newteamudaan.json")
    Call<List<Category>> getCategory();

    @GET("version.json")
    Call<VersionCheck> getVersion();

    @GET("feed.json")
    Call<List<Feed>> getFeed();

    @GET("filters.json")
    Call<List<Filters>> getFilters();
}
