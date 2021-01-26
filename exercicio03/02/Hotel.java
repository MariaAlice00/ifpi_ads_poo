/*Qual o resultado da compilação e/ou execução da classe que tenha o método acima? Justifique. */

public class Hotel {
    int quantReservas;
    
    void adicionarReserva() {
        quantReservas++;
    }

    public static void main(String args[]) {
        Hotel hotel = new Hotel(2);
        System.out.print(hotel.quantReservas);
        }        
}

/*Vai dar erro, pois a classe Hotel não foi criada para solicitar parâmetro. O construtor Hotel está indefinido. */
