package exercicio0809;

public class Retangulo implements FiguraGeometrica, Comparavel {
    private double base;
    private double altura;

    Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base){
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        return base * altura;
    }

    @Override
    public double calcularPerimetro(){
        return (base * 2) + (altura * 2);
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
