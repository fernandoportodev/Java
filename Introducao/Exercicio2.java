//Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.

package Introducao;
import java.util.Scanner;


public class Exercicio2 {
	public static void main(String[] args) {
		
		int diasTotal, anos, meses, dias;
		Scanner calc = new Scanner(System.in);
		
		System.out.println("Digite sua idade em dias: ");
		diasTotal = calc.nextInt();
		
		anos = diasTotal/365;
		meses = (diasTotal/30)/30;
		dias = diasTotal%365;
		
		System.out.println("Sua idade em anos é:" + anos +", em meses é: " + meses + "e em dias é: " + dias);
	}
}
