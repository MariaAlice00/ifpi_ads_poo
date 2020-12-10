package questao11teste;

public class TestarDecimalNumber {
    public static void main(String[] args) {
        DecimalNumber x = new DecimalNumber();
        
        x.num = 9.18;
        
        System.out.println(x.exibirInteiro());
        System.out.println(x.exibirDecimal());
    }
}
