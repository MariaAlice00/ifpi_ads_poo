public class Produto {
    int codigo;
    String descricao;
    double valor;
    int quant;
    int quantMin = 5;

    Produto(int codigo, String descricao, double valor, int quant) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
        this.quant = quant;
    }

    boolean baixar(int quant) {
        if ((this.quant - quant) < quant) {
            return false;
        } else {
            this.quant -= quant;
            return true;
        }
    }

    void repor(int quant)  {
        this.quant += quant;
    }

    void reajuste(double taxa) {
        this.valor += (this.valor / 100) * taxa;
    }

    public String toString(){
        return "Codigo: " + this.codigo + "\nDescricao: " + this.descricao + "\nValor: R$ " + this.valor + "\nQuantidade: " + this.quant;
    }
}
