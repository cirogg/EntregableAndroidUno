package com.example.ciro.entregableandroid.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ciro.entregableandroid.Clases.DataProvider;
import com.example.ciro.entregableandroid.Clases.Receta;
import com.example.ciro.entregableandroid.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ciro_ on 29/5/2018.
 */

public class AdapterRwRecetas extends RecyclerView.Adapter {

    ComunicadorAdapterOut comunicadorAdapterOut;

    List<Receta> listaDeRecetas;

    //CONSTRUCTOR
    public AdapterRwRecetas(ComunicadorAdapterOut comunicadorAdapterOut, List<Receta> listaDeRecetas) {
        this.comunicadorAdapterOut = comunicadorAdapterOut;
        this.listaDeRecetas = listaDeRecetas;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View celdaReceta = layoutInflater.inflate(R.layout.celda_receta, parent, false);
        ViewHolderRecetas viewHolderRecetas = new ViewHolderRecetas(celdaReceta);

        return viewHolderRecetas;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        Receta receta = listaDeRecetas.get(position);
        ViewHolderRecetas viewHolderRecetas = (ViewHolderRecetas) holder;
        viewHolderRecetas.asignarDatos(receta);

    }

    @Override
    public int getItemCount() {
        return listaDeRecetas.size();
    }

    //VIEWHOLDER
    private class ViewHolderRecetas extends RecyclerView.ViewHolder {

        TextView textViewTitulo;
        ImageView imageViewReceta;

        //Constructor VH
        public ViewHolderRecetas(View itemView) {
            super(itemView);
            textViewTitulo = itemView.findViewById(R.id.textViewTituloReceta);
            imageViewReceta = itemView.findViewById(R.id.imgImagenReceta);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Integer posicion = getAdapterPosition();
                    comunicadorAdapterOut.informarRecetaSeleccionada(posicion);
                }
            });

        }

        //Bind de datos
        public void asignarDatos(Receta receta) {
            String tituloReceta = receta.getTitulo();
            Integer imagenReceta = receta.getImagen();
            textViewTitulo.setText(tituloReceta);
            imageViewReceta.setImageResource(imagenReceta);

        }
    }


    public void filtrarLista(ArrayList<Receta> listaDeRecetasFiltradas) {
        listaDeRecetas = listaDeRecetasFiltradas;
        notifyDataSetChanged();
    }

    public interface ComunicadorAdapterOut {
        public void informarRecetaSeleccionada(Integer pos);
    }

}
