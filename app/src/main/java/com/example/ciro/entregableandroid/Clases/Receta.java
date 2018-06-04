package com.example.ciro.entregableandroid.Clases;

/**
 * Created by ciro_ on 29/5/2018.
 */

public class Receta {

    String titulo;
    Integer imagen;

    public Receta(String titulo, Integer imagen) {
        this.titulo = titulo;
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getImagen() {
        return imagen;
    }
}

