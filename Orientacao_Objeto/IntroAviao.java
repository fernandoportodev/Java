package Orientacao_Objeto;

public class IntroAviao {
	public static void main(String[] args) {
		Aviao aviao1 = new Aviao();
		
		aviao1.empresa = "GOL";
		aviao1.modelo = "Boeing 737-800";
		aviao1.acentos = 184;
		aviao1.bagagem = 118;
		aviao1.peso = 200;
		aviao1.pessoas = 150;
		
		
		aviao1.status();
		aviao1.qtdMax();
		aviao1.acentosTot();
	}
}
