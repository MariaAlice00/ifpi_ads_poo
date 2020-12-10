package questao13teste;

public class TestarNumberUtils {
    public static void main(String[] args) {
        NumberUtils x = new NumberItils();
        
        x.num = 17;
        
        System.out.println(x.isPair());
        System.out.println(x.isOdd());
        x.printCount();
        x.printReverseCount();
    }
}
