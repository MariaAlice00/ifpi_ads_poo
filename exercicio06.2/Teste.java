public class Teste {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        CalculadoraCientifica cc = new CalculadoraCientifica();

        System.out.println(c.soma(2, 10));
        System.out.println(c.multiplica(3, 7));
        System.out.println(c.divisao(10, 4));

        System.out.println(cc.exponenciar(2, 3));
        System.out.println(cc.divisaoLogica(11, 4, true));
        System.out.println(cc.divisaoLogica(11, 4, false));
    }
}
