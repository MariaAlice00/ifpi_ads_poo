public class TestaContaMelhorada {
    public static void main(String[] args) {
        Conta c1 = new Conta("1", 500);
        Conta c2 = new Conta("2", 500);
        c1 = c2;
        c1.sacar(50);
        c1.transferir(c2, 100);

        System.out.println(c1.saldo);
        System.out.println(c2.saldo);

    }
}
