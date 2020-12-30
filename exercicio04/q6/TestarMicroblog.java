public class TestarMicroblog {
    public static void main(String[] args) {
       Microblog blog = new Microblog(2);
       Postagem post = new Postagem("Bem-vindo!");

       post.curtir();
       
       post.toString();
       
       blog.inserir(post);
    }
}
