package com.qingshangzuo.news.pages.video;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.qingshangzuo.news.R;

public class VideoActivity extends Fragment {

    private View rootView;
    private TextView tvTag,tvAuthor;
    private ImageView ivVideo;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_video);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.activity_video,container,false);

        initViews();

        return rootView;
    }

    private void initViews() {
        tvTag = rootView.findViewById(R.id.tv_tag);
        tvAuthor = rootView.findViewById(R.id.tv_author);
        ivVideo = rootView.findViewById(R.id.iv_video);

        // 点击跳转到音乐播放器
        ivVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);    //为Intent设置Action属性
                intent.setData(Uri.parse("http://vcloud.diyring.cc/friend/8b017ed12b74783b/53cc718a")); //为Intent设置DATA属性
                startActivity(intent);

            }
        });
    }
}
