package exercicio08;
import java.lang.Math;

public class Quadrado implements FiguraGeometrica {
    private double lado;

    Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        return Math.pow(lado, 2);
    }

    @Override
    public double calcularPerimetro(){
        return 4 * lado;
    }
}
