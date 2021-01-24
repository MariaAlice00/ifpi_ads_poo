/*8. Crie uma classe TestaSaudacao para testar a classe Saudacao. Nela crie um método main() que instancie um objeto do tipo Saudacao e inicialize os dois atributos. Após isso, exiba (println) o resultado do método obterSaudacao().*/

public class TestaSaudacao {
    public static void main(String[] args) {
        Saudacao s = new Saudacao();

        s.texto = "Bom dia";
        s.destinatario = "Maria Alice";

        System.out.println(s.obterSaudacao());
    }
}
