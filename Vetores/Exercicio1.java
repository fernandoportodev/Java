package Vetores;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		int vet[] = new int[5];
		int maior=0;
		Scanner leia = new Scanner(System.in);
		
		for(int x=0;x<5;x++) {
			System.out.print("Digite um valor: ");
			vet[x] = leia.nextInt();
			if(vet[x]>maior)
				maior=vet[x];
		}
		for(int x=0;x<5;x++) {
			System.out.println("Os valores digitados são:" + vet[x]);
		}
		
		System.out.println("O maior valor é: "+ maior);
	}
}
