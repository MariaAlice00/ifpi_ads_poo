/*14. Crie uma classe Equipamento com:
a. um atributo ligado (tipo boolean)
b. dois métodos liga() e desliga(). O método liga torna o atributo ligado true e o método desliga torna o atributo ligado false.
c. Crie um método chamado inverte(), que muda o status atual (se ligado, desliga...se desligado, liga)
d. Crie um método que estaLigado() que retorna o valor do atributo ligado
e. Altere o comportamendo dos métodos liga para caso o equipamento já esteja ligado, não ligue novamente. Faça o mesmo com o método desligar. */

public class TesteEquipamento {
    public static void main(String[] args) {
        Equipamento tv = new Equipamento();

        System.out.println(tv.liga());
        System.out.println(tv.desliga());
        System.out.println(tv.inverte());
        System.out.println(tv.estaLigado());
        System.out.println(tv.desliga());
    }
}
