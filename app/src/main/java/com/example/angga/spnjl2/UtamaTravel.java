package com.example.angga.spnjl2;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class UtamaTravel extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utama_travel);

        viewPager = (ViewPager)findViewById(R.id.vp);
        tl = (TabLayout)findViewById(R.id.tl);
        MyAdapter adapter = new MyAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        tl.setupWithViewPager(viewPager);
    }


    class MyAdapter extends FragmentStatePagerAdapter {

        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Fragment f = null;
            if(position == 0){
                f = new HomeTravel();
            }if(position == 1){
                f = new Tours();
            }if(position == 2){
                f = new Explore();
            }if(position == 3){
                f = new Flight();
            }

            return f;
        }

        @Override
        public int getCount() {
            return 4;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            String name = null;
            if(position == 0){
                name = "Home";
            }
            if(position == 1){
                name = "Tour";
            }
            if(position == 2){
                name = "Explore";
            }
            if(position == 3){
                name = "Profile";
            }

            return name;
        }
    }
}
