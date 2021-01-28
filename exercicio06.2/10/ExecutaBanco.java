import java.util.Scanner;

public class ExecutaBanco {
    public static void main(String[] args) {
        Banco b = new Banco();
        Scanner sc = new Scanner(System.in);
        String opcao = "";

        do {
            System.out.println("1-Inserir\n2-Alterar\n3-Excluir\n4-Consultar\n5-Creditar\n6-Debitar\n7-Transferir\n0-Sair");
            opcao = sc.next();
            switch(opcao) {
                case "1": 
                    Conta c1 = new Conta();
                    System.out.println("INSERIR CONTA");
                    System.out.println("Digite o número: ");
                    c1.numero = sc.next();
                    System.out.println("Digite o saldo: ");
                    c1.saldo = sc.nextDouble();

                    b.inserir(c1);
                    break;
                
                case "2":
                    Conta c2 = new Conta();

                    System.out.println("Digite o número: ");
                    c2.setNumero(sc.next());

                    System.out.println("Digite o saldo: ");
                    c2.setSaldo(sc.nextDouble());
                    
                    b.alterar(c2);
                    break;

                case "3":
                    String numExcluir;

                    System.out.println("Número da conta que quer excluir: ");
                    numExcluir = sc.next();

                    b.excluir(numExcluir);
                    break;
                
                case "4":
                    String numConsulta;
                    Conta resposta;

                    System.out.println("Número da conta que quer consultar: ");
                    numConsulta = sc.next();

                    resposta = b.consultar(numConsulta);

                    System.out.println("Número da conta: " + resposta.getNumero() + "\nSaldo: " + resposta.getSaldo());
                    break;

                    case "5":
                    String numCredito;
                    double valorCredito;

                    System.out.println("Número da conta: ");
                    numCredito = sc.next();

                    System.out.println("Valor do crédito: ");
                    valorCredito = sc.nextDouble();

                    b.creditar(numCredito, valorCredito);
                    break;

                case "6":
                    String numDebito;
                    double valorDebito;

                    System.out.println("Número da conta: ");
                    numDebito = sc.next();

                    System.out.println("Valor do débito: ");
                    valorDebito = sc.nextDouble();

                    b.debitar(numDebito, valorDebito);
                    break;
                
                case "7":
                    String numEnviar, numReceber;
                    double valor;
                    
                    System.out.println("Digite o número da conta do emissor: ");
                    numEnviar = sc.next();
                    
                    System.out.println("Digite o número da conta do receptor: ");
                    numReceber = sc.next();
                    
                    System.out.println("Digite o valor da transferência: ");
                    valor = sc.nextDouble();
                    
                    b.transferir(numEnviar, numReceber, valor);;
                    break;

                default:
                    break;
            }
        } while (!opcao.equals("0"));
    }
}
