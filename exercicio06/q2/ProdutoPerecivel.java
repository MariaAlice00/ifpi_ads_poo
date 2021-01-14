public class ProdutoPerecivel extends Produto{
    String dataValidade;

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor(){
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public boolean dataValida(String dataAtual){
        String dataValidadeDividida[] = this.dataValidade.split("/");
        String dataAtualDividida[] = dataAtual.split("/");

        if( Integer.parseInt(dataAtualDividida[2]) <= Integer.parseInt(dataValidadeDividida[2]) ) {
            if( Integer.parseInt(dataAtualDividida[1]) <= Integer.parseInt(dataValidadeDividida[1]) ){
                if( Integer.parseInt(dataAtualDividida[0]) <= Integer.parseInt(dataValidadeDividida[0]) ){
                    return true;
                }
            }
        }
        return false;
    }
}
