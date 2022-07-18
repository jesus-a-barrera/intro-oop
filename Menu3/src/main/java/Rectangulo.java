import java.util.Scanner;

public class Rectangulo extends Figura {
    private Scanner sn = new Scanner(System.in);
    private int altura;
    private int base;

    public Rectangulo() {
        super("Rectangulo");
    }

    @Override
    public void obtenerDatos() {
        System.out.println("Ingrese el valor de la altura: ");
        altura = sn.nextInt();
        System.out.println("Ingrese el valor de la base:");
        base = sn.nextInt();
    }

    @Override
    public void calcularArea() {
        setArea(this.base * this.altura);
    }

    @Override
    public void calcularPerimetro() {
        setPerimetro((this.base + this.altura) * 2);
    }
}
