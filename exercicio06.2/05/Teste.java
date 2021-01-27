public class Teste {
    public static void main(String[] args) {
        Animal[] animal = new Animal[7];

        Animal gato = new Animal();
        Animal cachorro = new Animal();
        Bovino vaca = new Bovino();
        Bovino boi = new Bovino();
        Bovino bufalo = new Bovino();
        Peixe piranha = new Peixe();
        Peixe dourado = new Peixe();


        animal[0] = gato;
        animal[1] = cachorro;
        animal[2] = vaca;
        animal[3] = boi;
        animal[4] = bufalo;
        animal[5] = piranha;
        animal[6] = dourado;

        for (int i = 0; i < animal.length; i++) {
            if (animal[i] instanceof Animal) {
                System.out.println("Animal");
            }
            if (animal[i] instanceof Bovino) {
                System.out.println("Bovino");
            }
            if (animal[i] instanceof Peixe) {
                System.out.println("Peixe");
            }

            System.out.print("\n");
        }
    }
}

/*
c. Por que o array da classe Animal aceita também os descendentes na
hierarquia? 

Pelo conceito de herança onde Animal é a classe principal e Peixe e Bovino são suas subclasses e por isso elas também são da classe Animal.
*/
