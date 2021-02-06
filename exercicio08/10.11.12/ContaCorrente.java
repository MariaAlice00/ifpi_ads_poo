package exercicio08;

public class ContaCorrente extends Conta implements Tributavel{
    @Override
    public double calculaTributos(){
        return 0.10 * getSaldo();
    }
}
