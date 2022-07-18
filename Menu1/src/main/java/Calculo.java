import java.util.Scanner;

public abstract class Calculo {
    private String resultado;

    public abstract void calcular();

    public abstract void obtenerDatos();

    public void imprimirResultado() {
        System.out.println("El resultado es : " + getResultado() + "\n");
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}
