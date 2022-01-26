//Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente.

package Introducao;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		double n1, n2, n3, mediaP;
		Scanner calc = new Scanner(System.in);
		
		System.out.print("Digite a nota da prova N1: ");
		n1 = calc.nextDouble();
		System.out.print("Digite a nota da prova N2: ");
		n2 = calc.nextDouble();
		System.out.print("Digite a nota da prova N3: ");
		n3 = calc.nextDouble();
		
		mediaP = ((n1*2)+(n2*3)+(n3*5))/(2+3+5);
		
		System.out.print("A média ponderada do aluno é :" + mediaP);
		
	}
}
