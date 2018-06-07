package com.example.ciro.entregableandroid.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ciro.entregableandroid.Clases.DataProvider;
import com.example.ciro.entregableandroid.R;
import com.example.ciro.entregableandroid.Clases.Receta;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentDetalle extends Fragment {

    TextView textViewTitulo;
    TextView textViewIngredientes;
    TextView textViewPreparacion;
    ImageView imageViewReceta;


    public static FragmentDetalle crearFragmentDetalle(Integer pos){
        FragmentDetalle fragmentDetalle = new FragmentDetalle();
        Bundle unBundle = new Bundle();
        unBundle.putInt("pos",pos);
        fragmentDetalle.setArguments(unBundle);
        return fragmentDetalle;
    }

    public FragmentDetalle() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_detalle, container, false);

        textViewTitulo = view.findViewById(R.id.textViewTituloRecetaDetalle);
        textViewIngredientes = view.findViewById(R.id.textViewIngredientes);
        textViewPreparacion = view.findViewById(R.id.textViewPreparacion);
        imageViewReceta = view.findViewById(R.id.imgImagenRecetaDetalle);

        Bundle unBundle = getArguments();

        //////////////
        //DataProvider dataProvider = new DataProvider();0
        Receta recetaAMostrar = DataProvider.listaDeRecetas.get(unBundle.getInt("pos"));
        //////////////

        textViewTitulo.setText(recetaAMostrar.getTitulo());
        textViewIngredientes.setText(recetaAMostrar.getIngredientes());
        textViewPreparacion.setText(recetaAMostrar.getPreparacion());
        imageViewReceta.setImageResource(recetaAMostrar.getImagen());


        return view;
    }

}
