package controller;

import java.util.Scanner;

public class Menu {

	static Scanner scan = new Scanner(System.in);
	
	OperacoesCliente oc = new OperacoesCliente();
	OperacoesVeiculo ov = new OperacoesVeiculo();
	OperacoesVenda ovd = new OperacoesVenda();
	OperacoesVendedor ovr = new OperacoesVendedor();
	
	
	public static void exibirMenuPrincipal() {

		boolean loop = true;
		
		System.out.println("=== MENU PRINCIPAL DO SISTEMA ===\r\n"
				+ "				1. Frente de Loja.\r\n"
				+ "				2. Manutenção de Cadastro.\r\n"
				+ "				3. Registros.\r\n"
				+ "				4. Encerrar.");

		do {
			System.out.println("Digite uma opção: ");
			int opcao = scan.nextInt();

			switch (opcao) {
			case 1:
				exibirMenuFrenteLoja();
				break;
			case 2:
				exibirMenuManutencaoCadastro();
				break;
			case 3:
				exibirMenuRegistros();
				break;
			default:
				System.out.println(" Saindo do sistema... ");
				loop = false; // condição de parar o loop.
				break;
			}
		} while (loop);

	}

	public static void exibirMenuFrenteLoja() {
		boolean loop = true;
		System.out.println("=== MENU FRENTE DE LOJA ===\r\n"
				+ "				1. Localizar Veículo.\r\n"
				+ "				2. Localizar Vendedor.\r\n"
				+ "				3. Localizar Cliente.\r\n"
				+ "				4. Localizar venda.\r\n"
				+ "				5. Voltar ao menu anterior.");
		
		do {
			System.out.println("Digite uma opção: ");
			int opcao = scan.nextInt();
			
			switch (opcao) {
			case 1:
				
				break;

			case 2:
				
				break;

			case 3:
				
				break;

			case 4:
				
				break;

			default:
				break;
			}
		} while (loop);
	}

	public static void exibirMenuManutencaoCadastro() {
		boolean loop = true;
		
		System.out.println("=== MENU MANUTENÇÃO DE CADASTRO ===\r\n"
				+ "				1. Gerenciar Veículo.\r\n"
				+ "				2. Gerenciar Vendedor.\r\n"
				+ "				3. Gerenciar Cliente.\r\n"
				+ "				4. Gerenciar Venda.\r\n"
				+ "				5. Voltar ao menu anterior.");
		
		do {
			System.out.println("Digite uma opção: ");
			int opcao = scan.nextInt();
			
			switch (opcao) {
			case 1:
			
				break;
			case 2:
			
				break;
			case 3:
				
				break;
			case 4:
			
				break;
			default:
			
				break;
			}					
		} while (loop);
	}

	public static void exibirMenuRegistros() {
		boolean loop = true;
		
		System.out.println("=== MENU REGISTRO ===\r\n"
				+ "			    1. Listar Veículos.\r\n"
				+ "			    2. Listar Vendedores.\r\n"
				+ "			    3. Listar Clientes.\r\n"
				+ "			    4. Listar Vendas.\r\n"
				+ "			    5. Voltar ao menu anterior.\r\n");
		
		do {
			System.out.println("Digite uma opção: ");
			int opcao = scan.nextInt();
			
			switch (opcao) {
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			default:
				break;
			}
		} while (loop);
	}
}
/*
 * public void exibirMenuPrincipal() { int opcao = 0;
 * System.out.println(" ============= Menu Principal =============\n" +
 * " 1. Frente de Loja. \n" + " 2. Administração de Cadastro. \n" +
 * " 3. Sair. \n");
 * 
 * System.out.println(" Digite: "); opcao = scan.nextInt();
 * 
 * switch (opcao) { case 1: { System.out.println(" Acesso a Frente de loja. " );
 * break; } case 2: { System.out.println(" Administração de Cadastro."); break;
 * } case 3: { exibirMenuPrincipal(); break; } default:
 * 
 * } }
 * 
 * case 1: exibirMenuFrenteLoja(); break; case 2:
 * exibirMenuManutencaoCadastro(); break; case 3: exibirMenuRegistros(); break;
 * default: System.out.println(" Saindo do sistema... "); loop = false; //
 * condição de parar o loop.
 */