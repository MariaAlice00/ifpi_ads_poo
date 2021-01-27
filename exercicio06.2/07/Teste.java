public class Teste {
    public static void main(String[] args) {
        Pessoa p = new Funcionario();

        ((Funcionario)p).setNome("Maria");
        ((Funcionario)p).setSobrenome("Alice");
        System.out.println("Nome: " + ((Funcionario)p).getNomeCompleto());

        ((Funcionario)p).setSalario(10000);
        System.out.println("Salário: R$ " + ((Funcionario)p).getSalario());

        System.out.println("Primeira parcela: R$ " + ((Funcionario)p).getSalarioPrimeiraParcela());
        System.out.println("Segunda parcela: R$ " + ((Funcionario)p).getSalarioSegundaParcela());
    }
}
