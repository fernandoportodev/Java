////Um sistema de equa��es lineares do pode ser resolvido segundo mostrado abaixo x= (ce-bf)/(ae-bd), y=(af-cd)/ae-bd):
//Escreva um sistema que l� os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y.


package Introducao;
import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		int a, b, c, d, e, f, x, y;
		Scanner calc = new Scanner(System.in);
		
		System.out.print("Digite o valor de A: ");
		a = calc.nextInt();
		System.out.print("Digite o valor de B: ");
		b = calc.nextInt();
		System.out.print("Digite o valor de C: ");
		c = calc.nextInt();
		System.out.print("Digite o valor de D: ");
		d = calc.nextInt();
		System.out.print("Digite o valor de E: ");
		e = calc.nextInt();
		System.out.print("Digite o valor de F: ");
		f = calc.nextInt();
		
		x = ((c*e)-(b*f)) / ((a*e)-(b*d));
		y = ((a*f)-(c*d))/((a*e)-(b*d));
		
		System.out.print("O valor de X �: " + x + " , o valor de Y �: " + y);
	}
}
