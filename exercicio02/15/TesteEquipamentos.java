/*15. Crie uma classe chamada TestaEquipamentos e em seu método main:
a. Instancie 2 objetos da classe Equipamento;
b. Ligue o primeiro e desligue o segundo;
c. Chame o método inverte() em cada um dos equipamentos;
d. Faça um if para cada um dos equipamentos testando se o mesmo está ligado. Imprima: “ligado” ou “desligado” dependendo da situação de ambos; */

public class TesteEquipamentos {
    public static void main(String[] args) {
        Equipamentos tv = new Equipamentos();
        Equipamentos radio = new Equipamentos();

        tv.liga();
        radio.desliga();

        tv.inverte();
        radio.inverte();

        if (tv.estaLigado() == true) {
            System.out.println("ligado");
        } else {
            System.out.println("desligado");
        }

        if (radio.estaLigado() == true) {
            System.out.println("ligado");
        } else {
            System.out.println("desligado");
        }
    }
}
