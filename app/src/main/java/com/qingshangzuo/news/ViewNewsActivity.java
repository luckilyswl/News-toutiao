package com.qingshangzuo.news;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

import com.qingshangzuo.news.pages.mine.LoginActivity;

import cn.bmob.v3.BmobUser;

public class ViewNewsActivity extends AppCompatActivity {

    private String newsUrl;
    private WebView webView;
    private EditText edtComment;
    private Button btnComment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_news);

        initViews();

        initCommentViews();
    }

    private void initViews() {
        //newsUrl =
        //Intent intent = getActivity().getIntent();
        newsUrl = getIntent().getStringExtra("NEWS_URL");

        webView = findViewById(R.id.wv_news);
        webView.loadUrl(newsUrl);
    }

    private void initCommentViews() {
        edtComment = findViewById(R.id.edt_comment);
        btnComment = findViewById(R.id.btn_comment);

        btnComment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(! BmobUser.isLogin()){
                    Intent intent = new Intent();
                    intent.setClass(ViewNewsActivity.this, LoginActivity.class);
                    startActivity(intent);
                }

                 /*if(BmobUser.getCurrentUser() == null){
                    Intent intent = new Intent();
                    intent.setClass(ViewNewsActivity.this, LoginActivity.class);
                    startActivity(intent);
                }*/
            }
        });
    }
}
