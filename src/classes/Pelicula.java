package classes;

public class Pelicula {
    protected String titulo;
    protected double duracion;
    protected int edadMinima;
    protected String director;

    // Constructor
    public Pelicula(){
    }

    public Pelicula(String titulo, double duracion, int edadMinima, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.director = director;
    }

}
