public class TestaProduto {
    public static void main(String[] args) {
        Produto caneta = new Produto(11, "Cor azul, marca BIC", 2.50, 20, 1);
        Produto grafite = new Produto(10, "Ponta 0.6, marca BIC", 3.50, 10, 1);

        caneta.baixar(6);
        caneta.repor(1);
        caneta.reajuste(5);

        grafite.reajuste(2.5);

        System.out.println("Possui o mesmo código? " + caneta.equals(grafite));

        System.out.println(caneta.toString());
        System.out.println("********************");
        System.out.println(grafite.toString());
    }
}
