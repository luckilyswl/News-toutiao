package com.qingshangzuo.news;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class ViewNewsActivity extends Fragment {

    private View rootView;
    private String newsUrl;
    private WebView webView;
    private EditText edtComment;
    private Button btnComment;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_view_news);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.activity_view_news,container,false);

        initViews();

        return rootView;
    }

    private void initViews() {
        //newsUrl = getIntent().getStringExtra("NEWS_URL");

        webView = rootView.findViewById(R.id.wv_news);
        webView.loadUrl(newsUrl);
    }
}
