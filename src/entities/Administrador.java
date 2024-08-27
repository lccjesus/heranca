package entities;

public class Administrador extends Empregado {
    private double ajudaDeCusto;

    public Administrador() {
    }

    // Construtor com todos os atributos da classe Pessoa, Empregado e Administrador
    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    // Redefine o método calcularSalario para incluir a ajuda de custo
    @Override
    public double calcularSalario() {
        // Salário líquido do empregado + ajuda de custo
        return super.calcularSalario() + ajudaDeCusto;
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "nome='" + getNome() + '\'' +
                ", endereco='" + getEndereco() + '\'' +
                ", telefone='" + getTelefone() + '\'' +
                ", codigoSetor=" + getCodigoSetor() +
                ", salarioBase=" + getSalarioBase() +
                ", imposto=" + getImposto() +
                ", ajudaDeCusto=" + ajudaDeCusto +
                ", salarioLíquido=" + calcularSalario() +
                '}';
    }
}
