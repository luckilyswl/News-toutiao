package com.qingshangzuo.news.pages.home;

import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.gson.Gson;
import com.qingshangzuo.news.Adapter.FragmentAdapter;
import com.qingshangzuo.news.Adapter.MyAdapter;
import com.qingshangzuo.news.MainActivity;
import com.qingshangzuo.news.NewsData;
import com.qingshangzuo.news.R;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class HomeActivity extends Fragment {

    private View rootView;
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private FragmentAdapter Adapter;

    private TabLayout.Tab TouTiao;
    private TabLayout.Tab TiYu;
    private TabLayout.Tab YuLe;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_home);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.activity_home,container,false);

        initViews();

        return rootView;
    }




    private void initViews() {
        //使用适配器将ViewPager与Fragment绑定在一起
        mViewPager=  rootView.findViewById(R.id.viewPager);
        Adapter = new FragmentAdapter(getChildFragmentManager());
        mViewPager.setAdapter(Adapter);

        //将TabLayout与ViewPager绑定在一起
        mTabLayout = rootView.findViewById(R.id.tabLayout);
        mTabLayout.setupWithViewPager(mViewPager);

        //指定Tab的位置
        TouTiao = mTabLayout.getTabAt(0);
        YuLe= mTabLayout.getTabAt(1);
        TiYu = mTabLayout.getTabAt(2);

    }
}
