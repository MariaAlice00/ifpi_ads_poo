/* 4. Crie uma classe chamada ContaImposto com um atributo saldo e número.
a. Modifique os atributos para privado;
b. Crie um método público chamado getSaldo( ) que retorna o saldo atual;
c. Crie um construtor onde são passados os 2 parâmetros para setar os atributos;
d. Implemente os métodos de crédito e débito como públicos;
e. Crie um método privado chamado retemImposto(double valorDebito) que seja chamado toda vez que houver um débito e retire 0,38% do valor do débito; */

public class ContaImposto {
    private double saldo;
    private int numero;

    ContaImposto(double saldo, int numero) {
        this.saldo = saldo;
        this.numero = numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void credito(double valor) {
        this.saldo += valor;
    }

    public void debito(double valor) {
        this.saldo -= valor;
        this.saldo -= retemImposto(valor);
    }
    private double retemImposto(double valorDebito) {
        return (valorDebito * 0.38) / 100;
    }
}