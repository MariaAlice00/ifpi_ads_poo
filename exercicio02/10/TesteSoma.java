/*10. Crie uma classe Soma que tenha dois atributos numéricos e que tenha um método calculaSoma(), que retorna a soma dos dois atributos.*/

public class TesteSoma {
    public static void main(String[] args) {
        Soma s = new Soma();
        s.a = 2;
        s.b = 13;

        System.out.println("Soma: " + s.calculaSoma());
    }
}
