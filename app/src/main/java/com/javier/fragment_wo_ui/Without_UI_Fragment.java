package com.javier.fragment_wo_ui;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Without_UI_Fragment extends Fragment {


    private static final String TAG = "WithoutUIFragment_";

    public Without_UI_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        setRetainInstance(true); // Must be set to true
        Log.d(TAG, "onCreateView: ");
        return null;

    }


}
