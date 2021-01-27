public class CalculadoraCientifica extends Calculadora {
    public double exponenciar (double base, double expoente){
        return Math.pow(base, expoente);
    }

    public double divisaoLogica(double operando1, double operando2, boolean arrendodar) {
        double r = super.divisao(operando1, operando2);

        if (arrendodar == true) {
            return Math.round(r);
        } else {
            return r;
        }
    }
}
