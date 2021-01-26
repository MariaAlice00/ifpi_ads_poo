public class TestaConta {
    public static void main(String[] args) {
        Conta conta1 = new Conta("12", 1000);
        Conta conta2 = new Conta("10", 2000);

        conta1.depositar(100);
        conta2.depositar(200);

        System.out.println(conta1.transferir(conta2, 50));

        System.out.println(conta1.sacar(3000));
        System.out.println(conta2.sacar(50));

        System.out.println(conta1.consultarSaldo());
        System.out.println(conta2.consultarSaldo());
    }
}
