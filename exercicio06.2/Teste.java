public class Teste {
    public static void main(String[] args) {
        Funcionario f = new Professor();

        ((Professor)f).setTitulacao("123");
        ((Professor)f).setSalario(7500);
        System.out.println(((Professor)f).getSalarioPrimeiraParcela());
        System.out.println(((Professor)f).getSalarioSegundaParcela());
    }
}
