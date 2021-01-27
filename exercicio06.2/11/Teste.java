/*(V) em uma instancia b da classe B, se fizermos b instanceof A retorna true */

/*
public class Teste {
    public static void main(String[] args) {
        B b = new B();

        System.out.println(b instanceof A);
    }
}
*/

/*(V) em uma instancia a da classe A, se fizermos a instanceof B retorna false */

/*
public class Teste {
    public static void main(String[] args) {
        A a = new A();

        System.out.println(a instanceof B);
    }
}
*/

/*(V) B possui o atributo1/*

/*(V) Em B o atributo não é visível */

/*(V) Caso o atributo fosse modificado de private para protected, poderia ser
acessado normalmente em B */

public class Teste {
    public static void main(String[] args) {
        A a = new A();

        System.out.println(a instanceof B);
    }
}
