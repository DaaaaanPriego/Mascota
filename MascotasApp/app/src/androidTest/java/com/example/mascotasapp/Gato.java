package com.example.mascotasapp;

public class Gato extends Mascota {
    private boolean esDeInterior;

    // Getters y Setters
    public boolean isEsDeInterior() {
        return esDeInterior;
    }

    public void setEsDeInterior(boolean esDeInterior) {
        this.esDeInterior = esDeInterior;
    }

    @Override
    public String imprimirDatos() {
        return super.imprimirDatos() + "Es de interior: " + (esDeInterior ? "Sí" : "No");
    }
}