/* 13. Crie uma classe chamada NumberUtils que tenha um atributo numérico n os
seguintes métodos:
a. isPair(): retorna verdadeiro se o número for par. Aproveitando a implementação desse método, crie outro método "isOdd()" que retorne false se o número for ímpar;
b. isPrime() que retorna true ou false se o número é primo ou não.;
c. printCount() que retorne a contagem crescente em forma de String de zero até o valor do atributo. Ex: "0, 1, 2, 3, 4";
d. printReverseCount() que retorna uma String com contagem decrescente;*/

public class TesteNumberUntils {
    public static void main(String[] args) {
        NumberUntils num = new NumberUntils();

        num.n = 7;

        System.out.println("É par? " + num.isPair());
        System.out.println("É ímpar? " + num.isOdd());
        System.out.println("É primo? " + num.isPrime());
        num.printCount();
        System.out.print("\n");
        num.printReverseCount();
    }
}
