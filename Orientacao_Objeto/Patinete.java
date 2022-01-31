package Orientacao_Objeto;

public class Patinete {

	int recomendacao;
	String marca;
	float precoAdult;
	float precoCrianc;
	boolean acessorios;
	
	public void idade()
	{
		if(this.recomendacao>=18)
			System.out.println("O preço do patinete para adultos é: R$"+precoAdult);
		else
			System.out.println("O preço do patinete para crianças é: R$"+precoCrianc);
	}
	
	public void acessorios1()
	{
		if(this.acessorios==true)
			System.out.println("O patinete possui acessórios como Capacete, joelheiras, cotoveleiras.");
		else
			System.out.println("O patinete não possui acessórios.");
		
	
		
	}
	
	public void acessoriosFalse()
	{
		this.acessorios=false;
	}
	
	public void acessoriosTrue()
	{
		this.acessorios=true;
	}
	
	public void status()
	{
		System.out.println("A marca é: "+this.marca);
		
	}
}
