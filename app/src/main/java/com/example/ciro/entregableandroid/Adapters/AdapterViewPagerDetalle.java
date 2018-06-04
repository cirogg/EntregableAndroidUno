package com.example.ciro.entregableandroid.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.ciro.entregableandroid.Clases.DataProvider;
import com.example.ciro.entregableandroid.Clases.Receta;
import com.example.ciro.entregableandroid.Fragments.FragmentDetalle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ciro_ on 1/6/2018.
 */

public class AdapterViewPagerDetalle extends FragmentStatePagerAdapter {


    List<Fragment> listaDeFragmentDetalle = new ArrayList<>();

    //CONSTRUCTOR.
    public AdapterViewPagerDetalle(FragmentManager fm, List<Receta> listaDeRecetas) {
        super(fm);

        for (Receta recetaDeLaLista : listaDeRecetas) {
            listaDeFragmentDetalle.add(FragmentDetalle.crearFragmentDetalle(listaDeRecetas.indexOf(recetaDeLaLista)));
        }


    }

    @Override
    public Fragment getItem(int position) {
        return listaDeFragmentDetalle.get(position);
    }

    @Override
    public int getCount() {
        return listaDeFragmentDetalle.size();
    }
}
