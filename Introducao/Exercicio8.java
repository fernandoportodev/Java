//O custo ao consumidor de um carro novo � a soma do custo de f�brica com a percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
//Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao consumidor.

package Introducao;
import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		double porDis, porImp, custoFab, custoCons;
		Scanner calc = new Scanner(System.in);
		
		System.out.print("Digite o valor de f�brica do ve�culo: R$");
		custoFab = calc.nextDouble();
		
		porDis = custoFab*0.28;
		porImp = custoFab*0.45;
		custoCons = custoFab + porDis + porImp;
		
		System.out.print("O valor da venda do ve�culo �: R$" + custoCons);
		
		
	}
}
