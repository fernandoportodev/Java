package ProjetoIntegrador_1;

import java.util.Scanner;

public class System_Login {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Scanner leia = new Scanner(System.in);
		//Classe_Login conta = new Classe_Login();
		
		String login="", senha="", endereco, pagamento, nome, novoSenha, novoLogin;
		int acesso=0;
		
		
		
		System.out.println("*** SEJA BEM VINDO ***");
		System.out.println("Digite:\n 1-Acessar uma conta existente \n 2-Criar uma conta");
		acesso = read.nextInt();
		
		if(acesso==1) {
			
			System.out.println("Digite seu acesso: ");
			System.out.print("\nLogin: ");
			login = leia.nextLine();
			System.out.print("\nSenha: ");
			senha = leia.nextLine();
			
		
			
		}
		if(acesso==2) 
		{
			System.out.print("\nDigite seu nome: ");
			nome = leia.nextLine();
			System.out.print("\nDigite seu endereço e complemento: ");
			endereco = leia.nextLine();
			System.out.print("\nQual sua forma de pagamento? Cartão ou dinheiro? ");
			pagamento = leia.nextLine();
			System.out.println("Crie seu login: ");
			login = leia.nextLine();
			System.out.println("Cria sua senha: ");
			senha = leia.nextLine();
			System.out.println("Usuário criado com sucesso!");
		}
		// VERIFICAR CRIAÇÃO LOGIN 
			if(login.equals("admin") && senha.equals("admin1")) { 
				System.out.println("Usuário "+login+" logado com sucesso");
			}
			else {
				System.out.println("Login ou senha inválidos!");
			}
		
		}
		
		
		}
		
		
		

	
