public class Main {
    public static void main(String[] args) {
        ConstructorMascotas constructor = new ConstructorMascotas();
        MostrarInformacion mostrar = new MostrarInformacion();

        Perro perro = constructor.crearPerro("Rex", 5, "Labrador", true);
        Gato gato = constructor.crearGato("Luna", 3, "Siamés", true);

        System.out.println("Información del Perro:");
        mostrar.mostrarMascota(perro);
        System.out.println("Es entrenado: " + perro.isEsEntrenado());

        System.out.println("\nInformación del Gato:");
        mostrar.mostrarMascota(gato);
        System.out.println("Es de interior: " + gato.isEsDeInterior());
    }
}