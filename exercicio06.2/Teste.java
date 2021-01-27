public class Teste {
    public static void main(String[] args) {
        A a = new B();

        a.setAtributo1(3);

        System.out.println(a.getAtributo1());
        System.out.println(a.metodo1());
    }
}

/* Saída: metodo1, classe A. */