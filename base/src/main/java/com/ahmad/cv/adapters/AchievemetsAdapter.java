package com.ahmad.cv.adapters;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.ahmad.cv.base.R;

public class AchievemetsAdapter extends RecyclerView.Adapter<AchievemetsAdapter.booksViewHolder> {

    private String[] name;
    public AchievemetsAdapter(String[] data) {
        name=data;
    }

    @Override
    public booksViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.achievements,parent,false);


        return new booksViewHolder(view);
    }

    @Override
    public void onBindViewHolder( booksViewHolder holder, int position) {
        String title =name[position];

        //AchievemetsAdapter.booksViewHolder demoItemHolder = (AchievemetsAdapter.booksViewHolder) holder;
        holder.textView.setText(title);
    }

    @Override
    public int getItemCount() {
        return name.length;
    }

    public class booksViewHolder extends RecyclerView.ViewHolder
    {
        TextView textView;
        ImageView img;
        public booksViewHolder(View itemView) {
            super(itemView);
            textView=(TextView)itemView.findViewById(R.id.achiev_text);
            img=(ImageView)itemView.findViewById(R.id.achiev_img);
        }
    }

}
