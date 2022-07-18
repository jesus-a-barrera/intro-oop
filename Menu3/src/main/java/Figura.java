public abstract class Figura {
    protected double perimetro;
    protected double area;
    protected String tipo;

    public Figura(String tipo) {
        this.tipo = tipo;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double getArea() {
        return area;
    }

    public String getTipo() {
        return tipo;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public abstract void obtenerDatos();

    public abstract void calcularArea();

    public abstract void calcularPerimetro();
}
