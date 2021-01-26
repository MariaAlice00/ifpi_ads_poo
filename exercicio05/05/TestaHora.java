public class TestaHora {
    public static void main(String[] args) {
        Hora h = new Hora();

        h.lerHora(10);
        h.lerMinutos(30);
        h.lerSegundos(45);

        System.out.println(h.imprimirHora());
    }
}
