package Laco_Repeticao__;

import java.util.Scanner;

public class Exemplo_DoWhile_ {
	public static void main(String[] args) {
		int n1, n2;
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite o número que será dividido: ");
		n1 = leia.nextInt();
		System.out.print("Digite o número divisor: ");
		n2 = leia.nextInt();
		
		do {
			System.out.println("A soma é " + (n1+n2));
			
			System.out.println("\nDigite um número: ");
			n1 = leia.nextInt();
			System.out.println("\nDigite um  número: ");
			n2 = leia.nextInt();
		} while(n1 != -1 || n2 != -1);

	}

}