package Orientacao_Objeto;

public class Caneta {
	
	//ATRIBUTOS (variaveis do seu objeto onde irá fazer as definições.)
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	//METODO CONSTRUTOR 
	/*public Caneta(int valor, String v) {
		this.tampada=true;
		this.carga=valor;
		this.cor=v;
	*/	
		
	//METODOS (executa uma ação do seu objeto.)
	public void tampar()
	{
		this.tampada=true;
	}
	public void destampar()
	{
		this.tampada=false;
	}
	public void escrever()
	{
		if(this.tampada==true)
			System.out.println("ERRO! Caneta está tampada");
		else
			System.out.println("Escrevendo...");
	}
	
	
	public void status()
	{
		System.out.println("A cor da caneta é: "+this.cor);
		System.out.println("A ponta é: "+this.ponta);
		System.out.println("Está tampada? "+this.tampada);
		System.out.println("Carga: "+this.carga+"%");
	}
	}

