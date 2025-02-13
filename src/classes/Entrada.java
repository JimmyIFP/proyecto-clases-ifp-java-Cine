package classes;

public class Entrada {

    private Pelicula pelicula;
    private Sala sala;
    private Cine cine;
    private boolean isValida;

    public Entrada(Pelicula pelicula, Sala sala, Cine cine) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.cine = cine;
        isValida = true;
    }

    public void setValida(boolean isValida) {
        this.isValida = isValida;
    }

    public boolean isValida() {
        return isValida;
    }

    @Override
    public String toString() {
        StringBuilder strB = new StringBuilder("\n");
        strB.append("Entrada para: " + pelicula + "\n");
        strB.append("\tSala: " + sala + "\n");
        strB.append("\tCine: " + cine + "\n");
        return strB.toString();
    }

    
}
