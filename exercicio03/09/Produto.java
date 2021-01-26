public class Produto {
    int codigo, quantidade, quantidadeMinima;
    String descricao;
    double valor;

    Produto (int codigo, String descricao, double valor, int quantidade, int quantidadeMinima)  {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
        this.quantidade = quantidade;
        this.quantidadeMinima = quantidadeMinima;
    }   

    public void baixar(int quantidade) {
        if (this.quantidade >= this.quantidadeMinima) {
            this.quantidade -= quantidade;
        } else {
            this.quantidade = quantidade;
        }
    }

    public void repor(int quantidade) {
        this.quantidade += quantidade;
    }

    public void reajuste(double taxa) {
        valor += (valor * taxa) / 100;
    }

    public String toString() {
        return "Código: " + codigo + "\nQuantidade: " + quantidade + "\nQuantidade mínima: " + quantidadeMinima + "\nDescrição: " + descricao + "\nValor: R$ " + valor;
    }

    public boolean equals(Produto produto) {
        if (produto.codigo == this.codigo) {
            return true;
        } else {
            return false;
        }
    }
}
