package questao07;

public class Saudacao {    
    String texto = "Bom dia";
    String destinatario = "Maria";
    
    public String obterSaudacao() {
        String msg = texto + ", " + destinatario;
        return msg;
    }
}
