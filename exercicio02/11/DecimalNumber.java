package questao11;

public class DecimalNumber {
    double num;
    
    int exibirInteiro() {
        return (int) num;
    }
    
    double exibirDecimal() {
        return num - exibirInteiro();
    }
}
