/*15. Crie uma classe chamada TestaEquipamentos e em seu método main:
a. Instancie 2 objetos da classe Equipamento;
b. Ligue o primeiro e desligue o segundo;
c. Chame o método inverte() em cada um dos equipamentos;
d. Faça um if para cada um dos equipamentos testando se o mesmo está ligado. Imprima: “ligado” ou “desligado” dependendo da situação de ambos; */

public class Equipamentos {
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
