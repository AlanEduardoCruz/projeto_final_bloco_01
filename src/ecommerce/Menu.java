package ecommerce;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import ecommerce.controller.Controller;
import ecommerce.model.Bicicleta;
import ecommerce.model.BicicletaInfantil;
import ecommerce.util.Cores;

public class Menu {

	public static void main(String[] args) {

		Controller bicicletas = new Controller();

		Scanner leia = new Scanner(System.in);

		int opcao, numero;
		String marca, tipo, cor;
		double preco;

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
			System.out.println("          4 - Apagar produto                      ");
			System.out.println("          5 - Sair                                ");
			System.out.println("                                                  ");
			System.out.println("**************************************************");
			System.out.println(" Entre com a opcao desejada:                      ");
			System.out.println("                                                  " + Cores.TEXT_RESET);

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}

			// processa opcao escolhida

			switch (opcao) {
			case 1:
				System.out.println("Cadastrar produtos");

				System.out.println("Digite a marca da bicicleta: ");
				leia.skip("\\R?");
				marca = leia.nextLine();

				System.out.println("Digite o tipo da bicicleta (ex: Montanha, Urbana, Infantil): ");
				tipo = leia.nextLine();

				System.out.println("Digite a cor da bicicleta (ex: Preto, Vermelho, Azul): ");
				cor = leia.nextLine();

				System.out.println("Digite o preço da bicicleta (em reais): ");
				preco = leia.nextDouble();

				bicicletas.cadastrar(new BicicletaInfantil(bicicletas.gerarNumero(), marca, tipo, cor, preco));

				keyPress();
				break;

			case 2:
				System.out.println("Listar produtos ");
				bicicletas.listarTodas();

				keyPress();
				break;

			case 3:
				System.out.println("Atualizar produtos ");

				System.out.println("Digite o número correspondente: ");
				numero = leia.nextInt();

				var buscarNumero = bicicletas.buscarNaCollection(numero);

				if (buscarNumero != null) {

					System.out.println("Digite a nova marca da bicicleta: ");
					leia.skip("\\R?");
					marca = leia.nextLine();

					System.out.println("Digite o novo tipo da bicicleta (ex: Montanha, Urbana, Infantil): ");
					tipo = leia.nextLine();

					System.out.println("Digite a nova cor da bicicleta (ex: Preto, Vermelho, Azul): ");
					cor = leia.nextLine();

					System.out.println("Digite o novo preço da bicicleta (em reais): ");
					preco = leia.nextDouble();

					bicicletas.atualizar(new BicicletaInfantil(numero, marca, tipo, cor, preco));
				} else {
					System.out.println("Bicicleta não encontrada.");
				}

				keyPress();
				break;

			case 4:
				System.out.println("Apagar produto selecionado");

				System.out.println("Digite o número correspondente: ");
				numero = leia.nextInt();
				bicicletas.deletar(numero);

				keyPress();
				break;

			case 5:
				// Sair do programa
				System.out.println("Saindo do programa...");
				sair = true;
				keyPress();
				break;
			default:
				System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
				keyPress();
				break;

			}

		}
	}

	public static void keyPress() {

		try {

			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}
}
