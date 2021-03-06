package exercicio08;

public class Retangulo extends FiguraGeometrica {
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
}
