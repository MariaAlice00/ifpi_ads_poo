public class Teste {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Ana", "Clara");

        p.setNome("Maria");
        p.setSobrenome("Alice");

        System.out.println(p.getNomeCompleto());
    }
}
