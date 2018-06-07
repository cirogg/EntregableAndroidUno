package com.example.ciro.entregableandroid.Fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.ciro.entregableandroid.Adapters.AdapterRwRecetas;
import com.example.ciro.entregableandroid.Clases.DataProvider;
import com.example.ciro.entregableandroid.Adapters.SwipeControlador;
import com.example.ciro.entregableandroid.R;
import com.example.ciro.entregableandroid.Clases.Receta;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentReceta extends Fragment implements AdapterRwRecetas.ComunicadorAdapterOut {

    RecyclerView recyclerViewRecetas;

    public DataProvider dataProvider;

    AdapterRwRecetas adapterRwRecetas;

    List<Receta> listaDeRecetas = new ArrayList<>();

    ComunicadorFragment2Activity comunicadorFragment2Activity;

    SwipeControlador swipeControlador;

    ItemTouchHelper itemTouchHelper;

    EditText editTextSearch;

    public FragmentReceta() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.comunicadorFragment2Activity = (ComunicadorFragment2Activity) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_receta, container, false);



        //DATA PROVIDER DE RECETAS DEL FRAGMENT
        dataProvider = new DataProvider();
        listaDeRecetas = dataProvider.getListaDeRecetas();
        /////////////////////////////////////////////

        //Encuentro el RW y le seteo un layoutManager (Vertical)
        recyclerViewRecetas = view.findViewById(R.id.recyclerViewRecetas);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(view.getContext(),LinearLayoutManager.VERTICAL,false);
        recyclerViewRecetas.setLayoutManager(layoutManager);
        //Seteo Adapter al RW
        adapterRwRecetas = new AdapterRwRecetas(this,listaDeRecetas);
        recyclerViewRecetas.setAdapter(adapterRwRecetas);

        //SWIPE
        swipeControlador = new SwipeControlador(adapterRwRecetas);
        itemTouchHelper = new ItemTouchHelper(swipeControlador);
        itemTouchHelper.attachToRecyclerView(recyclerViewRecetas);






        ////////////////ESCUCHADOR FILTRO//////////////
        editTextSearch = view.findViewById(R.id.editTextSearch);
        editTextSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                filtrar(s.toString());
            }
        });
        ///////////////////////////////////////////////////////


        return view;
    }

    @Override
    public void informarRecetaSeleccionada(Integer pos) {
        comunicadorFragment2Activity.clickOnCelda(pos);
    }

    public interface ComunicadorFragment2Activity{
        public void clickOnCelda(Integer pos);
    }

    private void filtrar (String texto){
        ArrayList<Receta> listaDeRecetasFiltradas = new ArrayList<>();

        for (Receta recetaDeLaLista : listaDeRecetas) {
            if (recetaDeLaLista.getTitulo().toLowerCase().contains(texto.toLowerCase())){
                listaDeRecetasFiltradas.add(recetaDeLaLista);
            }
        }
        adapterRwRecetas.filtrarLista(listaDeRecetasFiltradas);
        DataProvider.listaDeRecetas = listaDeRecetasFiltradas;

    }

    // Mudado a una clase externa.
   /* private ItemTouchHelper.Callback createItemTouchHelper(){
        ItemTouchHelper.Callback simpleCallback = new ItemTouchHelper.Callback() {
            @Override
            public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
                int drag = ItemTouchHelper.UP | ItemTouchHelper.DOWN;
                int swipe = ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT;
                return makeMovementFlags(drag,swipe);
            }

            @Override
            public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {

                adapterRwRecetas.moverItemDeLaLista(viewHolder.getAdapterPosition(), target.getAdapterPosition());
                return true;
            }

            @Override
            public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
                adapterRwRecetas.removerItemDeLaLista(viewHolder.getAdapterPosition());
            }
        };
        return simpleCallback;
    }*/
}
