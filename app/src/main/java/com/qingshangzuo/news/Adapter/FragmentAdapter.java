package com.qingshangzuo.news.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.qingshangzuo.news.pages.home.home_news.TiYu;
import com.qingshangzuo.news.pages.home.home_news.TouTiao;
import com.qingshangzuo.news.pages.home.home_news.YuLe;


public class FragmentAdapter extends FragmentPagerAdapter {


    private String[] mTitles = new String[]{"头条", "娱乐", "体育"};

    public FragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 1) {
            return new YuLe();
        } else if (position == 2) {
            return new TiYu();
        }
        return new TouTiao();
    }

    @Override
    public int getCount() {
        return mTitles.length;
    }

    //ViewPager与TabLayout绑定后，这里获取到PageTitle就是Tab的Text
    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles[position];
    }
}
