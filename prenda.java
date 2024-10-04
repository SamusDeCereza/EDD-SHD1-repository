public class Prenda {
    private String nombre;
    private String diseniador;
    private int anioColeccion;
    private float precio;


    public Prenda(String nombre, String diseniador, int anioColeccion, float precio){
        this.nombre = nombre;
        this.diseniador = diseniador;
        this.anioColeccion = anioColeccion;
        this.precio = precio;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDiseniador(String diseniador) {
        this.diseniador = diseniador;
    }

    public String getDiseniador() {
        return diseniador;
    }

    public int getAnioColeccion() {
        return anioColeccion;
    }

    public void setAnioColeccion(int anioColeccion) {
        this.anioColeccion = anioColeccion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

}

