package com.example.bookswap;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class BookInfoAdapter extends RecyclerView.Adapter<BookInfoAdapter.InfoViewHolder> {

    private Context context;
    private List<Info> InfoList;

    public BookInfoAdapter(Context context, List<Info> InfoList){
        this.context = context;
        this.InfoList = InfoList;
    }

    @NonNull
    @Override
    public BookInfoAdapter.InfoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_feed,parent,false);
        return  new InfoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BookInfoAdapter.InfoViewHolder holder, int position) {
        Info info = InfoList.get(position);
        holder.textView.setText(info.getName());

        Glide.with(context).load(info.getImageUrl1()).circleCrop().into(holder.img1);
        Glide.with(context).load(info.getImageurl2()).into(holder.img2);

    }

    @Override
    public int getItemCount() {
        return InfoList.size();
    }

    public  static class InfoViewHolder extends  RecyclerView.ViewHolder{
        TextView textView;
        ImageView img1;
        ImageView img2;

        public  InfoViewHolder(@NonNull View itemView){
            super(itemView);

            textView = itemView.findViewById(R.id.username);
            img1 = itemView.findViewById(R.id.profile_image);
            img2 = itemView.findViewById(R.id.main_image);

        }
    }
}
