public class Circulo extends FiguraGeometrica{ // Clase para representar un circulo, que hereda de FiguraGeometrica.
    
    private double radio;

    /**
     * Constructor para inicializar los atributos del circulo.
     * @param nombre El nombre del circulo.
     * @param color El color del circulo.
     * @param radio El radio del circulo.
     */

    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
    }

    @Override // Metodo para sobrescribir el area especifica del circulo
    public double obtenerArea() { 
        return Math.PI * radio * radio; // Complejidad temporal: O(1) Tiempo constante.
    }

    @Override // Metodo para sobrescribir el perimettro especifica del circulo
    public double obtenerPerimetro() {
        return 2 * Math.PI * radio; // Complejidad temporal: O(1) Tiempo constante.
    }

}
