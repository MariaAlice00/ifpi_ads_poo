public class Microblog {
    Postagem[] p;
    int indice = 0;
 
    public Microblog() { 
       p = new Postagem[10];
    }
    public Microblog(int tamanho) { 
       p = new Postagem[tamanho];
    }
 
    public void inserir(Postagem i) {
       p[indice] = i;
       indice++;
       System.out.println(p[indice]);
    }
} 