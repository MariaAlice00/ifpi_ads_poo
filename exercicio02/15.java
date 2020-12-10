package questao15;

public class TestaEquipamentos {
    public static void main(String[] args) {
        Equipamento tv = new Equipamento();
        Equipamento celular = new Equipamento();
        
        tv.ligado = true;
        celular.ligado = false;
        
        tv.inverte();
        celular.inverte();
        
        if (tv.estaLigado() == true) {
            System.out.println("A tv está ligada.");
        } else {
            System.out.println("A tv está desligada.");
        }
        
        if (celular.estaLigado() == true) {
            System.out.println("O celular está ligado.");
        } else {
            System.out.println("O celular está desligado.");
        }
    }   
}
