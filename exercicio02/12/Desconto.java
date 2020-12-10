package questao12;

public class Desconto {
    double valor;
    int desconto;
    
    public double calcula() {
        double valorFinal = valor - ((valor / 100) * desconto);
        return valorFinal;
    }
}
