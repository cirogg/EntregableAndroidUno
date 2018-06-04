package com.example.ciro.entregableandroid.Activities;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ciro.entregableandroid.Adapters.AdapterViewPagerDetalle;
import com.example.ciro.entregableandroid.Clases.DataProvider;
import com.example.ciro.entregableandroid.Clases.Receta;
import com.example.ciro.entregableandroid.Fragments.FragmentDetalle;
import com.example.ciro.entregableandroid.R;

import java.util.ArrayList;
import java.util.List;

public class DetalleActivity extends AppCompatActivity {

    FragmentManager fragmentManager;

    ViewPager viewPager;

    List<Receta> listaDeRecetas = new ArrayList<>();

    DataProvider dataProvider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        Intent unIntent = getIntent();
        Bundle unBundle = unIntent.getExtras();

        fragmentManager = getSupportFragmentManager();

        listaDeRecetas = DataProvider.listaDeRecetas;


        viewPager = findViewById(R.id.viewPagerDetalle);

        AdapterViewPagerDetalle adapterViewPagerDetalle = new AdapterViewPagerDetalle(fragmentManager, listaDeRecetas);

        viewPager.setAdapter(adapterViewPagerDetalle);

        viewPager.setCurrentItem(unBundle.getInt("pos"));

    }
}
