package Laço_Repeticao;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		int x, y, par=0, impar=0;
		Scanner leia = new Scanner(System.in);
		
		for(x = 1; x <= 10; x++) 
		{
			
			System.out.print("Digite um valor: ");
			y = leia.nextInt();
			
			if(y%2==0) {
				par++;
								
			}
			else {
				impar++;
				
			}
			
		}
		
			System.out.println("\nOs valores pares são: " + par);	
			System.out.println("\nOs valores ímpares são: " + impar);
		}
	}

