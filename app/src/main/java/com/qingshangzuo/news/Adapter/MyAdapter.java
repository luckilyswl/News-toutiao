package com.qingshangzuo.news.Adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.qingshangzuo.news.MyViewHolder;
import com.qingshangzuo.news.NewsData;
import com.qingshangzuo.news.R;
import com.qingshangzuo.news.ViewNewsActivity;

public /**
 * 适配器
 */
class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private NewsData newsData;
    private Context context;

    //构造方法
    public MyAdapter(Context context, NewsData newsData) {
        this.context = context;
        this.newsData = newsData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.news_list_item, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final NewsData.ResultBean.DataBean dataBean = newsData.getResult().getData().get(position);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(context, ViewNewsActivity.class);
                intent.putExtra("NEWS_URL", dataBean.getUrl());
                context.startActivity(intent);
            }
        });

        holder.tvTitle.setText(dataBean.getTitle());
        holder.tvAuthor.setText(dataBean.getAuthor_name());
        holder.tvTime.setText(dataBean.getDate());
        Glide.with(context).load(Uri.parse(dataBean.getThumbnail_pic_s())).into(holder.newsHeadImg);
    }

    @Override
    public int getItemCount() {

        if (newsData == null) {
            return 0;
        }

        if (newsData.getResult() == null) {
            return 0;
        }

        if (newsData.getResult().getData() == null) {
            return 0;
        }

        int count = newsData.getResult().getData().size();

        Log.e("MyAdapter", "count = " + count);

        return count;
    }

    public void changeData(NewsData newsData) {
        Log.e("MyAdapter", "changData ");
        this.newsData = newsData;
        notifyDataSetChanged();
    }
}
