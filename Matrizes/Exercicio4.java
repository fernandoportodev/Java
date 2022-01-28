package Matrizes;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		int mat[][] = new int [3][3];
		int soma1 = 0, soma2 = 0; 
		Scanner read = new Scanner(System.in);
		
		for(int line=0; line<3; line++) {
			for(int column=0; column<3; column++) {
				System.out.println("Digite o valor: ");
				mat[line][column] = read.nextInt();
				
				soma1=soma1+mat[line][column];
				if(mat[line]==mat[column])
					soma2=soma2+mat[line][column];
				
			}
		}
		System.out.println("A soma de todos os valores são: " + soma1);
		System.out.println("A soma da primeira diagonal é: " + soma2);
	}
}
