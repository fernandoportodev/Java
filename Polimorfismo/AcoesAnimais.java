package Polimorfismo;

public class AcoesAnimais {
	public static void main(String []args) {
		
		Cachorro dog = new Cachorro();
		Cavalo horse = new Cavalo();
		Preguica laziness = new Preguica();
		
		dog.setNome("Thor");
		horse.setNome("White horse");
		laziness.setNome("Jorginho");
		
		
		
		System.out.println("O cachorro "+ dog.getNome()+" emite o som: ");
		dog.emitirSom();				
		System.out.println("O cavalo "+ horse.getNome()+" emite o som: ");
		horse.emitirSom();
		System.out.println("A preguiça "+ laziness.getNome()+" emite o som: ") ;
		laziness.emitirSom();
		
		
		
	}
	
}
