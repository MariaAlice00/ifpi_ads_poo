public class Teste {
    public static void main(String[] args) {
        Empregado e = new Empregado();
        Diarista d = new Diarista();
        Horista h = new Horista();

        System.out.println(e.calcularSalario());
        System.out.println(d.calcularSalario());
        System.out.println(h.calcularSalario());
    }
}
