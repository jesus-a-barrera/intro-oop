import java.util.Scanner;

public class Medidas extends Calculo {
    private Scanner sn = new Scanner(System.in);
    private int base;
    private int altura;
    @Override
    public void calcular() {
        setResultado("Area = " + calcularArea(base, altura) + "; Perimetro = " + calcularPerimetro(base, altura));
    }

    @Override
    public void obtenerDatos() {
        System.out.println("Ingrese la base: ");
        base = sn.nextInt();
        System.out.println("Ingrese la altura: ");
        altura = sn.nextInt();
    }

    private int calcularArea(int base, int altura) {
        return base * altura;
    }

    private int calcularPerimetro(int base, int altura) {
        return (base + altura) * 2;
    }
}
