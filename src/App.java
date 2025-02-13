import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import classes.*;

public class App {

    public static ArrayList<Pelicula> listadoPeliculas() {
        ArrayList<Pelicula> peliculas = new ArrayList<>(Arrays.asList(
            new Pelicula("Toy Story", 1.21, 0, "John Lasseter"),
            new Pelicula("Finding Nemo", 1.40, 0, "Andrew Stanton"),
            new Pelicula("The Lion King", 1.28, 0, "Roger Allers and Rob Minkoff"),
            new Pelicula("Frozen", 1.42, 0, "Chris Buck and Jennifer Lee"),
            new Pelicula("Moana", 1.47, 0, "Ron Clements and John Musker"),
            new Pelicula("The Dark Knight", 2.32, 13, "Christopher Nolan"),
            new Pelicula("Inception", 2.28, 13, "Christopher Nolan"),
            new Pelicula("The Matrix", 2.16, 17, "Lana Wachowski and Lilly Wachowski"),
            new Pelicula("Mad Max: Fury Road", 2.00, 17, "George Miller"),
            new Pelicula("Deadpool", 1.48, 18, "Tim Miller")
        ));
        return peliculas;
    }

    public static Espectador generadorEspectador() {
        String[] nombres = {"María" , "Elena", "James", "Alexander", "Ikigai", "Camila", "Manuel", "Luisa", "Felipe"};
        Random rdnm = new Random();
        int i = rdnm.nextInt(nombres.length);
        String nombre = nombres[i];
        int edad = rdnm.nextInt(70);
        double dinero = rdnm.nextDouble(5, 50);
        return new Espectador(nombre, edad, dinero);
    }


    public static void main(String[] args) throws Exception {
        ArrayList<Pelicula> peliculas = listadoPeliculas();

        Cine cinema = new Cine(peliculas);
    }
}
