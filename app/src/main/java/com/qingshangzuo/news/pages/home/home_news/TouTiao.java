package com.qingshangzuo.news.pages.home.home_news;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.qingshangzuo.news.MyViewHolder;
import com.qingshangzuo.news.NewsData;
import com.qingshangzuo.news.R;
import com.qingshangzuo.news.ViewNewsActivity;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class TouTiao extends Fragment {

    private View rootView;

    private String topUrl = "http://v.juhe.cn/toutiao/index?type=top&key=78971bf055a3d6770a3a5e8fe3acf9ab";

    private RecyclerView recyclerView;
    private MyAdapter adapter;
    private NewsData newsData;
    private Handler handler;
    private SwipeRefreshLayout swipeRefreshLayout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.tou_tiao);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.tou_tiao, container, false);

        initHandler();
        initViews();
        getDataFromApi();

        return rootView;
    }

    private void getDataFromApi() {
        OkHttpClient client = new OkHttpClient();
        final Request request = new Request.Builder().url(topUrl).build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.e("MainActivity", "请求失败");
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String newsDataJsonStr = response.body().string();
                Log.e("MainActivity", "newsDataJsonStr = " + newsDataJsonStr);
                newsData = new Gson().fromJson(newsDataJsonStr, NewsData.class);
                handler.sendEmptyMessage(1001);
            }
        });
    }

    private void initHandler() {
        handler = new Handler(new Handler.Callback() {
            @Override
            public boolean handleMessage(Message msg) {
                Log.e("MainActivity", "handleMessage");
                adapter.changeData(newsData);
                return false;
            }
        });
    }

    private void initViews() {


        recyclerView = rootView.findViewById(R.id.list_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);
        adapter = new MyAdapter(getActivity(), newsData);
        recyclerView.setAdapter(adapter);

        //添加下拉刷新  (如果没有内容显示出来，可以把这行代码以及下一行同时去掉；这样可能就可以了)
        swipeRefreshLayout = rootView.findViewById(R.id.refresh_layout);
        final Runnable runnable = new Runnable() {
            @Override
            public void run() {
                adapter = new MyAdapter(getActivity(), newsData);
                recyclerView.setAdapter(adapter);
            }
        };

        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                swipeRefreshLayout.setRefreshing(true);
              //  serviceCardLayout.removeAllViews();
                new Thread(runnable).run();
                swipeRefreshLayout.setRefreshing(false);
            }
        });

        new Thread(runnable).start();

    }
}

/**
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
