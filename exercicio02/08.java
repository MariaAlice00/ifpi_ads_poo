package questao08;

public class TestaSaudacao {
    public static void main(String[] args) {
        Saudacao msg = new Saudacao();
        msg.texto = "Bom dia";
        msg.destinatario = "Maria";
        
        System.out.println(msg.obterSaudacao());
    } 
}
