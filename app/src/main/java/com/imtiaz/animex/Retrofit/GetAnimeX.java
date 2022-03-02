package com.imtiaz.animex.Retrofit;



import com.imtiaz.animex.Model.Root;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetAnimeX {


    @GET("anime")
    Call<Root> getAnimeXs();
}
