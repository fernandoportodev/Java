package Polimorfismo;

public class Cavalo extends Animal {
	
	@Override
	public void emitirSom()
	{
		System.out.println("Iiiiirrrrí");
	}
	
	public void movimentar()
	{
		System.out.println("correr");
	}
}
