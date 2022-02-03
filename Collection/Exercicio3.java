package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;;

public class Exercicio3 {
	

	    public static void main(String[] args) {
	        List<String> itens = new ArrayList<>(); // sempre voltado a interface
	        itens.add("Kiwi");
	        itens.add("Melancia");
	        itens.add("Banana");
	        itens.add("Morango");
	        itens.add("Maracuja");

	        Collections.sort(itens);
	        System.out.println(itens);
	        boolean existe = itens.contains("Banana");
	        System.out.println(existe);
	        itens.add(1, "Melao"); // set ou add 
	        System.out.println(itens);  // nome da lista
	        itens.remove(2);
	        System.out.println(itens);

	        System.out.println(itens.get(2)); // mostrar especifico 

	        System.out.println(itens.size()); // tamanho

	        itens.clear(); // remove todos 
	        System.out.println(itens);
	    }
	}

