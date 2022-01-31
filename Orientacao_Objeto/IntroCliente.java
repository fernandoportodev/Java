package Orientacao_Objeto;


public class IntroCliente {
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		
		cliente1.nome = "Fernando";
		cliente1.idade = 22;
		cliente1.endereco = "Avenida Aricanduva, 8256";
		cliente1.email = "teste123@gmail.com";
		cliente1.contato = 951005100;
		cliente1.cpf = 123456789;
		
		cliente1.status();
		cliente1.idadeMin();
		
		
					
		
		
		
		
				
				
	}
}
