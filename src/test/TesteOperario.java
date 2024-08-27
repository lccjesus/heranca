package test;

import entities.Operario;
import java.util.Scanner;

public class TesteOperario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criação de uma instância de Operario solicitando entrada de dados
        System.out.println("Criando um novo operário...");
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

        System.out.print("Digite o valor da produção: ");
        double valorProducao = scanner.nextDouble();

        System.out.print("Digite a comissão (em %): ");
        double comissao = scanner.nextDouble();

        Operario operario = new Operario(nome, endereco, telefone, codigoSetor, salarioBase, imposto, valorProducao, comissao);

        // Exibindo os detalhes do operário
        System.out.println("Nome: " + operario.getNome());
        System.out.println("Endereço: " + operario.getEndereco());
        System.out.println("Telefone: " + operario.getTelefone());
        System.out.println("Código do Setor: " + operario.getCodigoSetor());
        System.out.println("Salário Base: " + operario.getSalarioBase());
        System.out.println("Imposto: " + operario.getImposto() + "%");
        System.out.println("Valor da Produção: " + operario.getValorProducao());
        System.out.println("Comissão: " + operario.getComissao() + "%");
        System.out.println("Salário Final (com comissão): " + operario.calcularSalario());
    }
}
