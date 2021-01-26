public class TestaContaImposto {
    public static void main(String[] args) {
        ContaImposto conta = new ContaImposto(100, 2456);

        conta.credito(20);
        conta.debito(10);

        System.out.println(conta.getSaldo());
    }   
}
