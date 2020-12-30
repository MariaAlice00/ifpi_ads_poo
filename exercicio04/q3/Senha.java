public class Senha {
    String valor = "A98167";

    public void iguais(String senha) {
        if (valor.equals(senha)) {
            System.out.println("É igual.");
        }
        else {
            System.out.println("Não é igual.");
        }
    }

    public void iguaisTrim(String senha) {
        if (valor.trim().equals(senha.trim())) {
            System.out.println("É igual.");  
        }
        else {
            System.out.println("Não é igual.");
        }
    }

    public boolean tamanhoSeguro(String senha) {
        if (senha.length() <= 6){
            return true;
        } 
        else {
            return false;
        }
     }

    public boolean possuiMaiusculaMinuscula(String senha) {
        boolean minuscula = false;
        boolean maiuscula = false;
  
        for (int i = 0; i < senha.length(); i++) {
            int tabelaAscii = senha.charAt(i);

            if (tabelaAscii >= 97 && tabelaAscii <= 122) {
                minuscula = true;
            } 
            else if (tabelaAscii >= 65 && tabelaAscii <= 90){
                maiuscula = true;
            }      
        }

        if (minuscula == true && maiuscula == true) {
            return true;      
        }
        else{
            return false;
        }
    }

    public boolean possuiNumero(String senha) {
        for (int i = 0; i < senha.length(); i++) {
            int tabelaAscii = senha.charAt(i);

            if (tabelaAscii >= 48 && tabelaAscii <= 57) {
                return true;
            }
        }
        return false; 
    }

} 
