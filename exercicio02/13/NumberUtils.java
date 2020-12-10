package questao13;

public class NumberUtils {
    int num;
    
    public boolean isPair() {
        if (num % 2 == 0) {
            return true;
        }
    }
    
    public boolean isOdd() {
        if (num % 2 != 0) {
            return false;
        }
    }
    
    public boolean isPrime() {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public void printCount() {
        for (int i = 0; i <= num; i++) {
            System.out.println(i + " ");
        }
    }
    
    public void printReverseCount() {
        for (int i = 0; i >= num; i--) {
            System.out.println(i + " ");
        }
    }
}
