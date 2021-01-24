/*12. Crie uma classe chamada Desconto que tenha como atributos dois valores referentes a um valor original de uma conta e um desconto em porcentagem. Crie um método calcula() que retorne um valor calculando o desconto da seguinte forma: valorCalculado = valorOriginal * (1-desconto/100) .
Ex: valor: 120 desconto: 10. Valor calculado: 108*/

public class Desconto {
    double valor, desconto;

    public double calcula() {
        double valorCalculado = valor * (1 - (desconto / 100));
        return valorCalculado;
    }
}
