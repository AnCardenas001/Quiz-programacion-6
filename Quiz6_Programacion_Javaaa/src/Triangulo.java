public class Triangulo extends FiguraGeometrica { // Clase para representar un triangulo, que hereda de FiguraGeometrica.
    
    private double base;
    private double altura;

    /**
     * Constructor para inicializar los atributos del triángulo.
     * @param nombre El nombre del triángulo.
     * @param color El color del triángulo.
     * @param base La base del triángulo.
     * @param altura La altura del triángulo.
     */

    public Triangulo(String nombre, String color, double base, double altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }

    @Override // Metodo para sobrescribir el area especifica del triangulo
    public double obtenerArea() {
        return (base * altura) / 2; // Complejidad temporal: O(1) Tiempo constante.
    }

    @Override // Metodo para sobrescribir el perimetro especifica del triangulo
    public double obtenerPerimetro() {
        return base + 2 * Math.sqrt((base * base + 4 * altura * altura)) + altura; // Complejidad temporal: O(1) Tiempo constante.
    }
}
