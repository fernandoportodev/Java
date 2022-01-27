package Laço_Repeticao;

import java.util.Scanner;

public class Exemplo_While {

	public static void main(String[] args) {
		int n1, n2;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o número que será dividido: ");
		n1 = leia.nextInt();
		System.out.print("Digite o número divisor: ");
		n2 = leia.nextInt();
		while(n2!=0) {
			
			System.out.println("A divisão é: " + n1/n2);
			System.out.println("Digite o número que será dividido: ");
			n1 = leia.nextInt();
			System.out.println("Digite o número divisor: ");
			n2 = leia.nextInt();
		}
		System.out.println("Não é possivel dividir por zero");
	}

}
