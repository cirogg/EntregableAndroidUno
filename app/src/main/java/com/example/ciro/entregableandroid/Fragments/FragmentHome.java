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
public class FragmentHome extends Fragment {

    ImageView testGifGlide;

    public FragmentHome() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_home, container, false);

        testGifGlide = view.findViewById(R.id.imgGif);
        String url = "https://media.giphy.com/media/l4FGFT5D4NKA9rGxy/giphy.gif";
        Glide.with(this).load(url).into(testGifGlide);

        return view;
    }

}
