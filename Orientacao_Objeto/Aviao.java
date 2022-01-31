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
			System.out.println("Infelizmente esse avião não poderá decolar, seu peso ultrapassou o limite possível.");
		else
			System.out.println("\nEste avião suporta até 250 toneladas");
	}
	public void acentosTot()
	{
		if(pessoas>acentos)
			System.out.println("Infelizmente esse avião não poderá decolar, os acentos ultrapassou o limite possível.");
		else
			System.out.println("Pode prosseguir com o embarque, este avião está com todos os acentos preenchidos.");
	}
	
	public void status()
	{
		System.out.print("SEJAM TODOS BEM VINDOS A EMPRESA "+ this.empresa);
		System.out.print("\nO modelo do nosso avião é: " +this.modelo);
		System.out.print("\nPossui "+this.acentos+" acentos");
		System.out.print("\nTransporta até "+this.bagagem+" bagagens");
		System.out.print("\nTransporta até "+this.pessoas+" pessoas");
		
	}
	public void mensagem()
	{
		System.out.print("\nTenha uma boa viagem!");
	}
	
	
}
