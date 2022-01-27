package Laço_Repeticao;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		int idade, sexo, humor, entrada=150, x=1;
		int pessoaCalma=0, mulheresNervosa=0, homensAgressiv=0, outrosCalmo=0, pNerv40=0, pCalm18=0;
		Scanner leia = new Scanner(System.in);
		
		
		while(x!=entrada) {
			System.out.print("\t PESQUISA NÚMERO "+x);
			System.out.print("\nDigite sua idade: ");
			idade = leia.nextInt();
			System.out.print("Digite qual o seu sexo: (Digite 1- Feminino / 2 - Masculino / 3 - Outros): ");
			sexo = leia.nextInt();
			System.out.print("Digite qual o seu humor predominante: (Digite 1 - Calmo / 2 - Nervoso / 3 - Agressiva): ");
			humor = leia.nextInt();
			
			if(humor==1) {
				pessoaCalma++;
			}
			if(sexo==1 && humor==2) {
				mulheresNervosa++;
			}
			if(sexo==2 && humor==3) {
				homensAgressiv++;
			}
			if(sexo==3 && humor==1) {
				outrosCalmo++;
			}
			if(idade>40 && humor==2) {
				pNerv40++;
			}
			if(idade<18 && humor==1) {
				pCalm18++;
			}
			x++;
		}
		System.out.print("O resultado da pesquisa foi:");
		System.out.print("\nO número de pessoas calmas são de: "+ pessoaCalma);
		System.out.print("\nO número de mulheres nervosas são de: "+ mulheresNervosa);
		System.out.print("\nO número de homens agressivos são de: "+ homensAgressiv);
		System.out.print("\nO número do sexo Outros calmos são de: "+ outrosCalmo);
		System.out.print("\nO número de pessoas nervosas com mais de 40 anos são de: "+ pNerv40);
		System.out.print("\nO número de pessoas calmas com menos de 18 anos são de: "+ pCalm18);
		
	}
}
