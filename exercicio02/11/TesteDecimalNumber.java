/*11. Crie uma classe chamada DecimalNumber que tenha um atributo double. Esta classe deve ter dois métodos: um que exiba a parte inteira do atributo e outro que retorne parte decimal. Use cast.*/

public class TesteDecimalNumber {
    public static void main(String[] args) {
        DecimalNumber numero = new DecimalNumber();

        numero.num = 20.5;

        System.out.println("Número: " + numero.num);
        System.out.println("Parte inteira: " + numero.parteInteira());
        System.out.println("Parte decimal: " + numero.parteDecimal());
    }
}
