package Orientacao_Objeto;

public class IntroProduto_eletronico {
	public static void main(String[] args) {
		Produto_eletronico celular = new Produto_eletronico();
		
		celular.marca = "Apple";
		celular.modelo = "Iphone SE 2 gen";
		celular.camera = 12;
		celular.armazenamento = 16;
		
		
		celular.status();
		celular.conexao();
		celular.capacidade();
		celular.internet5G();
		
		
		
	}
}
