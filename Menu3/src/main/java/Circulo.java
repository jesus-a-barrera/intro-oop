import java.util.Scanner;

public class Circulo extends Figura {
    private Scanner sn = new Scanner(System.in);
    private int radio;
    public Circulo() {
        super("Circulo");
    }

    @Override
    public void obtenerDatos() {
        System.out.println("Ingrese el valor del radio: ");
        radio = sn.nextInt();
    }

    @Override
    public void calcularArea() {
        setArea(Math.PI * (radio * radio));
    }

    @Override
    public void calcularPerimetro() {
        setPerimetro(2 * Math.PI * radio);
    }
}
