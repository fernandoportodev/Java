package Laco_Condicional__;

import java.util.Scanner;

public class Exemplo_switch {
	public static void main(String[] args) {
		String x;
		System.out.print("Digite uma letra: ");
		Scanner ler = new Scanner(System.in);
		x = ler.nextLine();
		
		switch(x)
		{
		case "a":
			System.out.println("Vogal");
			break;
		case "e":
			System.out.println("Vogal");
			break;
		case "i":
			System.out.println("Vogal");
			break;
		case "o":
			System.out.println("Vogal");
			break;
		case "u":
			System.out.println("Vogal");
			break;
		default:
			System.out.println("Consoante");
		}

	}

}