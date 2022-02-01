package Heranca;

public class AcoesAnimais {
	public static void main(String[] args) {
		Cachorro dog = new Cachorro();
		Cavalo horse = new Cavalo();
		Preguica laziness = new Preguica();
		
		dog.setNome("Bolt");
		dog.setIdade(6);
		dog.setSom("RUF RUF");
		dog.setCorrer("correr");
		
		horse.setNome("White Horse");
		horse.setIdade(13);
		horse.setSom("iiiirrrí");
		horse.setCorrer("correr");
		
		laziness.setNome("Zé Soneca");
		laziness.setIdade(6);
		laziness.setSom("zZzZzZzZzZ ");
		laziness.setSubir("subir em árvores");
		
		
		
		System.out.println("O nome do cachorro é: " + dog.getNome());
		System.out.println("A idade do cachorro é: "+ dog.getIdade()+" anos");
		System.out.println("O som do latido do cachorro faz: " + dog.getSom());
		System.out.println("O cachorro deve " + dog.getCorrer());
		System.out.println("\n**********************************");
		
		System.out.println("O nome do cavalo é: " + horse.getNome());
		System.out.println("A idade do cavalo é: " + dog.getIdade()+" anos");
		System.out.println("O som do relinho do cavalo faz: " + horse.getSom());
		System.out.println("O cavalo deve " + horse.getCorrer());
		System.out.println("\n**********************************");
		
		System.out.println("O nome da preguiça é: " + laziness.getNome());
		System.out.println("A idade da preguiça é: " + laziness.getIdade()+" anos");
		System.out.println("O som que preguiça faz é: " + laziness.getSom());
		System.out.println("A preguiça deve " + laziness.getSubir());
		
		
		
	}
	
	
	
}
