public class Poupanca extends Conta{
    private double taxaJuros;

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public double getTaxaJuros() {
        return this.taxaJuros;
    }

    public void renderJuros() {
        depositar(getSaldo() * (1 + taxaJuros/100));
    }
}
