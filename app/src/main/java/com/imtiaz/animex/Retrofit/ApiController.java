package com.imtiaz.animex.Retrofit;

import android.content.Context;
import android.widget.Toast;

import com.imtiaz.animex.Adapter.AnimeXAdapter;
import com.imtiaz.animex.Listeners.OnDetailsApiListener;
import com.imtiaz.animex.Listeners.OnSearchApiListener;
import com.imtiaz.animex.MainActivity;
import com.imtiaz.animex.Model.Document;
import com.imtiaz.animex.Model.Root;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
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

    public GetAnimeId getAnimeXId(){
        return retrofit.create(GetAnimeId.class);
    }

    public void AnimeList(OnSearchApiListener listener){
        Call<Root> call = ApiController
                .getInstance()
                .getAnimeXApi().getAnimeXs();

        call.enqueue(new Callback<Root>() {
            @Override
            public void onResponse(Call<Root> call, Response<Root> response) {
                if(!response.isSuccessful()){
                    Toast.makeText(mContext, "couldn't fetch data!!!", Toast.LENGTH_SHORT).show();
                    return;
                }
                listener.Response(response.body());
            }

            @Override
            public void onFailure(Call<Root> call, Throwable t) {
                listener.onError(t.getMessage());
            }
        });
    }

    //details

    public  void AnimeDetails(OnDetailsApiListener listener, String anime_id){
        Call<Document> call = ApiController
                .getInstance()
                .getAnimeXId().getAnimeDetails(anime_id);


        call.enqueue(new Callback<Document>() {
            @Override
            public void onResponse(Call<Document> call, Response<Document> response) {
//                anime = response.body();
//                showResults();
                if(!response.isSuccessful()){
                    Toast.makeText(mContext, "couldn't fetch data!!!", Toast.LENGTH_SHORT).show();
                    return;
                }
                listener.onResponse(response.body());
            }

            @Override
            public void onFailure(Call<Document> call, Throwable t) {
                listener.onError(t.getMessage());
            }
        });
    }




}
