package com.example.ciro.entregableandroid.Clases;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;

import com.example.ciro.entregableandroid.Adapters.AdapterRwRecetas;

import java.util.ArrayList;
import java.util.List;

import static android.support.v7.widget.helper.ItemTouchHelper.*;

/**
 * Created by ciro_ on 5/6/2018.
 */

public class SwipeControlador extends Callback {
    AdapterRwRecetas adapterRwRecetas;

    public SwipeControlador(AdapterRwRecetas adapterRwRecetas) {
        this.adapterRwRecetas = adapterRwRecetas;
    }


        @Override
        public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            int drag = ItemTouchHelper.UP | ItemTouchHelper.DOWN;
            int swipe = ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT;
            return makeMovementFlags(drag, swipe);
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
    }



