package Matrizes;

import java.util.Scanner;

public class Exemplo_Matriz 
{
	public static void main(String [] args) 
	{
		int mat[][] = new int[4][3];
		int linha=0, coluna=0;
		Scanner read = new Scanner(System.in);
		
		for(linha=0;linha<4;linha++) 
		{
			for(coluna=0;coluna<3;coluna++) 
			{
				mat[linha][coluna] = read.nextInt();
			}
		}
	}
}
