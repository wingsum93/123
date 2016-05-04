package com.ericho.myapplication;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by EricH on 4/5/2016.
 */
public class MyFragment extends Fragment {
    private String a;
    private TextView textView;
    public static MyFragment newInstance(String a){
        MyFragment fragment = new MyFragment();
        Bundle b = new Bundle();
        b.putString("a",a);
        fragment.setArguments(b);
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle b = getArguments();
        a = b.getString("a");

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.grag_my,container,false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textView = (TextView) view.findViewById(R.id.textView);
        textView.setText(a);
        textView.setTextColor(Color.RED);
    }
}
