package exercicio08;
import java.lang.Math;

public class Circulo extends FiguraGeometrica {
    private double raio;

    Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio){
        this.raio = raio;
    }

    @Override
    public double calcularArea(){
        return 3.14 * Math.pow(raio, 2);
    }

    @Override
    public double calcularPerimetro(){
        return 2 * 3.14 * raio;
    }
}
