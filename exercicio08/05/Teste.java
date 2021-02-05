package exercicio08;

public class Teste {
    public static void main(String[] args) {
        Gerente g = new Gerente(5000, 120000, 2);
        Diretor d = new Diretor(10000, 120000, 5);

        System.out.println(g.getBonificacao());
        System.out.println(d.getBonificacao());
    }
}
