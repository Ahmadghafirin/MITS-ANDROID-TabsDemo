package com.example.ahmad.tabsdemo;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by ahmad on 03/08/17.
 */

public class PesanFragment extends Fragment {

    public static PesanFragment newInstance() {
        return new PesanFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pesan, container, false);
        return view;
    }
}
