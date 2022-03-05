package com.imtiaz.animex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.imtiaz.animex.Activity.DetailsActivity;
import com.imtiaz.animex.Adapter.AnimeXAdapter;
import com.imtiaz.animex.Listeners.OnAnimeClickListener;
import com.imtiaz.animex.Listeners.OnSearchApiListener;
import com.imtiaz.animex.Model.Root;
import com.imtiaz.animex.Retrofit.ApiController;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements OnAnimeClickListener {

    RecyclerView recyclerView;
    AnimeXAdapter adapter;
    ApiController controller;
    ProgressDialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dialog = new ProgressDialog(this);
        recyclerView = findViewById(R.id.recyclerView);
        controller = new ApiController(this);
        controller.AnimeList(listener);

        dialog.setTitle("Wait a minute to fetch");
        dialog.show();

    }
    private final OnSearchApiListener listener = new OnSearchApiListener(){

        @Override
        public void Response(Root response) {
            dialog.dismiss();
            if(response == null){
                Toast.makeText(MainActivity.this, "No Data is Available", Toast.LENGTH_SHORT).show();
                return;
            }
            showResult(response);
        }

        @Override
        public void onError(String message) {
            dialog.dismiss();
            Toast.makeText(MainActivity.this, "An Error has been occurred", Toast.LENGTH_SHORT).show();

        }
    };

    private void showResult(Root response) {
        recyclerView.setHasFixedSize(true);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(3, LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        adapter = new AnimeXAdapter(MainActivity.this,response.getData().getDocuments(),this);
        recyclerView.setAdapter(adapter);
    }



    @Override
    public void OnAnimeClicked(String id) {
        startActivity(new Intent(MainActivity.this, DetailsActivity.class).putExtra("dataId",id));
    }
}