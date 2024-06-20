package com.example.mascotasapp;

import android.util.Log;

public class Mascota {
    private String nombre;
    private int edad;
    private String raza;

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    // Método para imprimir los datos de la mascota
    public void imprimirDatos() {
        Log.d("Halo", "Nombre: " + nombre);
        Log.d("Halo", "Edad:"+ edad);
        Log.d("Halo", "Raza:"+ raza);
    }
}