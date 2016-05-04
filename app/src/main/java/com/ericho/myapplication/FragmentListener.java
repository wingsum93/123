package com.ericho.myapplication;

import android.app.Fragment;

/**
 * Created by EricH on 4/5/2016.
 */
public interface FragmentListener {
    void setTitle(String title,String subtitle);
    void to(Fragment fragment);
    void back();

}
