public class Jogador {
    /*a. Crie 3 atributos inteiros representando força, nível e pontos atuais;*/
    int forca, nivel, pontosAtuais;

    /*b. Crie um construtor no qual os 3 parâmetros são passados e inicialize os respectivos atributos;*/
    Jogador (int forca, int nivel, int pontosAtuais) {
        this.forca = forca;
        this.nivel = nivel;
        this.pontosAtuais = pontosAtuais;
    }

    /*c. Crie um método que calcule os pontos relativos a um ataque que são calculados pela multiplicação de força pelo nível;*/
    public void pontosAtaque() {
        this.pontosAtuais += this.forca * this.nivel;
    }

    /*d. Crie um método chamado atacar em que é passado um outro jogador como parâmetro e é feita a subtração de pontos de tal jogador baseado na quantidade de pontos do 
    jogador atual (“this”).*/
    public void atacar(Jogador adversario) {
        adversario.pontosAtuais -= this.pontosAtuais;
    }
}
