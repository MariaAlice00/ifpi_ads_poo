public class Teste {
    public static void main(String[] args) {
        ProdutoPerecivel produto = new ProdutoPerecivel();

        produto.id = 12;
        produto.descricao = "Um refrigerante";
        produto.quantidade = 1;
        produto.valor = 3.50;
        produto.setDataValidade("20/01/2021");
        
        System.out.println("id: " + produto.id);
        System.out.println("Descrição: " + produto.descricao);
        System.out.println("Quantidade: " + produto.quantidade);
        System.out.println("Valor: R$ " + produto.valor);
        System.out.println("Está vencido? " + produto.dataValida("22/01/2021"));
    }
}
