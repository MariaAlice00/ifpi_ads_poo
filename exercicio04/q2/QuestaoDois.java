class QuestaoDois {
    public static void main(String[] args) {
        Conta[] contas; 
        contas = new Conta[5];
        Conta saldo = new Conta(1, 1000);
        contas[0].saldo = 10;

        System.out.println(contas[0].saldo);    
    }
}
