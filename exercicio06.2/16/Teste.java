public class Teste {
    public static void main(String[] args) {
        A a = new B();

        a.setAtributo1(3);

        System.out.println(a.getAtributo1());
        System.out.println(a.metodo1());
    }
}

/* O código não compila porque na classe B existem 2 métodos iguais, com mesmo nome e mesmo parâmetro, ou seja nenhum. Eles até poderiam ter mesmo nome, mas deveriam ter parâmetros diferentes, para evitar uma sobrecarga de métodos.*/