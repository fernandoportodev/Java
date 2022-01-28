package Vetores;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		int vet[] = new int [10];
		int dado=0, media=0, soma=0, maior=0;
		Scanner leia = new Scanner(System.in);
		
		for(int x=0;x<10;x++){
			System.out.print("Digite o valor do dado: ");
			vet[x] = leia.nextInt();
			if(vet[x]>maior)
				maior=vet[x];
			if(vet[x]==maior)
				dado++;
			soma=soma+vet[x];
			media=soma/10;
		}
		System.out.println("A média aritmética dos lançamentos são: " + media);
		System.out.println("A maior pontuação ocorreu "+ dado+" vezes.");
	}
}
