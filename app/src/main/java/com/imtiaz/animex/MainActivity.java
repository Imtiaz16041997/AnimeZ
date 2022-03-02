package com.imtiaz.animex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.os.Bundle;

import com.imtiaz.animex.Activity.DetailsActivity;
import com.imtiaz.animex.Adapter.AnimeXAdapter;
import com.imtiaz.animex.Listeners.OnAnimeClickListener;
import com.imtiaz.animex.Model.Root;
import com.imtiaz.animex.Retrofit.ApiController;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements OnAnimeClickListener {

    RecyclerView recyclerView;
    AnimeXAdapter adapter;
    Root anime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(3, LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);

        animeProcess();

    }

    private void animeProcess() {
        Call<Root> call = ApiController
                                    .getInstance()
                                    .getAnimeXApi().getAnimeXs();

        call.enqueue(new Callback<Root>() {
            @Override
            public void onResponse(Call<Root> call, Response<Root> response) {
                anime = response.body();
                adapter = new AnimeXAdapter(MainActivity.this,anime.getData().getDocuments());
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<Root> call, Throwable t) {

            }
        });

    }


    @Override
    public void OnAnimeClicked(String id) {
        startActivity(new Intent(MainActivity.this, DetailsActivity.class).putExtra("dataId",id));
    }
}