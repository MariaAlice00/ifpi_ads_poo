package questao11;

public class DecimalNumber {
    double num;
    
    public int exibirInteiro() {
        int i = (int) num;
        return i;
    }
    
    public double exibirDecimal() {
        double d = num % 1;
        return d;
    }
}
