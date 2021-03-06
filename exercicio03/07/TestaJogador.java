/*e. Avalie em uma classe de testes dois jogadores instanciados e inicializados através do construtor. Nessa classe, utilize o método de ataque de cada jogador e ao 
final, verifique qual jogador tem mais pontos.*/

public class TestaJogador {
    public static void main(String[] args) {
        Jogador a = new Jogador(50, 10, 100);
        Jogador b = new Jogador(30, 9, 110);

        a.pontosAtaque(); 
        b.pontosAtaque(); 

        a.atacar(b); 

        System.out.println("Jogador 1: " + a.pontosAtuais);
        System.out.println("Jogador 2: " + b.pontosAtuais);

        if (a.pontosAtuais > b.pontosAtuais) {
            System.out.println(">>> Jogador 1 tem mais pontos.");
        } else {
            System.out.println(">>> Jogador 2 tem mais pontos.");
        }
    }
}
