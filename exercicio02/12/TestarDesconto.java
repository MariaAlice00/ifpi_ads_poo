package questao12teste;

public class TestarDesconto {
    public static void main(String[] args) {
        Desconto total = new Desconto();
        
        total.valor = 1000;
        total.desconto = 20;
        
        System.out.println(total.calcula());
    } 
}
