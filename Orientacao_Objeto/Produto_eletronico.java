package Orientacao_Objeto;

public class Produto_eletronico {
	String modelo;
	String marca;
	int armazenamento;
	int camera;
	boolean internet;
	
	public void internet5G()
	{
		this.internet=true;
	}
	public void internet4G()
	{
		this.internet=false;
	}
	
	public void capacidade()
	{
		if(armazenamento<16)
			System.out.println("Infelizmente n�o ser� poss�vel tirar foto, n�o h� espa�o suficiente! Libere espa�o e tente novamente");
		else
			System.out.println("Vamos tirar uma foto?    Faz o xiiiiiiiis...");
	}
	
	public void conexao()
	{
		if(this.internet==true)
			System.out.println("Este celular possui conex�o 5G");
		else
			System.out.println("Este celular possui conex�o 4G");
	}
	
	public void status()
	{
		System.out.println("A marca deste telefone celular �: "+this.marca);
		System.out.println("O modelo deste celular �: "+this.modelo);
		System.out.println("Este modelo possui uma c�mera de "+this.camera+" megapixels");
	}
	
	
}
