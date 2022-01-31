package Orientacao_Objeto;

public class IntroPatinete {
	public static void main(String[] args) {
		Patinete brinquedo = new Patinete();
		
		brinquedo.recomendacao = 12;
		brinquedo.precoAdult = 59.99f;
		brinquedo.precoCrianc = 39.99f;
		brinquedo.marca = "Seninha";
		brinquedo.idade();
		brinquedo.acessorios1();
		brinquedo.status();
		
	}
}
