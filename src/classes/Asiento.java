package classes;

public class Asiento {

    private String etiquetaDePosicion;
    private String etiquetaDeReserva;
    private Espectador espectador;
    private boolean isOcupado;
    private int coordenadaY;
    private int coordenadaX;
    // DEFAULT
    final private boolean DF_OCUPADO = false;
    final private Espectador DF_Espectador = null;

    // CONSTRUCTOR
    public Asiento(String etiquetaDePosicion, int y, int x) {
        this.etiquetaDePosicion = etiquetaDePosicion;
        this.etiquetaDeReserva = "";
        this.coordenadaY = y;
        this.coordenadaX = x;
        this.isOcupado = DF_OCUPADO;
        this.espectador = DF_Espectador;
    }

    // GETTER & SETTER

    // // Posición
    public void setEtiquetaDePosicion(String etiquetaDePosicion) {
        this.etiquetaDePosicion = etiquetaDePosicion;
    }
    public String getEtiquetaDePosicion() {
        return etiquetaDePosicion;
    }

    // // De reserva
    public void setEtiquetaDeReserva(String etiquetaDeReserva) {
        this.etiquetaDeReserva = etiquetaDeReserva;
    }
    public String getEtiquetaDeReserva() {
        return etiquetaDeReserva;
    }

    // // Disponibilidad
    public void setOcupado(boolean isOcupado) {
        this.isOcupado = isOcupado;
    }
    public boolean isOcupado() {
        return isOcupado;
    }

    // // Coordenadas
    public int getCoordenadaY() {
        return coordenadaY;
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    // MÉTODOS
    // // //

    @Override
    public String toString() {
        if(!isOcupado) {
            return etiquetaDePosicion;
        } else {
            return etiquetaDeReserva;
        }
    }

    public static void main(String[] args) {
        Asiento a1 = new Asiento("[nul]", 0, 0);
        System.out.println(a1);
    }
}
