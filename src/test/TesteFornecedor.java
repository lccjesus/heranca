package test;

import entities.Fornecedor;

import java.util.Scanner;

public class TesteFornecedor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criação de uma instância de Fornecedor solicitando entrada de dados
        System.out.println("Criando um novo fornecedor...");
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o endereço: ");
        String endereco = scanner.nextLine();

        System.out.print("Digite o telefone: ");
        String telefone = scanner.nextLine();

        System.out.print("Digite o valor de crédito: ");
        double valorCredito = scanner.nextDouble();

        System.out.print("Digite o valor da dívida: ");
        double valorDivida = scanner.nextDouble();

        Fornecedor fornecedor = new Fornecedor(nome, endereco, telefone, valorCredito, valorDivida);

        // Exibindo os detalhes do fornecedor
        System.out.println("Nome: " + fornecedor.getNome());
        System.out.println("Endereço: " + fornecedor.getEndereco());
        System.out.println("Telefone: " + fornecedor.getTelefone());
        System.out.println("Valor do Crédito: " + fornecedor.getValorCredito());
        System.out.println("Valor da Dívida: " + fornecedor.getValorDivida());
        System.out.println("Saldo: " + fornecedor.obterSaldo());
    }
}
