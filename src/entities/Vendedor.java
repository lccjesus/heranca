package entities;

public class Vendedor extends Empregado {
    private double valorVendas; // Valor monetário dos artigos vendidos
    private double comissao; // Porcentagem do valorVendas adicionada ao salário

    public Vendedor() {
    }

    // Construtor com todos os atributos da classe Pessoa, Empregado e Vendedor
    public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
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
        // Salário líquido do empregado + comissão sobre as vendas
        return super.calcularSalario() + (valorVendas * (comissao / 100));
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nome='" + getNome() + '\'' +
                ", endereco='" + getEndereco() + '\'' +
                ", telefone='" + getTelefone() + '\'' +
                ", codigoSetor=" + getCodigoSetor() +
                ", salarioBase=" + getSalarioBase() +
                ", imposto=" + getImposto() +
                ", valorVendas=" + valorVendas +
                ", comissao=" + comissao +
                ", salarioLíquido=" + calcularSalario() +
                '}';
    }
}
