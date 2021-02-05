package exercicio08;

public class Diretor extends Funcionario {
    private double salario;
    private double lucrosEmpresa;
    private double taxaParticipacao;

    public Diretor(double salario, double lucrosEmpresa, double taxaParticipacao) {
        this.salario = salario;
        this.lucrosEmpresa = lucrosEmpresa;
        this.taxaParticipacao = taxaParticipacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getLucrosEmpresa() {
        return lucrosEmpresa;
    }

    public void setLucrosEmpresa(double lucrosEmpresa) {
        this.lucrosEmpresa = lucrosEmpresa;
    }

    public double getTaxaParticipacao(){
        return taxaParticipacao;
    }

    public void setTaxaParticipacao(double taxaParticipacao) {
        this.taxaParticipacao = taxaParticipacao;
    }

    @Override
    public double getBonificacao() {
        return salario + ((taxaParticipacao / 100) * lucrosEmpresa);
    }
}
