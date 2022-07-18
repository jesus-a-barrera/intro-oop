import java.util.Scanner;

public class Promedio extends Calculo {
    private Scanner sn = new Scanner(System.in);
    private int a, b, c;
    @Override
    public void calcular() {
        setResultado(((a + b + c) / 3) + "");
    }

    @Override
    public void obtenerDatos() {
        System.out.println("Ingrese el primer numero: ");
        a = sn.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        b = sn.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        c = sn.nextInt();
    }
}
