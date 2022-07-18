import java.util.Scanner;
import java.lang.Math;

public class Octagono extends Figura {
    private Scanner sn = new Scanner(System.in);
    private int lado;
    public Octagono() {
        super("Octagono");
    }

    @Override
    public void obtenerDatos() {
        System.out.println("Ingrese el valor de los lados: ");
        lado = sn.nextInt();
    }

    @Override
    public void calcularArea() {
        double apotema = lado / 2 * Math.tan(22.5);
        setArea((this.perimetro * apotema) / 2);
    }

    @Override
    public void calcularPerimetro() {
        setPerimetro(lado * 8);
    }
}
