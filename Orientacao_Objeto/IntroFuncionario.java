package Orientacao_Objeto;

public class IntroFuncionario {
	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario();
		
		funcionario1.primeiroNome = "Antonio";
		funcionario1.nomeCompl = "Antonio da Silva Junior";
		funcionario1.idade = 37;
		funcionario1.cpf = 123456789;
		funcionario1.endereco = "Rua dos Machados, 34";
		funcionario1.email = "teste321@hotmail.com";
		funcionario1.salario = 2230;
				
		funcionario1.status();
		
	}
}
