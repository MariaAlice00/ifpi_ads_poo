package exercicio08;

public class AuditoriaInterna {
    Tributavel[] t = new Tributavel[5];
    private int i = 0;

    public void adicionar(Tributavel t){
        this.t[this.i] = t;
        this.i++;
    }

    public double calculaTributos(){
        double soma = 0;

        for(int c = 0; c < this.i; c++){
            soma += t[c].calculaTributos();
        }

        return soma;
    }
}
