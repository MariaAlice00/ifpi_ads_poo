public class Hora {
    private int horas;
    private int minutos;
    private int segundos;

    public void lerHora(int horas) {
        this.horas = horas;
    }
    
    public void lerMinutos(int minutos) {
        this.minutos = minutos;
    }
    
    public void lerSegundos(int segundos) {
        this.segundos = segundos;
    }

    public String imprimirHora() {
        return this.horas + ":" + this.minutos + ":" + this.segundos;
    }
}
