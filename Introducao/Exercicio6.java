//Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. 
//A fórmula D = RAIZ²(x2-x1)²+(y2-y1)² que efetua tal cálculo é:

package Introducao;
import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		double x1, x2, y1, y2, totalD;
		Scanner calc = new Scanner(System.in);
		
		System.out.print("Digite o ponto X1: ");
		x1 = calc.nextDouble();
		System.out.print("Digite o ponto X2: ");
		x2 = calc.nextDouble();
		System.out.print("Digite o ponto Y1: ");
		y1 = calc.nextDouble();
		System.out.print("Digite o ponto Y2: ");
		y2 = calc.nextDouble();
		
		totalD = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		
				
		System.out.print("O cálculo dessa fórmula é: " + totalD);		
			
	}
}
