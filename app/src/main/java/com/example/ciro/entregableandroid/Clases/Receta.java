package com.example.ciro.entregableandroid.Clases;

/**
 * Created by ciro_ on 29/5/2018.
 */

public class Receta {

    String titulo;
    String ingredientes;
    String preparacion;
    Integer imagen;

    public Receta(String titulo, Integer imagen, String ingredientes, String preparacion) {
        this.titulo = titulo;
        this.imagen = imagen;
        this.ingredientes = ingredientes;
        this.preparacion = preparacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getImagen() {
        return imagen;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public String getPreparacion() {
        return preparacion;
    }
}

