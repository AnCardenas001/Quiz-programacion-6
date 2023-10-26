public class FiguraGeometrica {
    private String nombre;
    private String color;

    /**
     * Constructor para inicializar los atributos de la figura.
     * @param nombre El nombre de la figura.
     * @param color El color de la figura.
     */

    public FiguraGeometrica(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public FiguraGeometrica(String nombre2, String color2, double lado1Rectangulo, double lado2Rectangulo) {
    }

    public double obtenerArea() {
        return 0; // Este método debe ser sobreescrito en las clases hijas
    }

    public double obtenerPerimetro() {
        return 0; // Este método debe ser sobreescrito en las clases hijas
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

