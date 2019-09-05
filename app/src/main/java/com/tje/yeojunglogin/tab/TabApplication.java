package com.tje.yeojunglogin.tab;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;


import com.tje.yeojunglogin.Login_dialog;
import com.tje.yeojunglogin.R;
import com.tje.yeojunglogin.fragment.FragLogin;

import java.util.ArrayList;

public class TabApplication extends FragmentActivity {

    ViewPager vp_tab;


    private ImageView btn_home;
    private ImageView btn_1;
    private ImageView btn_2;
    private ImageView btn_3;
    private ImageView btn_4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);


        btn_home = findViewById(R.id.btn_home);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);

        vp_tab = findViewById(R.id.vp_tab);

        pagerAdapter pager = new pagerAdapter(getSupportFragmentManager());
        vp_tab.setAdapter(pager);
        vp_tab.setCurrentItem(0);

        btn_home.setOnClickListener(movePageListener);
        btn_home.setTag(0);
        btn_1.setOnClickListener(movePageListener);
        btn_1.setTag(1);
        btn_2.setOnClickListener(movePageListener);
        btn_2.setTag(2);
        btn_3.setOnClickListener(movePageListener);
        btn_3.setTag(2);
        btn_4.setOnClickListener(movePageListener);
        btn_4.setTag(2);



    }

    View.OnClickListener movePageListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int tag = (int) v.getTag();
            vp_tab.setCurrentItem(tag);
        }
    };

    private class pagerAdapter extends FragmentStatePagerAdapter {


        public pagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch(position)
            {
                case 0:
//                    return new Login_dialog();
                case 1:
//                    return new Login_dialog();
                case 2:
//                    return new Login_dialog();
                case 3:
//                    return new Login_dialog();
                case 4:
//                    return new Login_dialog();

                default:
                    return null;
            }


        }

        @Override
        public int getCount() {
            return 5;
        }

    }


}
