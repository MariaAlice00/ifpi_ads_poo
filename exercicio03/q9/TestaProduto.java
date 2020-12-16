public class TestaProduto {
    public static void main(String[] args) {
        Produto p = new Produto(10982, "banana", 50, 100);
        p.baixar(10); 
        p.baixar(200); 
        p.repor(20); 
        p.reajuste(10); 

        System.out.println(p.toString());
    }
}
