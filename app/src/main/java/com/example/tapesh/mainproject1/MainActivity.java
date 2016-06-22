package com.example.tapesh.mainproject1;


import android.app.ActionBar;


import android.app.Activity;
import android.app.Fragment;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;



import android.support.v4.app.FragmentActivity;


import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

public class MainActivity extends Activity {


    Fragment fragmentTab1=new FragmentTab1();
    Fragment fragmentTab2 = new FragmentTab2();
    Fragment fragmentTab3 = new FragmentTab3();
    Fragment fragmentTab4=new FragmentTab4();
    ActionBar.Tab tab1,tab2,tab3,tab4;
    ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        actionBar=getActionBar();

        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#009799"));
        actionBar.setStackedBackgroundDrawable(colorDrawable);

        actionBar.setDisplayShowTitleEnabled(true);
        getActionBar().setHomeButtonEnabled(true);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setBackgroundDrawable(colorDrawable);


        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);


        tab1=actionBar.newTab().setText("Order");
        tab2=actionBar.newTab().setText("Billing");
        tab3=actionBar.newTab().setText("Payment");
        tab4=actionBar.newTab().setText("MyPoints");



        tab1.setTabListener(new TabListener(fragmentTab1));
        tab2.setTabListener(new TabListener(fragmentTab2));
        tab3.setTabListener(new TabListener(fragmentTab3));
        tab4.setTabListener(new TabListener(fragmentTab4));

        actionBar.addTab(tab1);
        actionBar.addTab(tab2);
        actionBar.addTab(tab3);
        actionBar.addTab(tab4);
    }





}
