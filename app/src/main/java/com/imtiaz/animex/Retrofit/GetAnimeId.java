package com.imtiaz.animex.Retrofit;

import com.imtiaz.animex.Model.Document;
import com.imtiaz.animex.Model.Root;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GetAnimeId {

    @GET("anime/{anime_id}")
    Call<Document> getAnimeDetails(
            @Path("anime_id") String anime_id
    );


}
