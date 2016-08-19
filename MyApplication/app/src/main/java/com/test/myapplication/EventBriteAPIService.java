package com.test.myapplication;

import com.test.myapplication.Models.FreeEventsModel.FreeEventsObject;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/**
 * Created by NehaRege on 8/18/16.
 */
public interface EventBriteAPIService {

    /**
     *  Free Events
     *
     *  URL: https://www.eventbriteapi.com/v3/events/?token=AMDMMKWPWFPOCAUYVIW2&price=free
     *
     *
     *
     */

    @GET("v3/events/")
    Call<FreeEventsObject> getAllFreeEvents(
            @Query("free") String free,
            @Header("MYTOKEN") String token);



//    //For trending news
//    @GET("trendingtopics")
//    Call<TrendingTopicsObject> getTrendingTopics(@Header("Ocp-Apim-Subscription-Key") String apiKey);
//
//
//    @GET("news")
//    Call<CategoryNewsObject> getSpecificTopicArticles(
//            @Query("category") String categoryName, @Header("Ocp-Apim-Subscription-Key") String apiKey);
//
//
//    @GET("search?")
//    Call<SearchNewsObject> getArticlesBasedOnSearchQuery(
//            @Query("q") String searchQuery, @Header("Ocp-Apim-Subscription-Key") String apiKey);
//



}
