package com.imtiaz.animex.Retrofit;

import android.content.Context;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiController {

    Context mContext;
    private static final  String baseUrl = "https://api.aniapi.com/v1/";
    private static ApiController controller;
    private static Retrofit retrofit;

    public ApiController(Context mContext){
        this.mContext = mContext;
    }

    ApiController(){
        //Retrofit Object Creation
        retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static synchronized  ApiController getInstance() {
        if(controller == null){
            controller = new ApiController();
        }
        return controller;
    }

    public GetAnimeX getAnimeXApi(){
        return retrofit.create(GetAnimeX.class);
    }

//    public GetAnimeId getAnimeXId(){
//        return retrofit.create(GetAnimeId.class);
//    }




}
