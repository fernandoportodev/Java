package Collection;

import java.util.ArrayList;

public class ExemploAula2 {
	public static void main(String[] args) {
		
		Aula a1 = new Aula("La�os", 40);
		Aula a2 = new Aula("Heran�a", 50);
		Aula a3 = new Aula("Vetores", 35);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
				
	}
}
