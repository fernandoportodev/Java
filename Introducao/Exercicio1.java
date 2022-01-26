//Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.

package Introducao;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		int idade, mes, dias, diasVida;
		Scanner calc = new Scanner(System.in);
		
		System.out.println("Digite quantos anos você tem: ");
		idade=calc.nextInt();
		
		System.out.println("Digite sua idade em meses: ");
		mes=calc.nextInt();
		
		System.out.println("Digite sua idade em dias: ");
		dias=calc.nextInt();
		
		diasVida = ((idade*365)+(mes*130)+dias);
		
		System.out.println("Sua idade em dias é: " + diasVida);
		
	}
}
