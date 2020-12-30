public class TestaSenha {
    public static void main(String[] args) {
        Senha minhaSenha;
        minhaSenha = new Senha();

        String valor = " A98167";

        minhaSenha.iguais(valor);
        minhaSenha.iguaisTrim(valor);

        if (minhaSenha.tamanhoSeguro(valor)) {
            System.out.println("Tamanho adequado");
        }
        else {
            System.out.println("Tamanho inadequado");
        }

        if (minhaSenha.possuiMaiusculaMinuscula(valor)) {
            System.out.println("Há pelo menos um caractere maiúsculo e pelo menos um minúsculo.");
        }
        else {
            System.out.println("Não há pelo menos um caractere maiúsculo e pelo menos um minúsculo.");
        }

        if (minhaSenha.possuiNumero(valor)) {
            System.out.println("Há pelo menos um caractere numérico.");
        }
        else {
            System.out.println("Não há pelo menos um caractere numérico.");
        }
        
    }
}
