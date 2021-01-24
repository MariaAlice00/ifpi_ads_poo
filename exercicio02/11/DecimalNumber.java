/*11. Crie uma classe chamada DecimalNumber que tenha um atributo double. Esta classe deve ter dois métodos: um que exiba a parte inteira do atributo e outro que retorne parte decimal. Use cast.*/

public class DecimalNumber {
    double num;

    public int parteInteira() {
        return (int)num;
    }

    public double parteDecimal() {
        return num - parteInteira();
    }
}
