public class Calculadora{
    public int soma (int op1, int op2) {
        return op1 + op2;
    }
    
    public double soma (int op1, int op2) {
        return op1 + op2;
    }
}

/*Qual o problema da definição acima?*/

/* Existe métodos duplicados, com mesmo nome e parâmetros. E no segundo método, há um conflito entre o tipo do método e dos parâmetros. */
