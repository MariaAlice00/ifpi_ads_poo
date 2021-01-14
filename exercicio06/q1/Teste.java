public class Teste {
    public static void main(String[] args) {
        Carro c = new Carro();
        CarroEletrico ce = new CarroEletrico();

        c.ano = 2000;
        c.modelo = "Camaro";
        System.out.println("Carro: " + c.modelo + " / Ano: " + c.ano);
        
        ce.ano = 2010;
        ce.modelo = "Uno";
        System.out.println("Carro: " + ce.modelo + " / Ano: " + ce.ano);
    }
}
