public class Conta {
    String numero;
    double saldo;

    Conta (String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public boolean sacar(double valor) {
        if (saldo - valor < 0) {
            return false;
        } else {
            saldo = saldo - valor;
            return true;
        }
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    public boolean transferir(Conta destino, double valor) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
            return true;
        } else {
            return false;
        }
    }

    public double consultarSaldo() {
        return saldo;
    }
}
