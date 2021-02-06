package exercicio08;

public class Teste {
    public static void main(String[] args) {
        AuditoriaInterna auditoria = new AuditoriaInterna();

        ContaCorrente c1 = new ContaCorrente();
        ContaCorrente c2 = new ContaCorrente();

        SeguroDeVida s1 = new SeguroDeVida();
        SeguroDeVida s2 = new SeguroDeVida();

        c1.setNome("Maria");
        c1.setSaldo(1200);
        c2.setNome("Ana");
        c1.setSaldo(200);

        auditoria.adicionar(c1);
        auditoria.adicionar(c2);

        auditoria.adicionar(s1);
        auditoria.adicionar(s2);

        System.out.print(auditoria.calculaTributos());
    }
}
