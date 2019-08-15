package com.qingshangzuo.news;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MyViewHolder  extends RecyclerView.ViewHolder {

    public View itemView;
    public ImageView newsHeadImg;
    public TextView tvTitle;
    public TextView tvAuthor;
    public TextView tvTime;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        this.itemView = itemView;
        newsHeadImg = itemView.findViewById(R.id.iv_head);
        tvTitle = itemView.findViewById(R.id.tv_title);
        tvAuthor = itemView.findViewById(R.id.tv_author);
        tvTime = itemView.findViewById(R.id.tv_time);
    }
}