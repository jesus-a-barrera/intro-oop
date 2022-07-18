import java.util.concurrent.ThreadLocalRandom;

public class NumeroAleatorio extends Calculo {
    private int numero;

    @Override
    public void calcular() {
        setResultado((numero + (numero * 0.3)) + "");
    }

    @Override
    public void obtenerDatos() {
        numero = ThreadLocalRandom.current().nextInt(0, 200) + 0;
    }

}
