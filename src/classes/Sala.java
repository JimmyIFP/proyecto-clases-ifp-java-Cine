package classes;

public class Sala {

    private Asiento[][] asientosMatriz;
    private int nFilas;
    private int nColumnas;
    protected Pelicula pelicula;
    // DEFAULT
    final private int DF_FILAS = 8;
    final private int DF_COLUMNAS = 9;
    final private Pelicula DF_PELICULA = null;
    final protected String ALFABETO= "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
    // CONSTRUCTOR
    public Sala(){
        this.nFilas = DF_FILAS;
        this.nColumnas = DF_COLUMNAS;
        this.pelicula = DF_PELICULA;
        crearSala();
    }
    
    public Sala(int nFilas, int nColumnas) {
        this.nFilas = nFilas;
        this.nColumnas = nColumnas;
        crearSala();
    }

    // GETTER AND SETTER
    private void setAsientosMatriz(int y, int x) {
        this.asientosMatriz = new Asiento[y][x];
    }

    //  // Pelicula
    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
    public Pelicula getPelicula() {
        return pelicula;
    }

    // MÉTODOS
    //  // Crear Sala
    public void crearSala() {
        String etiquetaDePosicion = "";
        setAsientosMatriz(nFilas, nColumnas);
        for (int i = 0; i < asientosMatriz.length; i++) {
            for (int j = 0; j < asientosMatriz[i].length; j++) {
                etiquetaDePosicion = String.format("[%d-%s]", i+1, ALFABETO.charAt(j));
                asientosMatriz[i][j] = new Asiento(etiquetaDePosicion, i, j);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder strB = new StringBuilder("\n");
        for (int i = asientosMatriz.length - 1; i >= 0 ; i--) {
            for (int j = 0; j < asientosMatriz[i].length; j++) {
                strB.append(asientosMatriz[i][j]);
            }
            strB.append("\n");
        }
        return strB.toString();
    }

    public static void main(String[] args) {

        // Los asientos de crean bien en la sala, el toString de los asientos va de puta madre
            // Las ambos constructores funcionan

        Sala s1 = new Sala();
        Sala s2 = new Sala(4, 2);

        System.out.println(s1);
        System.out.println(s2);
    }
}
