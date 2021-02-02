import java.util.InputMismatchException;
import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		
		try {
			System.out.println("Digite um número inteiro: ");
			a = sc.nextInt();

            System.out.println("Digite um número inteiro: ");
            b = sc.nextInt();
            
            int soma = a + b;

            if (!(soma <= 1000)) {
                throw new Exception("Número muito grande,");
            }

			System.out.println("Soma = " + soma);
			
        } 
        catch (InputMismatchException x) {
			System.out.println("Tipo inválido. Erro: " + x.getMessage()); 
        } 
        catch (Exception x) {
			System.out.println(x.getMessage());
        } 
        finally {
			System.out.println("Fim.");
		}

	}

}