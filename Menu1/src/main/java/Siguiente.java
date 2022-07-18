import java.util.Scanner;

public class Siguiente extends Calculo {
    private Scanner sn = new Scanner(System.in);
    private int numero;

    @Override
    public void calcular() {
        setResultado((numero + 1) + "");
    }

    @Override
    public void obtenerDatos() {
        System.out.println("Ingrese un numero: ");
        numero = sn.nextInt();
    }
}
