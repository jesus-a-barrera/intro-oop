import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    private static Figura figura;
    private static Scanner sn = new Scanner(System.in);
    public static void main(String[] args) {
        boolean salir = false;
        int opcion;

        while (!salir) {

            imprimirMenu();

            try {

                System.out.println("Escribe una de las opciones:");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        figura = new Cuadrado();
                        break;
                    case 2:
                        figura = new Circulo();
                        break;
                    case 3:
                        figura = new Rectangulo();
                        break;
                    case 4:
                        figura = new Octagono();
                        break;
                    case 5:
                        System.out.println("El perimetro de la figura es: " + figura.getPerimetro());
                        break;
                    case 6:
                        System.out.println("El area de la figura es: " + figura.getArea());
                        break;
                    case 7:
                        System.out.println("El tipo de la figura es: " + figura.getTipo());
                        break;
                    case 8:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 8.");
                }
                if (opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4) {
                    crearFigura();
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número.");
                sn.next();
            }
        }
    }

    private static void crearFigura() {
        System.out.println("INGRESE LOS DATOS DE LA FIGURA");
        figura.obtenerDatos();
        System.out.println("CALCULANDO AREA...");
        figura.calcularPerimetro();
        System.out.println("CALCULANDO PERIMETRO...");
        figura.calcularArea();
        System.out.println("CREANDO FIGURA...");
        System.out.println("FIGURA CREADA CON EXITO!\n");
    }

    private static void imprimirMenu() {
        System.out.println("1. Crear Cuadrado");
        System.out.println("2. Crear Circulo");
        System.out.println("3. Crear Rectangulo");
        System.out.println("4. Crear Octagono");
        System.out.println("5. Imprimir Perimetro");
        System.out.println("6. Imprimir Area");
        System.out.println("7. Imprimir Tipo de Figura");
        System.out.println("8. Salir.");
    }
}

