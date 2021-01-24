// 4. Explique detalhadamente qual a saída da execução do trecho de código abaixo e justifique:

public class Opcoes {
    public static void main(String[] args) {
        int op = 1;
        switch(op) {
            case 1: System.out.println(op);
            case 2: System.out.println(op);
            default: System.out.println(op);
        }
    }
}

/* A variável op foi atribuída com o valor 1. Em seguida colocada a estrutura condicional switch. Nos dois primeiros casos foi colocado para mostrar na tela o valor 
de op, e no final como padrão, também o valor de op. E o resultado final foi 3 vezes o valor de op (1).*/
