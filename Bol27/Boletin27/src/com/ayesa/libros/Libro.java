package com.ayesa.libros;

public class Libro {
    private String nombre;
    private String autor;
    private int unidades;
    private float precio;

    public Libro(String nombre, String autor, int unidades, float precio) {
        this.nombre = nombre;
        this.autor = autor;
        this.unidades = unidades;
        this.precio = precio;
    }
    
    public Libro(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return  nombre + ","+autor+","+ unidades+"," +  precio  ;
    }
}
