package com.example.mascotasapp;

import android.util.Log;

public class Main {
    public static void main(String[] args) {
        ConstructorMascotas constructor = new ConstructorMascotas();
        MostrarInformacion mostrar = new MostrarInformacion();

        Perro perro = constructor.crearPerro("Rex", 5, "Labrador", true);
        Gato gato = constructor.crearGato("Luna", 3, "Siamés", true);

        Log.d("Halo", "Informacion del Perro");
        mostrar.mostrarMascota(perro);
        Log.d("Halo", "Ed estrenado" + perro.isEsEntrenado() );

        Log.d("Halo", "Informacion del Gato");
        mostrar.mostrarMascota(gato);
        Log.d("Halo", "Es de casa" + gato.isEsDeInterior() );


    }
}