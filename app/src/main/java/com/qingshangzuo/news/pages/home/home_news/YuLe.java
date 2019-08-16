package com.qingshangzuo.news.pages.home.home_news;

import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.Gson;
import com.qingshangzuo.news.NewsData;
import com.qingshangzuo.news.R;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class YuLe extends Fragment {

    private View rootView;

    private String yuleUrl = "http://v.juhe.cn/toutiao/index?type=yule&key=70369781e35bbc580f7df44a1c2f1b43";

    private RecyclerView recyclerView;
    private MyAdapter adapter;
    private NewsData newsData;
    private Handler handler;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.yu_le);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.yu_le,container,false);

        initHandler();
        initViews();
        getDataFromApi();

        return rootView;
    }

    private void getDataFromApi() {
        OkHttpClient client = new OkHttpClient();
        final Request request = new Request.Builder().url(yuleUrl).build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.e("MainActivity","请求失败");
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String newsDataJsonStr = response.body().string();
                Log.e("MainActivity","newsDataJsonStr = " + newsDataJsonStr);
                newsData = new Gson().fromJson(newsDataJsonStr, NewsData.class);
                handler.sendEmptyMessage(1001);
            }
        });
    }

    private void initHandler() {
        handler = new Handler(new Handler.Callback() {
            @Override
            public boolean handleMessage(Message msg) {
                Log.e("MainActivity","handleMessage");
                adapter.changeData(newsData);
                return false;
            }
        });
    }

    private void initViews() {


        recyclerView = rootView.findViewById(R.id.list_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);
        adapter = new MyAdapter(getActivity(),newsData);
        recyclerView.setAdapter(adapter);
    }
}

