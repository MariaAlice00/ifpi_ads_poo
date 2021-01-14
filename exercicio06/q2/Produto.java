public class Produto {
    int id;
    String descricao;
    int quantidade;
    double valor;


    public void repor(int valor){
        this.quantidade += valor;
    }

    public void darBaixa(int valor){
        this.quantidade -= valor;
    }
}
