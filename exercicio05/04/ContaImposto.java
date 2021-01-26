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
