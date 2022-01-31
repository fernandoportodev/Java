package Orientacao_Objeto;

public class Aviao {
	String empresa;
	String modelo;
	int acentos;
	int bagagem;
	int peso;
	int pessoas;
	
	public void qtdMax()
	{
		if(peso>250)
			System.out.println("Infelizmente esse avi�o n�o poder� decolar, seu peso ultrapassou o limite poss�vel.");
		else
			System.out.println("\nEste avi�o suporta at� 250 toneladas");
	}
	public void acentosTot()
	{
		if(pessoas>acentos)
			System.out.println("Infelizmente esse avi�o n�o poder� decolar, os acentos ultrapassou o limite poss�vel.");
		else
			System.out.println("Pode prosseguir com o embarque, este avi�o est� com todos os acentos preenchidos.");
	}
	
	public void status()
	{
		System.out.print("SEJAM TODOS BEM VINDOS A EMPRESA "+ this.empresa);
		System.out.print("\nO modelo do nosso avi�o �: " +this.modelo);
		System.out.print("\nPossui "+this.acentos+" acentos");
		System.out.print("\nTransporta at� "+this.bagagem+" bagagens");
		System.out.print("\nTransporta at� "+this.pessoas+" pessoas");
		
	}
	public void mensagem()
	{
		System.out.print("\nTenha uma boa viagem!");
	}
	
	
}
