package Orientacao_Objeto;

public class Paciente {
	String nome;
	int idade;
	String sintoma;
	float altura;
	int contato;
	boolean convenio;
	
	public void convenioTrue()
	{
		this.convenio=true;
	}
	public void convenioFalse()
	{
		this.convenio=false;
	}
	
	public void verifyConvenio()
	{
		if(this.convenio==true)
			System.out.println("\nO paciente possui conv�nio.");
		else
			System.out.println("\nO paciente n�o possui conv�nio.");
	}
	
	public void responsavel()
	{
		if(idade<18)
			System.out.println("O paciente possui menos de 18 anos, contate o respons�vel primeiro. (Contato: "+contato+")");
		else
			System.out.println("O paciente possui mais de 18 anos, em caso de emerg�ncia segue contato dos familiares (Contato: "+contato+")");
	}
	
	public void status()
	{
		System.out.println("Nome do paciente: "+this.nome);
		System.out.println("Idade: "+this.idade);
		System.out.println("Altura: "+this.altura);
		System.out.println("Sintoma: "+this.sintoma);
		
	}
}
