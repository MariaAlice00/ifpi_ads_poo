public class Banco {
	Conta[] contas;
	int indice = 0;

	Banco() { 
		contas = new Conta[10];
	}

	Banco(int tamanho) { 
		contas = new Conta[tamanho];
	}

	void inserir(Conta c) {
		contas[indice] = c;
		indice++;
	}

	Conta consultar(String numero) {
		Conta c = null;
		for (int i = 0; i < indice; i++) {
			if (contas[i].numero.equals(numero)) {
				c = contas[i];
				break;
			}
		}
		return c;
	}

	int consultarIndice(String numero) {
		int posicao = -1;
		for (int i = 0; i < indice; i++) {
			if (contas[i].numero.equals(numero)) {
				posicao = i;
				break;
			}
		}
		return posicao;
	}

	void creditar(String numero, double valor) {
		Conta c;
		c = consultar(numero);
		if (c != null)
			c.depositar(valor);
		else
			System.out.println("Essa conta não existe.");
	}

	void debitar(String numero, double valor) {
		Conta c;
		c = consultar(numero);
		if (c != null)
			c.sacar(valor);
		else
			System.out.println("Essa conta não existe.");
	}

	void alterar(Conta c) {
		int indice = consultarIndice(c.numero);
		if (indice != -1) {
			contas[indice] = c;
		}
	}

	void excluir(String numero) {
		int posicao = consultarIndice(numero);
		if (posicao != -1) {
			for (int i = posicao; i < indice; i++) {
				contas[i] = contas[i + 1];
			}

			indice--;
		}
    }
	public void transferir(String numCredito, String numDebito, double valor) {
		Conta c1 = consultar(numCredito);
		Conta c2 = consultar(numDebito);
		
		if (c1 != null && c2 != null) {
			c1.transferir(c2, valor);
			System.out.println("Operação realizada com sucesso!");
		} else {
			System.out.printf("Contas não localizadas.");
		} 			
	}
}