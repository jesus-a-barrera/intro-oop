import java.util.Scanner;

public class Cuadrado extends Figura {
    private Scanner sn = new Scanner(System.in);
    private int lado;

    public Cuadrado() {
        super("Cuadrado");
    }

    @Override
    public void obtenerDatos() {
        System.out.println("Ingrese el valor de los lados: ");
        lado = sn.nextInt();
    }

    @Override
    public void calcularArea() {
        setArea(lado * lado);
    }

    @Override
    public void calcularPerimetro() {
        setPerimetro(lado * 4);
    }
}
