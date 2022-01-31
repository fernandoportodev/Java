package ProjetoIntegrador_1;

public class Classe_Login {

	boolean cadastro;
	boolean acesso;
	
	
	public void cadastro_conta(String login1, String senha1)
	{
		this.cadastro=true;
	}
	
	public void acesso_conta(String login1, String login2)
	{
		this.acesso=true;
	}
	
	public void cadastro_conta1()
	{
		if(this.cadastro=true)
			System.out.println("Sua conta foi criada com sucesso");
		else
			System.out.println("Tente novamente");
	}
	
	public void acesso_conta1()
	{
		if(this.acesso=true)
			System.out.println("Conta acessada com sucesso");
		else
			System.out.println("Login e senha inválidos, tente novamente");
	}
	
	
	
	
}
