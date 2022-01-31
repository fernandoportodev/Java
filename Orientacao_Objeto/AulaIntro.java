package Orientacao_Objeto;

public class AulaIntro {
	public static void main(String[] args) {
		Caneta caneta1 = new Caneta();
		
		caneta1.cor="Azul";
		caneta1.ponta=0.5f;
		caneta1.tampar();
		caneta1.carga=80;
		caneta1.status();
		caneta1.escrever();
		
		System.out.println("_____________________");
		Caneta caneta2 = new Caneta();
		caneta2.cor="Vermelha";
		caneta2.ponta=0.3f;
		caneta2.destampar();
		caneta2.carga=20;
		caneta2.status();
		caneta2.escrever();
	}
}
