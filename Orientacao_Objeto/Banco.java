package Orientacao_Objeto;

public class Banco {
	float saldo;
	float transferencia;
	float sacar;
	
	public void saque()
	{
		if(sacar>saldo)
			System.out.println("N�o � poss�vel realizar essa opera��o, seu saque � maior que o seu saldo.");
		else
			this.saldo=this.saldo-this.sacar;
			System.out.println("Saque realizado com sucesso ("+this.saldo+"-"+this.sacar+")");
	}
	public void transferir()
	{
		this.transferencia=this.transferencia-this.saldo;
		System.out.println("Transfer�ncia realizada com sucesso ("+this.transferencia+"-"+this.saldo+")");
	}
	
	public void saldo1()
	{
		System.out.println("Seu saldo �: " + this.saldo);
	}
}
