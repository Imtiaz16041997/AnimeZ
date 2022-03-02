package com.imtiaz.animex.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.imtiaz.animex.Model.Root;

import java.util.List;

public class DetailsAnimeAdapter extends RecyclerView.Adapter<DetailViewHolder>{
    Context context;
    List<Root> list;

    public DetailsAnimeAdapter(Context context, List<Root> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public DetailViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull DetailViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}


 class DetailViewHolder extends RecyclerView.ViewHolder {
     public DetailViewHolder(@NonNull View itemView) {
         super(itemView);
     }
 }