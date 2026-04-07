package com.sgp.testes;

import java.util.Scanner;

import com.sgp.modelos.Moto;

public class TesteAcessoMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Moto moto = new Moto("CG 160", "BRA0P52", 2022, 160);
        int opcao;

        do {

            imprimirMenu();
            
            opcao = recebeOp(scanner);

            switch (opcao) {
                case 1:
                    System.out.println(moto.toString());
                    break;
                case 2:
                    alterarNome(moto, scanner);
                    break;
                case 3:
                    alterarPlaca(moto, scanner);
                    break;
                case 4:
                    moto.saudacao();
                    break;
                case 5:
                    alterarCilindrada(moto, scanner);
                    break;
                case 6:
                    alterarAno(moto, scanner);
                    break;
                case 0:
                    System.out.println("Programa finalizado!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }

    public static void imprimirMenu() {
        System.out.println("\n=== Menu de Motos ===");
        System.out.println("1. Mostrar dados da moto");
        System.out.println("2. Alterar nome");
        System.out.println("3. Alterar placa");
        System.out.println("4. Mostrar saudação");
        System.out.println("5. Alterar cilindrada");
        System.out.println("6. Alterar ano");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static int recebeOp(Scanner scanner){
        int opcao;
        try {
            opcao = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Por favor, digite um número válido!");
            opcao = -1;
        }
        return opcao;
    }

    public static void alterarNome(Moto moto, Scanner scanner) {
        System.out.print("Digite o novo nome: ");
        String nome = scanner.nextLine();
        try {
            moto.setNome(nome);
            System.out.println("Nome alterado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void alterarPlaca(Moto moto, Scanner scanner) {
        System.out.print("Digite a nova placa: ");
        String placa = scanner.nextLine();
        try {
            moto.setPlaca(placa);
            System.out.println("Placa alterada com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void alterarCilindrada(Moto moto, Scanner scanner) {
        System.out.print("Digite a nova cilindrada: ");
        try {
            double cilindrada = Double.parseDouble(scanner.nextLine());
            moto.setCilindrada(cilindrada);
            System.out.println("Cilindrada alterada com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void alterarAno(Moto moto, Scanner scanner) {
        System.out.print("Digite o novo ano: ");
        try {
            int ano = Integer.parseInt(scanner.nextLine());
            moto.setAno(ano);
            System.out.println("Ano alterado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}