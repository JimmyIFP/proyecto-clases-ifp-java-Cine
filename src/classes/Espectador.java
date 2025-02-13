package classes;

import java.util.ArrayList;

public class Espectador {

    private String nombre;
    private int edad;
    private double dinero;
    private String ID;
    protected ArrayList<Entrada> entradas;


    public Espectador(String nombre, int edad, double dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
        generarID();
    }

    public String getID() {
        return ID;
    }

    public double getDinero() {
        return dinero;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    // MÉTODOS
    public void pagar(double monto) {
        
    }

    public void generarID() {
        this.ID = String.format("[%s]", nombre.substring(0, 3) );
    }

    @Override
    public String toString() {
        return "Espectador [nombre=" + nombre + ", edad=" + edad + ", dinero=" + dinero + "]";
    }

    

}
