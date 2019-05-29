package com.example.cricfan;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Frag1 demoFragment1=new Frag1();
        Frag2 demoFragment2=new Frag2();
        Frag3 demoFragment3=new Frag3();
        position=position+1;
        Bundle bundle = new Bundle();
        if(position==1) {
            bundle.putString("message","Fragment: "+position);
            demoFragment1.setArguments(bundle);
            return demoFragment1;
        }
        else if(position==2) {
            bundle.putString("message","Fragment: "+position);
            demoFragment2.setArguments(bundle);
            return demoFragment2;
        }
        else {
            bundle.putString("message", "Fragment: " + position);
            demoFragment3.setArguments(bundle);
            return demoFragment3;
        }


    }

    @Override
    public int getCount() {
        return 3;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        String[] arr={"Match","Palyer","Venue"};
        return arr[position];
    }
}
