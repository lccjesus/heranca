package test;

import entities.Empregado;

import java.util.Scanner;

public class TesteEmpregado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criação de uma instância de Empregado solicitando entrada de dados
        System.out.println("Criando um novo empregado...");
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

        Empregado empregado = new Empregado(nome, endereco, telefone, codigoSetor, salarioBase, imposto);

        // Exibindo os detalhes do empregado
        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Endereço: " + empregado.getEndereco());
        System.out.println("Telefone: " + empregado.getTelefone());
        System.out.println("Código do Setor: " + empregado.getCodigoSetor());
        System.out.println("Salário Base: " + empregado.getSalarioBase());
        System.out.println("Imposto: " + empregado.getImposto() + "%");
        System.out.println("Salário Líquido: " + empregado.calcularSalario());
    }
}
