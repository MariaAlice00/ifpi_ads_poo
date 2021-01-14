public class Teste {
    public static void main(String[] args) {
        ProdutoPerecivel produto = new ProdutoPerecivel();

        produto.setDataValidade("20/01/2021");
        
        System.out.println(produto.dataValida("12/01/2021"));
    }
}