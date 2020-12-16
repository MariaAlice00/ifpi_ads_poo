public class TestaJogador {
    public static void main(String[] args) {
        Jogador j1 = new Jogador(3, 30, 200);
        Jogador j2 = new Jogador(5, 20, 200);

        j1.calcularAtaque(3, 30);
        j2.atacar(j2);

        System.out.println(j1.pontosAtuais);
        System.out.println(j2.pontosAtuais);
    }
}
