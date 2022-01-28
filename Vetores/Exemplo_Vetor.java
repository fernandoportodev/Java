package Vetores;

import java.util.Scanner;

public class Exemplo_Vetor {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int[]vet = new int[5];
		
		for(int x=0;x<5;x++) {
			System.out.print("Digite um número: ");
			vet[x]=leia.nextInt();
		}
		for(int x=0;x<5;x++) {
			System.out.println(vet[x]);
		}
	}
}
