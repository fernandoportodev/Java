package Collection;

import java.util.ArrayList;

public class Exemplo1 {
	public static void main(String[] args) {
	String aula1 = "Bloco 1";
	String aula2 = "Bloco 2";
	String aula3 = "Bloco 3";
	
	ArrayList<String> aula = new ArrayList<>();
	
	aula.add(aula1);
	aula.add(aula2);
	aula.add("Feira de empregabilidade");
	
	System.out.println(aula.get(2)); //printar a ArrayList no ponto 2
	
	System.out.println(aula.size()); //mostrar o tamanho da arraylist
	
	System.out.println(aula.contains("Feira de empregabilidade")); //mostra se possui um ponto na arraylist contendo isso
	System.out.println(aula.contains(aula3));
	
	System.out.println(aula1);
	
	aula.remove(0);
	
	}
}
