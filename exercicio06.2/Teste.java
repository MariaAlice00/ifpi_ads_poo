public class Teste {
    public static void main(String[] args) {
        Professor f = new Professor();

        f.setNome("Maria");
        f.setSobrenome("Alice");
        f.setMatricula(1987);
        f.setSalario(1500.75);
        f.setTitulacao("Matemática");

        System.out.println("Nome: " + f.getNomeCompleto());
        System.out.println("Matricula: " + f.getMatricula());
        System.out.println("Salario: " + f.getSalario());
        System.out.println("Primeira parcela: " + f.getSalarioPrimeiraParcela());
        System.out.println("Segunda parcela: " + f.getSalarioSegundaParcela());
        System.out.println("Titulação: " + f.getTitulacao());
    }
}
