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
			System.out.println("O pre�o do patinete para adultos �: R$"+precoAdult);
		else
			System.out.println("O pre�o do patinete para crian�as �: R$"+precoCrianc);
	}
	
	public void acessorios1()
	{
		if(this.acessorios==true)
			System.out.println("O patinete possui acess�rios como Capacete, joelheiras, cotoveleiras.");
		else
			System.out.println("O patinete n�o possui acess�rios.");
		
	
		
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
		System.out.println("A marca �: "+this.marca);
		
	}
}
