package com.example.tapesh.mainproject1;

import android.app.ActionBar;


import android.app.Fragment;
import android.app.FragmentTransaction;



/**
 * Created by TAPESH on 4/15/2016.
 */
public class TabListener implements ActionBar.TabListener {
    Fragment fragment;


    public TabListener(Fragment fragment) {
        // TODO Auto-generated constructor stub
        this.fragment = fragment;
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        // TODO Auto-generated method stub
        ft.replace(R.id.fragment_container, fragment);
    }


    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
        // TODO Auto-generated method stub

    }


    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {
        // TODO Auto-generated method stub

    }







}
