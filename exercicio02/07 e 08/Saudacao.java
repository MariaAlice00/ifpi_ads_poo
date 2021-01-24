/*7. Crie uma classe chamada Saudacao que contenha um atributo chamado texto e outro chamado destinatario, ambos String. Crie um método obterSaudacao() que retorne a concatenação dos dois atributos. Ex. de saída: "Bom dia, João". */

public class Saudacao {
    String texto, destinatario;

    public String obterSaudacao() {
        return texto + ", " + destinatario;
    }
}
