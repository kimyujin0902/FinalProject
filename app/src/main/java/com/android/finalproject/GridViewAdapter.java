package com.android.finalproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class GridViewAdapter extends BaseAdapter {
    private Context mContext;
    private int mResource;
    private ArrayList<DateItem> mItems = new ArrayList<DateItem>();

    public GridViewAdapter(Context context, int resource, ArrayList<DateItem> items){
        mContext = context;
        mItems = items;
        mResource = resource;
    }
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int pos) {
        return null;
    }

    @Override
    public long getItemId(int pos) {
        return pos;
    }

    @Override
    public View getView(int pos, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // 항목 뷰를 정의한 xml 리소스(여기서는 mResource 값)으로부터 항목 뷰 객체를 메모리로 로드
        view = inflater.inflate(mResource, viewGroup,false);
        TextView date = (TextView) view.findViewById(R.id.textview);
        // 어댑터가 관리하는 항목 데이터 중에서 position 위치의 항목의 문자열을 설정 텍스트뷰 객체에 설정
        date.setText(mItems.get(pos).mDate);
        return null;
    }
}
