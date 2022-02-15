package com.example.homework2.network;



import com.example.homework2.model.PixabayResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PixabayApi {
    @GET("/api")
    Call<PixabayResponse> getImages(@Query("key") String key, @Query("q") String keyWord);

}
