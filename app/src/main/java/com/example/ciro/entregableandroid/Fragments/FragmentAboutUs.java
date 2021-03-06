package com.example.ciro.entregableandroid.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.ciro.entregableandroid.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentAboutUs extends Fragment {

    ImageView gifAboutUs;

    public FragmentAboutUs() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_about_us, container, false);
        gifAboutUs = view.findViewById(R.id.gifAboutUs);
        String url = "https://media.giphy.com/media/1qcQStVKhXfBqFvek7/giphy.gif";
        Glide.with(this).load(url).into(gifAboutUs);

        return view;
    }

}
