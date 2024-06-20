package com.example.mascotasapp;

class ConstructorMascotas {
    public Perro crearPerro(String nombre, int edad, String raza, boolean esEntrenado) {
        Perro perro = new Perro();
        perro.setNombre(nombre);
        perro.setEdad(edad);
        perro.setRaza(raza);
        perro.setEsEntrenado(esEntrenado);
        return perro;
    }

    public Gato crearGato(String nombre, int edad, String raza, boolean esDeInterior) {
        Gato gato = new Gato();
        gato.setNombre(nombre);
        gato.setEdad(edad);
        gato.setRaza(raza);
        gato.setEsDeInterior(esDeInterior);
        return gato;
    }
}