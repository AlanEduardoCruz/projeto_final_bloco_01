package ecommerce;

import java.util.Scanner;

import ecommerce.util.Cores;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		boolean sair = false;

		while (!sair) {

			// Impressão do menu principal

			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+ "**************************************************");
			System.out.println("                                                  ");
			System.out.println("               BICICLETARIA ZONA SUL              ");
			System.out.println("                                                  ");
			System.out.println("**************************************************");
			System.out.println("                                                  ");
			System.out.println("          1 - Cadastrar produtos                  ");
			System.out.println("          2 - Listar produtos                     ");
			System.out.println("          3 - Atualizar Produtos                  ");
			System.out.println("          5 - Apagar produto                      ");
			System.out.println("          6 - Sair                                ");
			System.out.println("                                                  ");
			System.out.println("**************************************************");
			System.out.println(" Entre com a opcao desejada:                      ");
			System.out.println("                                                  " + Cores.TEXT_RESET);

			// ler a opcao do usuário

			int opcao = leia.nextInt();

			// processa opcao escolhida

			switch (opcao) {
			case 1:
				System.out.println(" Cadastrar produtos");
				break;

			case 2:
				System.out.println(" Listar produtos ");
				break;

			case 3:
				System.out.println(" Atualizar produtos ");
				break;

			case 4:
				System.out.println(" Apagar produto ");
				break;

			case 6:
				// Sair do programa
				System.out.println("Saindo do programa...");
				sair = true;
				break;
			default:
				System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
				break;

			}
			leia.close();
		}

	}

}
