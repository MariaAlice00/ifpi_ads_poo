package exercicio08;

public class Teste {
    public static void main(String[] args) {
        Retangulo r = new Retangulo(10, 2);   
        Quadrado q = new Quadrado(10);
        Circulo c = new Circulo(2);

        System.out.println("RETÂNGULO");
        System.out.println("ÁREA: " + r.calcularArea());
        System.out.println("PERÍMETRO: " + r.calcularPerimetro());

        System.out.println("\nQUADRADO");
        System.out.println("ÁREA: " + q.calcularArea());
        System.out.println("PERÍMETRO: " + q.calcularPerimetro());

        System.out.println("\nCÍRCULO");
        System.out.println("ÁREA: " + c.calcularArea());
        System.out.println("PERÍMETRO: " + c.calcularPerimetro());

        System.out.println(r.comparar(q));
        System.out.println(q.comparar(c));
        System.out.println(c.comparar(r));
    }
}
