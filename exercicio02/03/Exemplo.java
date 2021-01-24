/*3. Explique detalhadamente o resultado após a execução abaixo do código:*/

public class Exemplo {
    public static void main(String[] args) {
        int a = 9;
        int b = 0;
        if ((a > 11) && (++b <= 100)) {
            System.out.println(a*b);
        }
        else {
            System.out.println(a-b);
        }
    }
}

/*
São inicializadas as variáveis a e b respectivamente com os valores 9 e 0. 
É colocada uma condição, se a for maior que 11 e também b adicionado de 1 unidade for menor ou igual a 100, deve ser mostrado na tela a multiplicação de a e b, senão deve ser mostrado a diferença de a e b.
Como a(9) é menor que 11, é impresso na tela a diferença de a e b, ou seja, 9 - 0 = 0.
*/
