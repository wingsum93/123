package com.ericho.myapplication;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity  implements FragmentListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        to(MyFragment.newInstance("855"));
    }

    @Override
    public void setTitle(String title, String subtitle) {

    }

    @Override
    public void to(Fragment fragment) {
        getFragmentManager().beginTransaction().replace(R.id.fragmenta,fragment).addToBackStack(fragment.getClass().getName()).commit();
    }

    @Override
    public void back() {

    }
}
