package Laço_Repeticao;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		int x=0, soma=0, media=0;
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.print("Digite um número: ");
			x = leia.nextInt();
			
		if(x%3==0 && x!=0) {
			soma = soma + x;
			media++;
		}
			
		}
		while(x!=0);
		
		media=soma/media;
		System.out.println("A média dos números múltiplos de 3 são:" + media);
	}
}
