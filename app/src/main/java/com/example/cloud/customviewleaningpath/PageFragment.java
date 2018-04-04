package com.example.cloud.customviewleaningpath;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;

public class PageFragment extends Fragment {
    @LayoutRes
    int practicLayoutRes;
    public static final String PRACTICE_LAYOUT_RES = "practiceLayoutRes";

    public static PageFragment newInstance(@LayoutRes int practicLayoutRes) {
        PageFragment pageFragment = new PageFragment();
        Bundle args = new Bundle();
        args.putInt(PRACTICE_LAYOUT_RES, practicLayoutRes);
        pageFragment.setArguments(args);
        return pageFragment;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_page, container, false);
        ViewStub sampleStub = (ViewStub) view.findViewById(R.id.sampleStub);
        sampleStub.setLayoutResource(practicLayoutRes);
        sampleStub.inflate();
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            practicLayoutRes = arguments.getInt(PRACTICE_LAYOUT_RES);
        }
    }
}
