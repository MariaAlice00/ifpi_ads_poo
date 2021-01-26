public class Banco {
	private Conta[] contas;
	private int indice = 0;

	public Banco() { 
		contas = new Conta[10];
	}

	public Banco(int tamanho) { 
		contas = new Conta[tamanho];
	}

	public void inserir(Conta c) {
		contas[indice] = c;
		indice++;
	}

	public Conta consultar(String numero) {
		Conta c = null;
		for (int i = 0; i < indice; i++) {
			if (contas[i].numero.equals(numero)) {
				c = contas[i];
				break;
			}
		}
		return c;
	}

	private int consultarIndice(String numero) {
		int posicao = -1;
		for (int i = 0; i < indice; i++) {
			if (contas[i].numero.equals(numero)) {
				posicao = i;
				break;
			}
		}
		return posicao;
	}

	public void creditar(String numero, double valor) {
		Conta c;
		c = consultar(numero);
		if (c != null)
			c.sacar(valor);
		else
			System.out.println("Essa conta não existe.");
	}

	public void alterar(Conta c) {
		int indice = consultarIndice(c.numero);
		if (indice != -1) {
			contas[indice] = c;
		}
	}

	public void excluir(String numero) {
		int posicao = consultarIndice(numero);
		if (posicao != -1) {
			for (int i = posicao; i < indice; i++) {
				contas[i] = contas[i + 1];
			}

			indice--;
		}   
  }
}
