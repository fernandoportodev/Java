package Laço_Repeticao;

public class Exercicio1 {
	public static void main(String[] args) {
		int x, n1;
		
		System.out.println("Os valores que tem resto igual a 5 são: ");
		
		for(x=1000;x<=1999;x++) {
			if(x%11==5) {
				
				System.out.println(x);
			}
			
		}
	}
}
