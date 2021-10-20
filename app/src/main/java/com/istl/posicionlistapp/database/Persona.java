package com.istl.posicionlistapp.database;

public class Persona {

    private String Nombre;
    private double longitud, latitud;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "Nombre='" + Nombre + '\'' +
                ", longitud=" + longitud +
                ", latitud=" + latitud +
                '}';
    }
}
