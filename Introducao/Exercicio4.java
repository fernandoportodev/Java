// Escreva um sistema que leia tr�s n�meros inteiros e positivos (A,B,C) e calcula a seguinte express�o:
//R=(A+B)�, S=(B+C)�, D=(R+S)/2

package Introducao;
import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		double a, b, c, calcR, calcS, calcD;
		Scanner calc = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		a = calc.nextDouble();
		System.out.println("Digite o valor de B: ");
		b = calc.nextDouble();
		System.out.println("Digite o valor de C: ");
		c = calc.nextDouble();
				
		calcR = Math.pow(a+b, 2);
		calcS = Math.pow(b+c, 2);
		calcD = (calcR+calcS)/2;
		
		System.out.println("O calculo da express�o �: " + calcD);
	}
}
