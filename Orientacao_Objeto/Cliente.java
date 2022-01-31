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
			System.out.println("Infelizmente não podemos seguir com seus dados, você possui menos de 18 anos.");
		else
			System.out.println("Muito obrigado pelas informações, seguiremos com seus dados.");
	}
	
	public void status() 
	{
		System.out.println("Seus dados foram computados, muito obrigado!");
		System.out.println("A idade é: " +this.idade);
		System.out.println("O endereço é: " +this.endereco);
		System.out.println("O email é: "+this.email);
		System.out.println("O contato é: "+this.contato);
		System.out.println("O CPF é: "+this.cpf);
	}
	
	
}
