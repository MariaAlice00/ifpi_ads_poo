public class Conta {
    String num;
    double saldo;

    Conta(String num, double valor) {
        this.num = num;
        this.saldo = valor;
    }

    void sacar(double valor) {
        saldo -= valor;
    }

    void depositar(double valor) {
        saldo += valor;
    }

    double consultarSaldo() {
        return saldo;
    }

    void transferir(Conta destino, double valor) {
        this.sacar(valor);
        destino.depositar(valor);
    }
}
