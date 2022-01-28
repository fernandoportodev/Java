package Matrizes;

public class Exercicio3 {
	public static void main(String[] args) {
		int n1[][] = new int[4][6];
		int n2[][] = new int[4][6];
		int m1[][] = new int[4][6];
		int m2[][] = new int[4][6];
		
		for(int linha=0; linha<4; linha++) 
		{
			for(int coluna=0; coluna<6; coluna++) 
			{
				m1[linha][coluna]= n1[linha][coluna] + n2[linha][coluna];
				m2[linha][coluna]= n1[linha][coluna] - n2[linha][coluna];
			}
		}
		
	}
}
