package com.android.finalproject;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MonthAdapter extends FragmentStateAdapter {
    private static int NUM_ITEMS=3;

    public MonthAdapter(FragmentActivity fa) {
        super(fa);
    }

    // 각 페이지를 나타내는 프래그먼트 반환
    @Override
    public Fragment createFragment(int position) {
        MonthFragment monthFragment = new MonthFragment();
        monthFragment.newInstance(position);
        return monthFragment;
    }

    // 전체 페이지 개수 반환
    @Override
    public int getItemCount() {
        return NUM_ITEMS;
    }
}