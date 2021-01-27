/* Diga o que ocorre com o código abaixo e justifique: */

public class Teste {
    public static void main(String[] args) {
        A a = new B();

        System.out.println(a.metodo2());
    }
}

/* Ocorre um erro, pois o método metodo2 é indefinido para o tipo A. Ele foi definido para B, e como o conceito de herança se aplica B herda de A, não o contrário.*/
