package com.example.ciro.entregableandroid.Clases;

import com.example.ciro.entregableandroid.Clases.Receta;
import com.example.ciro.entregableandroid.Fragments.FragmentDetalle;
import com.example.ciro.entregableandroid.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ciro_ on 29/5/2018.
 */

public class DataProvider {
    public static List<Receta> listaDeRecetas = new ArrayList<>();

    List<FragmentDetalle> listaDeFragmentDetalle = new ArrayList<>();


    public static List<Receta> getListaDeRecetas() {

        listaDeRecetas.clear();
        listaDeRecetas.add(new Receta("Hamburguesas piolas", R.drawable.imgrecetauno));
        listaDeRecetas.add(new Receta("Bastoncitos veganos", R.drawable.imgrecetados));
        listaDeRecetas.add(new Receta("Crayones salados", R.drawable.imgrecetatres));
        listaDeRecetas.add(new Receta("Tiramisu de facha", R.drawable.imgrecetacuatro));
        listaDeRecetas.add(new Receta("Ensalada de carne", R.drawable.imgrecetacinco));
        listaDeRecetas.add(new Receta("Fideos de atun", R.drawable.imgrecetaseis));
        listaDeRecetas.add(new Receta("Brazo de venezolano", R.drawable.imgrecetasiete));
        /*listaDeRecetas.add(new Receta("TITULO 8",R.drawable.imgReceta));
        listaDeRecetas.add(new Receta("TITULO 9",R.drawable.imgReceta));
        listaDeRecetas.add(new Receta("TITULO 10",R.drawable.imgReceta));
        listaDeRecetas.add(new Receta("TITULO 11",R.drawable.imgReceta));
        listaDeRecetas.add(new Receta("TITULO 12",R.drawable.imgReceta));
        listaDeRecetas.add(new Receta("TITULO 13",R.drawable.imgReceta));
        listaDeRecetas.add(new Receta("TITULO 14",R.drawable.imgReceta));
        listaDeRecetas.add(new Receta("TITULO 15",R.drawable.imgReceta));
        listaDeRecetas.add(new Receta("TITULO 16",R.drawable.imgReceta));
        listaDeRecetas.add(new Receta("TITULO 17",R.drawable.imgReceta));
        listaDeRecetas.add(new Receta("TITULO 18",R.drawable.imgReceta));
        listaDeRecetas.add(new Receta("TITULO 19",R.drawable.imgReceta));
        listaDeRecetas.add(new Receta("TITULO 20",R.drawable.imgReceta));*/


        return listaDeRecetas;
    }

    public void setListaDeRecetas(List<Receta> listaDeRecetas) {
        this.listaDeRecetas = listaDeRecetas;
    }

   /* public Receta getRecetaSeleccionada (Integer pos){
        getListaDeRecetas();
        Receta recetaADevolver = null;
        for (Receta recetaDeLaLista : listaDeRecetas) {
            if (pos.equals(listaDeRecetas.indexOf(recetaDeLaLista))){
                recetaADevolver = recetaDeLaLista;
                break;
            }
        }
        return recetaADevolver;
    }*/


}
