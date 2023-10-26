public class Rectangulo extends FiguraGeometrica { // Clase para representar un rectangulo, que hereda de FiguraGeometrica.
    
    private double lado1;
    private double lado2;

     /**
     * Constructor para inicializar los atributos del rectángulo.
     * @param nombre El nombre del rectángulo.
     * @param color El color del rectángulo.
     * @param lado1 El lado 1 del rectángulo.
     * @param lado2 El lado 2 del rectángulo.
     */

    public Rectangulo(String nombre, String color, double lado1, double lado2) {
        super(nombre, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override // Metodo para sobrescribir el area especifica del rectangulo
    public double obtenerArea() {
        return lado1 * lado2; // Complejidad temporal: O(1) Tiempo constante.
    }

    @Override // Metodo para sobrescribir el perimetro especifica del rectangulo
    public double obtenerPerimetro() {
        return 2 * (lado1 + lado2); // Complejidad temporal: O(1) Tiempo constante.
    }

}
