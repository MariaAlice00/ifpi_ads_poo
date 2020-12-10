package questao14teste;

public class TestarEquipamento {
    public static void main(String[] args) {
        Equipamento e = new Equipamento();
        
        e.ligado = true;
        
        System.out.println(e.liga());
        System.out.println(e.desliga());
        System.out.println(e.inverte());
        System.out.println(e.estaLigado());
    }   
}
