package Orientacao_Objeto;

public class Cliente {
	String nome;
	int idade;
	String endereco;
	String email;
	int contato;
	int cpf;
	
	public void idadeMin() 
	{
		if(this.idade<18)
			System.out.println("Infelizmente n�o podemos seguir com seus dados, voc� possui menos de 18 anos.");
		else
			System.out.println("Muito obrigado pelas informa��es, seguiremos com seus dados.");
	}
	
	public void status() 
	{
		System.out.println("Seus dados foram computados, muito obrigado!");
		System.out.println("A idade �: " +this.idade);
		System.out.println("O endere�o �: " +this.endereco);
		System.out.println("O email �: "+this.email);
		System.out.println("O contato �: "+this.contato);
		System.out.println("O CPF �: "+this.cpf);
	}
	
	
}
