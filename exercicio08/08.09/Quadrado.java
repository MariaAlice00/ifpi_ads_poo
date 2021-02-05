package exercicio0809;
import java.lang.Math;

public class Quadrado implements FiguraGeometrica, Comparavel {
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

    @Override
    public int comparar(FiguraGeometrica fg) {
        if (fg.calcularArea() > this.calcularArea()) {
            return -1;
        }
        else if (fg.calcularArea() == this.calcularArea()) {
            return 0;
        }
        else {
            return 1;
        }
    }
}
