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
		horse.setSom("iiiirrr�");
		horse.setCorrer("correr");
		
		laziness.setNome("Z� Soneca");
		laziness.setIdade(6);
		laziness.setSom("zZzZzZzZzZ ");
		laziness.setSubir("subir em �rvores");
		
		
		
		System.out.println("O nome do cachorro �: " + dog.getNome());
		System.out.println("A idade do cachorro �: "+ dog.getIdade()+" anos");
		System.out.println("O som do latido do cachorro faz: " + dog.getSom());
		System.out.println("O cachorro deve " + dog.getCorrer());
		System.out.println("\n**********************************");
		
		System.out.println("O nome do cavalo �: " + horse.getNome());
		System.out.println("A idade do cavalo �: " + dog.getIdade()+" anos");
		System.out.println("O som do relinho do cavalo faz: " + horse.getSom());
		System.out.println("O cavalo deve " + horse.getCorrer());
		System.out.println("\n**********************************");
		
		System.out.println("O nome da pregui�a �: " + laziness.getNome());
		System.out.println("A idade da pregui�a �: " + laziness.getIdade()+" anos");
		System.out.println("O som que pregui�a faz �: " + laziness.getSom());
		System.out.println("A pregui�a deve " + laziness.getSubir());
		
		
		
	}
	
	
	
}
