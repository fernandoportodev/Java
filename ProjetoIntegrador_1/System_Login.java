package ProjetoIntegrador_1;

import java.util.Scanner;

public class System_Login {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Scanner leia = new Scanner(System.in);
		Classe_Usuario usuario = new Classe_Usuario();
		
		//Classe_Login conta = new Classe_Login();
		
		String login="", senha="", endereco, pagamento, nome, x="", y="";
		int acesso=0;
		
		usuario.setUsuario("nalu");
		usuario.setSenha("nalu123");
		
		
				
		System.out.println("****** SEJA BEM VINDO ******");
		System.out.println("\nDigite:\n 1-Acessar uma conta existente \n 2-Criar uma conta");
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
			usuario.setNome(nome);
			System.out.print("\nDigite seu endere�o e complemento: ");
			endereco = leia.nextLine();
			usuario.setEndereco(endereco);
			System.out.print("\nQual sua forma de pagamento? Cart�o ou dinheiro? ");
			pagamento = leia.nextLine();
			usuario.setPagamento(pagamento);
			System.out.print("\nCrie seu login: ");
			//login = leia.nextLine();
			x = leia.nextLine();
			usuario.setUsuario(x);
			System.out.print("\nCria sua senha: ");
			//senha = leia.nextLine();
			y = leia.nextLine();
			usuario.setSenha(y);
			System.out.print("\nUsu�rio criado com sucesso!");
		}
					
		// VERIFICAR CRIA��O LOGIN 
			if(login.equals(usuario.getUsuario()) && senha.equals(usuario.getSenha())) { 
				System.out.println("\nUsu�rio "+usuario.getUsuario()+" logado com sucesso");
			}
			else {
				System.out.println("\nLogin ou senha inv�lidos!");
			}
		
			
			
			
		}
		
		
		}
