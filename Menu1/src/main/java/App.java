import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculo calculo;
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {

            System.out.println("1. Obtener Siguiente.");
            System.out.println("2. Obtener Promedio.");
            System.out.println("3. Obtener Area y Perimetro.");
            System.out.println("4. Obtener Aleatorio.");
            System.out.println("5. Salir.");

            try {

                System.out.println("Escribe una de las opciones:");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        calculo = new Siguiente();
                        calculo.obtenerDatos();
                        System.out.println("Calculando el siguiente numero...");
                        calculo.calcular();
                        calculo.imprimirResultado();
                        break;
                    case 2:
                        calculo = new Promedio();
                        calculo.obtenerDatos();
                        System.out.println("Calculando el promedio...");
                        calculo.calcular();
                        calculo.imprimirResultado();
                        break;
                    case 3:
                        calculo = new Medidas();
                        calculo.obtenerDatos();
                        System.out.println("Calculando el resultado...");
                        calculo.calcular();
                        calculo.imprimirResultado();
                        break;
                    case 4:
                        calculo = new NumeroAleatorio();
                        calculo.obtenerDatos();
                        System.out.println("Generando el numero aleatorio...");
                        System.out.println("Calculando el resultado...");
                        calculo.calcular();
                        calculo.imprimirResultado();
                        break;
                    case 5:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 5.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número.");
                sn.next();
            }
        }
    }
}
