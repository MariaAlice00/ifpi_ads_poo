public class ContaImposto extends Conta{
    private double taxaDesconto;

    public void setTaxaDesconto(double taxaDesconto) {
        this.taxaDesconto = taxaDesconto;
    }

    public double getTaxaDesconto() {
        return this.taxaDesconto;
    }

    public void debitar(double valor) {
        super.sacar(valor);
        super.sacar(valor * getTaxaDesconto());
    }
}
