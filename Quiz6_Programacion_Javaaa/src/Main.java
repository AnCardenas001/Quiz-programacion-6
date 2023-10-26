import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la figura: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese el color de la figura: ");
        String color = sc.nextLine();

        System.out.print("Ingrese el tipo de figura (1:Círculo, 2:Rectángulo, 3:Triángulo): ");
        int tipo = sc.nextInt();

        FiguraGeometrica figura = null;

        switch (tipo) {
            case 1:
                System.out.print("Ingrese el radio del círculo: ");
                double radioCirculo = sc.nextDouble();
                figura = new Circulo(nombre, color, radioCirculo);
                break;
            case 2:
                System.out.print("Ingrese el valor del lado 1 del rectángulo: ");
                double lado1Rectangulo = sc.nextDouble();
                System.out.print("Ingrese el valor del lado 2 del rectángulo: ");
                double lado2Rectangulo = sc.nextDouble();
                figura = new FiguraGeometrica(nombre, color, lado1Rectangulo, lado2Rectangulo);
                break;
            case 3:
                System.out.print("Ingrese el valor de la base del triángulo: ");
                double baseTriangulo = sc.nextDouble();
                System.out.print("Ingrese el valor de la altura del triángulo: ");
                double alturaTriangulo = sc.nextDouble();
                figura = new Triangulo(nombre, color, baseTriangulo, alturaTriangulo);
                break;
            default:
                System.out.println("Tipo de figura no válido.");
                return;
        }

        System.out.println("Área: " + figura.obtenerArea());
        System.out.println("Perímetro: " + figura.obtenerPerimetro());
    }
    }

