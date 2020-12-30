public class TestaPilha {
    public static void main(String[] args) {
        Pilha p1 = new Pilha();
        p1.empilhar(3);
        p1.empilhar(5);
        p1.empilhar(10);
        p1.empilhar(11);
        p1.empilhar(23);

        p1.estaCheia();

        p1.desempilhar();

        p1.retornaTopo();

        p1.exibir();
    }
}
