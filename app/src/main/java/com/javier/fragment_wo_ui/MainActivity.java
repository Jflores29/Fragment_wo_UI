package com.javier.fragment_wo_ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fragment frag= new Without_UI_Fragment();
         frag = (Fragment) getSupportFragmentManager().findFragmentByTag("WithoutUIFragment_");
    }


}
