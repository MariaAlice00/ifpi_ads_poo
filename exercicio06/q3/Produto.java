public class Produto {
    int id;
    String descricao;
    int quantidade;
    double valor;

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public int getId() {
        return id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void repor(int valor){
        this.quantidade += valor;
    }

    public void darBaixa(int valor){
        this.quantidade -= valor;
    }
}
