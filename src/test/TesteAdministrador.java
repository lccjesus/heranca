package test;

import entities.Administrador;
import java.util.Scanner;

public class TesteAdministrador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Criando um novo administrador...");
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

        System.out.print("Digite a ajuda de custo: ");
        double ajudaDeCusto = scanner.nextDouble();

        Administrador administrador = new Administrador(nome, endereco, telefone, codigoSetor, salarioBase, imposto, ajudaDeCusto);

        // Exibindo os detalhes do administrador
        System.out.println("Nome: " + administrador.getNome());
        System.out.println("Endereço: " + administrador.getEndereco());
        System.out.println("Telefone: " + administrador.getTelefone());
        System.out.println("Código do Setor: " + administrador.getCodigoSetor());
        System.out.println("Salário Base: " + administrador.getSalarioBase());
        System.out.println("Imposto: " + administrador.getImposto() + "%");
        System.out.println("Ajuda de Custo: " + administrador.getAjudaDeCusto());
        System.out.println("Salário Final (com ajuda de custo): " + administrador.calcularSalario());
    }
}
