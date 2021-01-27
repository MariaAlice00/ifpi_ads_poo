/*b. O código abaixo é possível? Justifique.

public class Teste {
    public static void main(String[] args) {
        Peixe p = new Animal();

    }
} 

Não. O nível de herança está invertido, no caso o correto seria... */

public class Teste {
    public static void main(String[] args) {
        Animal p = new Peixe();

    }
}
