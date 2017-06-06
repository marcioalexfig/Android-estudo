package com.marcioalexfig.blognoticias;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import layout.ConfigFragment;
import layout.NewsFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager vp = (ViewPager) findViewById(R.id.pager);
        vp.setAdapter(new MeuAdapter(getSupportFragmentManager()));
    }

    public class MeuAdapter extends FragmentPagerAdapter    {

        public MeuAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if (position == 0) {
                return new NewsFragment();
            } else {
                return new ConfigFragment();
            }
        }

        @Override
        public int getCount() {
            return 2;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            if (position == 0) {
                return "NOTÍCIAS";
            } else {
                return "CONFIGURAÇÕES";
            }
        }
    }
}
