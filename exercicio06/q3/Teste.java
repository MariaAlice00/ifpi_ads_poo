public class Teste {
    public static void main(String[] args) {
        Estoque e = new Estoque();

        System.out.println(e.inserir(12,"Refrigerantes", 5, 100));
        System.out.println(e.inserir(38,"Canetas", 10, 20.50));

        System.out.println(e.consultar(38).getId());

        System.out.println(e.excluir(12));
    }
}
