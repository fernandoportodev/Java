package Polimorfismo;

public class Cachorro extends Animal {
	
	@Override
	public void emitirSom()
	{
		System.out.println("RUF RUF RUF");
	}
	
	public void movimentar()
	{
		System.out.println("correr");
	}
}
