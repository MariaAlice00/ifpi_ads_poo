public class Conta {
	public String numero; // mudança da visibilidade de privada para pública, para conseguir implementar os métodos
    private double saldo;
	
	public Conta(String numero, double valor) {
		this.numero = numero;
		this.saldo = valor;
	}

	public void sacar(double valor) {
		saldo = saldo - valor;
	}
	
	public void depositar(double valor) {
		saldo = saldo + valor;
	}
	
	public double consultarSaldo() {
		return saldo;
	}
	
	public void transferir(Conta destino, double valor) {
		saldo = saldo - valor;
		destino.saldo = destino.saldo + valor;
	}		
}
