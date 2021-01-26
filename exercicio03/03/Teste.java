/*Qual o resultado da execução abaixo. Justifique.*/

public class Teste {
    int b = 1;
    int a;

    Teste(int a) {
        a = b + a;
        System.out.print(this.a);
    }
    public static void main(String args[]) {
        Teste t = new Teste(2);
    }
}

/*O resultado é 0. O atributo t da classe Teste não foi inicializado antes, assim foi atribuído um valor automático pra ele.*/
