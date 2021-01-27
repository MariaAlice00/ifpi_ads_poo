/* 
Animal a = new Bovino();        
a.setProducaoLeite(5);

O método setProducaoLeite (int) é indefinido para o tipo Animal.

Solução a seguir.
*/

public class Teste {
    public static void main(String[] args) {
        Animal a = new Bovino();

        ((Bovino)a).setProducaoLeite(5);
    }
}
