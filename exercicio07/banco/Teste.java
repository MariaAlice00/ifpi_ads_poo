import javax.management.RuntimeErrorException;

public class Teste {
    public static void main(String[] args) {
        try {
            throw new RuntimeErrorException();
        } catch (RuntimeErrorException e) {
            try {
                throw new RuntimeException();
            } catch (untimeException e2) {
                System.out.print("A");
            }
            System.out.print("B");
        }
        System.out.print("C");
    }
}
