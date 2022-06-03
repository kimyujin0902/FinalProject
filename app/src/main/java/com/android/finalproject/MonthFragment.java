package com.android.finalproject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MonthFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MonthFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String YEAR = "year";
    private static final String MONTH = "month";

    // TODO: Rename and change types of parameters
    private Integer myear;
    private Integer mmonth;

    public MonthFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static MonthFragment newInstance(int position) {
        MonthFragment fragment = new MonthFragment();
        Bundle args = new Bundle();
        args.putInt(YEAR, position);
        args.putInt(MONTH, position);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            myear = getArguments().getInt(YEAR);
            mmonth= getArguments().getInt(MONTH);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview = inflater.inflate(R.layout.fragment_month, container, false);
//        ArrayList<DateItem> Dates = new ArrayList<>();
//
//        Calendar calendar = Calendar.getInstance();
//        calendar.set(myear, mmonth,1);
//
//        int lastday = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
//        int startday = calendar.get(calendar.DAY_OF_WEEK);
//        int daySize = lastday + startday - 1;
//
//        for(int i=0; i<startday; i++)
//            Dates.add(new DateItem(""));
//        for(int i=startday-1; i<daySize; i++)
//            Dates.add(new DateItem("" + (i - startday + 2)));
//        for(int i=daySize; i<42; i++)
//            Dates.add(new DateItem(""));
//
//        GridViewAdapter adapter = new GridViewAdapter(getActivity(), R.layout.item, Dates);
//        GridView gridview = (GridView) rootview.findViewById(R.id.gridview);
//        gridview.setAdapter(adapter);
        return rootview;
    }
}