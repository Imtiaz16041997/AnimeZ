package com.imtiaz.animex.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.imtiaz.animex.Adapter.AnimeXAdapter;
import com.imtiaz.animex.MainActivity;
import com.imtiaz.animex.Model.Root;
import com.imtiaz.animex.R;
import com.imtiaz.animex.Retrofit.ApiController;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DetailsActivity extends AppCompatActivity {
    ImageView coverImage,posterId;
    TextView textView_Title,textView_Duration,textView_Episode,textView_Year,textView_Description,textView_Genre;
    ProgressDialog dialog;
    Root anime;
    String anime_id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
//        coverImage = findViewById(R.id.coverImage);
//        posterId = findViewById(R.id.posterId);
//        coverImage = findViewById(R.id.coverImage);
//        textView_Title = findViewById(R.id.textView_Title);
//        textView_Duration = findViewById(R.id.textView_Duration);
//        textView_Episode = findViewById(R.id.textView_Episode);
//        textView_Year = findViewById(R.id.textView_Year);
//        textView_Description = findViewById(R.id.textView_Description);
//        textView_Genre = findViewById(R.id.textView_Genre);
//
//        //retrieve the data here
//        String anime_id = getIntent().getStringExtra("dataId");
//
//        dialog = new ProgressDialog(this);
//        dialog.setTitle("Wait a moment");
//        dialog.show();
//
//        animeIdDetails(anime_id);
//
//    }
//
//    private void animeIdDetails(String anime_id) {
//        Call<Root> call = ApiController
//                .getInstance()
//                .getAnimeXId().getAnimeDetails(anime_id);
//
//        call.enqueue(new Callback<Root>() {
//            @Override
//            public void onResponse(Call<Root> call, Response<Root> response) {
//                anime = response.body();
//                showResults();
//            }
//
//            @Override
//            public void onFailure(Call<Root> call, Throwable t) {
//
//            }
//        });
//
//
//    }
//
//    private void showResults() {
//
    }
}