//Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica expressa em segundos e mostre-o expresso em horas, minutos e segundos.

package Introducao;
import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		int segundosTotal, horas, minutos, segundos;
		Scanner calc = new Scanner(System.in);
		
		System.out.println("Digite a dura��o deste evento em segundos: ");
		segundosTotal = calc.nextInt();
		
		horas = segundosTotal/3600;
		minutos = (segundosTotal-(3600*horas))/60;
		segundos = (segundosTotal-(3600*horas))%60;
		
		System.out.println("A dura��o deste evento � " + horas + " horas, " + minutos + " minutos, " + segundos + " segundos.");
	}
}
