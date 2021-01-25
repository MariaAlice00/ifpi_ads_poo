/* 13. Crie uma classe chamada NumberUtils que tenha um atributo numérico n os
seguintes métodos:
a. isPair(): retorna verdadeiro se o número for par. Aproveitando a implementação desse método, crie outro método "isOdd()" que retorne false se o número for ímpar;
b. isPrime() que retorna true ou false se o número é primo ou não.;
c. printCount() que retorne a contagem crescente em forma de String de zero até o valor do atributo. Ex: "0, 1, 2, 3, 4";
d. printReverseCount() que retorna uma String com contagem decrescente;*/

public class NumberUntils{
    int n;

    public boolean isPair() {
        if (n % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isOdd() {
        if (n % 2 != 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isPrime() {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public void printCount() {
        for (int i = 0; i <= n; i++) {
            System.out.print(i + " ");
        }
    }

    public void printReverseCount() {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

}