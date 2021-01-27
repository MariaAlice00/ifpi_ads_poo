public class Funcionario extends Pessoa{
    private int matricula;
    private double salario;

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }

    public double getSalarioPrimeiraParcela() {
        return 0.6 * getSalario();
    }

    public double getSalarioSegundaParcela() {
        return 0.4 * getSalario();
    }
}
