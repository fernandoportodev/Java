//Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos.

package Introducao;
import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		int segundosTotal, horas, minutos, segundos;
		Scanner calc = new Scanner(System.in);
		
		System.out.println("Digite a duração deste evento em segundos: ");
		segundosTotal = calc.nextInt();
		
		horas = segundosTotal/3600;
		minutos = (segundosTotal-(3600*horas))/60;
		segundos = (segundosTotal-(3600*horas))%60;
		
		System.out.println("A duração deste evento é " + horas + " horas, " + minutos + " minutos, " + segundos + " segundos.");
	}
}
