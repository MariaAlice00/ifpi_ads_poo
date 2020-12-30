public class Postagem {
    int id;
    String texto;
    int qtdCurtidas;

    Postagem(String txt) {
        texto = txt;
    }

    void curtir() {
        qtdCurtidas++;
    }

    String toStringS() {
        return "Postagem: " + texto + "Quantidade de curtidas: " + qtdCurtidas;
    }
}
