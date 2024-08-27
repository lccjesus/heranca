package entities;

public class Operario extends Empregado {
    private double valorProducao; // Valor monetário dos artigos produzidos
    private double comissao; // Porcentagem do valorProducao adicionada ao salário

    public Operario() {
    }

    // Construtor com todos os atributos da classe Pessoa, Empregado e Operario
    public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    // Redefine o método calcularSalario para incluir a comissão
    @Override
    public double calcularSalario() {
        // Salário líquido do empregado + comissão
        return super.calcularSalario() + (valorProducao * (comissao / 100));
    }

    @Override
    public String toString() {
        return "Operario{" +
                "nome='" + getNome() + '\'' +
                ", endereco='" + getEndereco() + '\'' +
                ", telefone='" + getTelefone() + '\'' +
                ", codigoSetor=" + getCodigoSetor() +
                ", salarioBase=" + getSalarioBase() +
                ", imposto=" + getImposto() +
                ", valorProducao=" + valorProducao +
                ", comissao=" + comissao +
                ", salarioLíquido=" + calcularSalario() +
                '}';
    }
}