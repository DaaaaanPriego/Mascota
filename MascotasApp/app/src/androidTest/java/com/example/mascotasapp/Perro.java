package com.example.mascotasapp;

public class Perro extends Mascota {
    private boolean esEntrenado;

    // Getters y Setters
    public boolean isEsEntrenado() {
        return esEntrenado;
    }

    public void setEsEntrenado(boolean esEntrenado) {
        this.esEntrenado = esEntrenado;
    }

    @Override
    public String imprimirDatos() {
        return super.imprimirDatos() + "\nEs entrenado: " + (esEntrenado ? "Sí" : "No");
    }
}