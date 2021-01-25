/* Podemos afirmar que haverá um problema de compilação, pois a variável inteira não foi inicializada previamente? Justifique. */

public class Hotel {
    int quantReservas;
    
    void adicionarReserva() {
        quantReservas++;
    }
}

/*Não haverá problemas de compilação, pois vai ser atribuído um valor automaticamente para a variável quantReservas. */