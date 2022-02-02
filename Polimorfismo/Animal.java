package Polimorfismo;

public abstract class Animal {
	
	private String nome;
	private int idade;
		
	public void emitirSom()
	{
		System.out.println("Som gen�rico");
	}
	
	public void movimentar()
	{
		System.out.println("Movimentando");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	
	
	
}
