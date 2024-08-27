package test;

import entities.Vendedor;
import java.util.Scanner;

public class TesteVendedor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criação de uma instância de Vendedor solicitando entrada de dados
        System.out.println("Criando um novo vendedor...");
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o endereço: ");
        String endereco = scanner.nextLine();

        System.out.print("Digite o telefone: ");
        String telefone = scanner.nextLine();

        System.out.print("Digite o código do setor: ");
        int codigoSetor = scanner.nextInt();

        System.out.print("Digite o salário base: ");
        double salarioBase = scanner.nextDouble();

        System.out.print("Digite o imposto (em %): ");
        double imposto = scanner.nextDouble();

        System.out.print("Digite o valor das vendas: ");
        double valorVendas = scanner.nextDouble();

        System.out.print("Digite a comissão (em %): ");
        double comissao = scanner.nextDouble();

        Vendedor vendedor = new Vendedor(nome, endereco, telefone, codigoSetor, salarioBase, imposto, valorVendas, comissao);

        // Exibindo os detalhes do vendedor
        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Endereço: " + vendedor.getEndereco());
        System.out.println("Telefone: " + vendedor.getTelefone());
        System.out.println("Código do Setor: " + vendedor.getCodigoSetor());
        System.out.println("Salário Base: " + vendedor.getSalarioBase());
        System.out.println("Imposto: " + vendedor.getImposto() + "%");
        System.out.println("Valor das Vendas: " + vendedor.getValorVendas());
        System.out.println("Comissão: " + vendedor.getComissao() + "%");
        System.out.println("Salário Final (com comissão): " + vendedor.calcularSalario());
    }
}
