package com.mendoza.luigi.vj202102.entities;

public class Repository {
    private String imagen;
    private String nombre;
    private String estrella;

    public Repository() {
    }

    public Repository(String imagen, String nombre, String estrella) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.estrella = estrella;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstrella() {
        return estrella;
    }

    public void setEstrella(String estrella) {
        this.estrella = estrella;
    }
}
