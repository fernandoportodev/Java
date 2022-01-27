package Laço_Repeticao;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		int idade, x=0, y=0, pessoas;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite a sua idade: ");
		idade = leia.nextInt();
		
		while(idade<=99) 
		{
			System.out.print("Digite a sua idade: ");
			idade = leia.nextInt();
			
			if(idade<=21) 
			{
				x++;
			}
			if(idade>=50) 
			{
				y++;
			}
		}
		System.out.print("\nA quantidade de pessoas menores de 21 anos são: " + x);
		System.out.print("\nA quantidade de pessoas maiores de 50 anos são: " + y);
	
	}
		
	}


