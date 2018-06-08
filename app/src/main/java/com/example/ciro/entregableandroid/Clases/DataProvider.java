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




    public static List<Receta> getListaDeRecetas() {

        listaDeRecetas.clear();
        listaDeRecetas.add(new Receta("Hamburguesas piolas", R.drawable.imgrecetauno,"Carne picada\nGelatina invisible\nSal de la buena\nCheddar","Agarras la carne picada la separas y aplastas para hacer la hamburguesa, le tiras un montón de sal y le pones el queso. Cocinas y comes como un campeón"));
        listaDeRecetas.add(new Receta("Bastoncitos veganos", R.drawable.imgrecetados,"Pan rallado\nVegetales a eleccion\nMucha amargura","Convertimos en pasta los vegetales y luego los rebosamos con el pan rallado. Si estas haciendo esto es porque no tenes ganas de vivir ni amor propio."));
        listaDeRecetas.add(new Receta("Crayones salados", R.drawable.imgrecetatres,"Crayon Rojo\nCrayon Verde\nCrayon Amarillo\nCrayon Celeste\nCrayon Negro\nSal","Salamos levemente cada crayon que tenemos. Los colocamos prolijamente en un plato para una correcta presentacion. Disfrute del manjar"));
        listaDeRecetas.add(new Receta("Tiramisu de facha", R.drawable.imgrecetacuatro, "Café\nCrema\nVainilla\nMucha facha","Molemos los granos de cafe. Batimos la crema para que logre una buena consistencia. Hacemos un piso de vainillas remojadas en algo. Luego armamos una torta con eso teniendo la mayor cantidad de facha posible. Comerlo con facha"));
        listaDeRecetas.add(new Receta("Ensalada de carne", R.drawable.imgrecetacinco,"Vaca\nPollo\nCerdo\nLangostinos\nCamarones","Agarramos animalito por animalito y los matamos. Luego de despellejarlo todo y lavarlo por dentro y por fuera, lo cortamos en partes para aprovechar los mejores cortes de su hermoso cuerpito lleno de nutrientes. Cocinamos cada uno por separado y cortamos en cubitos. Todo a un Bowl y a disfrutar una gran ensalada."));
        listaDeRecetas.add(new Receta("Fideos de atun", R.drawable.imgrecetaseis, "Harina\nAtun\nSal\nImaginación","Compramos fideos en el chino porque no sabemos hacer fideos asi que la harina y todo eso dejala de adorno. Tambien compramos una lata de atún. Hacemos los fideos, le tiramos la lata de atun encima en el plato y listo. Comida rapida y seguramente fea."));
        listaDeRecetas.add(new Receta("Brazo de venezolano", R.drawable.imgrecetasiete,"Un venezolano\nUna fogata\nCuchillo con filo","Agarramos al venezolano y lo amasijamos en el sotano. Le cortamos los brazos y los hacemos en la fogata. Manjar internacional"));
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





}
