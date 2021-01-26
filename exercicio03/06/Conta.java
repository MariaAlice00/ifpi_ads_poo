public class Conta {
    String num;
    int saldo;

    Conta (String num, int saldo) {
        this.num = num;
        this.saldo = saldo;
    }

    public void sacar(int valor) {
        saldo = saldo - valor;
    }

    public void depositar(int valor) {
        saldo = saldo + valor;
    }

    public void transferir(Conta c, int valor) {
        this.sacar(valor);
        c.depositar(valor);
    }
}
