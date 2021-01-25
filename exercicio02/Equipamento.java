/*14. Crie uma classe Equipamento com:
a. um atributo ligado (tipo boolean)
b. dois métodos liga() e desliga(). O método liga torna o atributo ligado true e o método desliga torna o atributo ligado false.
c. Crie um método chamado inverte(), que muda o status atual (se ligado, desliga...se desligado, liga)
d. Crie um método que estaLigado() que retorna o valor do atributo ligado
e. Altere o comportamendo dos métodos liga para caso o equipamento já esteja ligado, não ligue novamente. Faça o mesmo com o método desligar. */

public class Equipamento {
    boolean ligado;

    public boolean liga() {
        ligado = true;
        return ligado;
    }

    public boolean desliga() {
        ligado = false;
        return ligado;
    }

    public boolean inverte() {
        if (ligado == true) {
            ligado = false;
        }
        else {
            ligado = true;
        }

        return ligado;
    }

    public boolean estaLigado() {
        return ligado;
    }

}