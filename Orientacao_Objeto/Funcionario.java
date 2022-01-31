package Orientacao_Objeto;

public class Funcionario {
	
	String primeiroNome;
	String nomeCompl;
	int idade;
	int cpf;
	String endereco;
	String email;
	float salario;
	boolean cartaMotorista1;
	char cartaMotorista;
	
	public void possuiCarta()
	{
		this.cartaMotorista1=true;
	}
	public void naopossuiCarta()
	{
		this.cartaMotorista1=false;
	}
	
	public void carta()
	{
		if(this.cartaMotorista1==true)
			System.out.println("Em meu sistema consta que possui Carteira de Motorista, se sim, qual? :");
		else
			System.out.println("Em meu sistema consta que não possui Carteira de Motorista");
	}
	public void status()
	{
		System.out.println("Olá "+this.primeiroNome+", seja bem vindo, segue seus dados abaixo:");
		System.out.println("Seu nome completo é: "+this.nomeCompl);
		System.out.println("Sua idade é: "+this.idade);
		System.out.println("Seu CPF é: "+this.cpf);
		System.out.println("Seu endereço é: "+this.endereco);
		System.out.println("Seu email é: "+this.email);
		System.out.println("Seu salário atualmente é: R$"+this.salario);
		this.naopossuiCarta();
		this.carta();
		
		
	}
}
