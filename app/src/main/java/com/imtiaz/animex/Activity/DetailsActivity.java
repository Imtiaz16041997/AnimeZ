package com.imtiaz.animex.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.imtiaz.animex.Adapter.AnimeXAdapter;
import com.imtiaz.animex.Listeners.OnDetailsApiListener;
import com.imtiaz.animex.MainActivity;
import com.imtiaz.animex.Model.Document;
import com.imtiaz.animex.Model.Root;
import com.imtiaz.animex.R;
import com.imtiaz.animex.Retrofit.ApiController;
import com.squareup.picasso.Picasso;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DetailsActivity extends AppCompatActivity {
    ImageView coverImage,bannerImage;
    TextView textView_Title,textView_Duration,textView_Episode,textView_Year,textView_Description,textView_Genre;
    ProgressDialog dialog;
    ApiController apiController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        bannerImage = findViewById(R.id.bannerImage);
        coverImage = findViewById(R.id.coverImage);
        textView_Title = findViewById(R.id.textView_Title);
        textView_Duration = findViewById(R.id.textView_Duration);
        textView_Episode = findViewById(R.id.textView_Episode);
        textView_Year = findViewById(R.id.textView_Year);
        textView_Description = findViewById(R.id.textView_Description);
        textView_Genre = findViewById(R.id.textView_Genre);


        apiController = new ApiController(this);

//        //retrieve the data here
        String anime_id = getIntent().getStringExtra("dataId");
        dialog = new ProgressDialog(this);
        dialog.setTitle("Wait a moment");
        dialog.show();


        apiController.AnimeDetails(listener,anime_id);

    }

    private final OnDetailsApiListener listener = new OnDetailsApiListener() {
        @Override
        public void onResponse(Document response) {
            if(response == null){
                Toast.makeText(DetailsActivity.this, "Error response!!!", Toast.LENGTH_SHORT).show();
                return;
            }
            showResults(response);
        }

        @Override
        public void onError(String message) {
            dialog.dismiss();
            Toast.makeText(DetailsActivity.this, "Error!!", Toast.LENGTH_SHORT).show();
        }
    };

    private void showResults(Document response) {
        textView_Title.setText(response.getTitles().getEn());
//        textView_Title.setText(String.valueOf(response.getMal_id()));
        textView_Episode.setText(response.getEpisodes_count());
        textView_Year.setText(String.valueOf(response.getSeason_period()));
        textView_Duration.setText(response.getEpisode_duration());
        textView_Description.setText((CharSequence) response.getDescriptions());
        textView_Genre.setText((CharSequence) response.getGenres());

        try{
//            Picasso.get().load(response.getCover_image()).into(coverImage);
            Picasso.get().load(response.getBanner_image()).into(bannerImage);
        }catch(Exception e){
            e.printStackTrace();
        }


    }
}



