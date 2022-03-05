package com.imtiaz.animex.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.imtiaz.animex.Listeners.OnAnimeClickListener;
import com.imtiaz.animex.Model.Document;

import com.imtiaz.animex.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class AnimeXAdapter extends RecyclerView.Adapter<AnimeXViewHolder> {
    Context context;
    List<Document> animeX;
    OnAnimeClickListener listener;

//    public AnimeXAdapter(Context context, List<Document> animeX) {
//        this.context = context;
//        this.animeX = animeX;
//    }


    public AnimeXAdapter(Context context, List<Document> animeX, OnAnimeClickListener listener) {
        this.context = context;
        this.animeX = animeX;
        this.listener = listener;
    }

    @NonNull
    @Override
    public AnimeXViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_item,parent,false);
        return new AnimeXViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimeXViewHolder holder, int position) {
            holder.textView_MovieName.setText(animeX.get(position).getTitles().getEn());
            holder.textView_MovieName.setSelected(true);
            try{
                Picasso.get().load(animeX.get(position).getCover_image()).into(holder.imageView_MoviePoster);

            }catch(Exception e){
                e.printStackTrace();
            }


    }

    @Override
    public int getItemCount() {
        return animeX.size();
    }
}

    class AnimeXViewHolder extends RecyclerView.ViewHolder{
        TextView textView_MovieName;
        ImageView imageView_MoviePoster;
        CardView index_container;

        public AnimeXViewHolder(@NonNull View itemView) {
            super(itemView);
            textView_MovieName = itemView.findViewById(R.id.textView_MovieName);
            imageView_MoviePoster = itemView.findViewById(R.id.imageView_MoviePoster);
            index_container = itemView.findViewById(R.id.index_container);

        }
    }

