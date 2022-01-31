package Orientacao_Objeto;

public class IntroBanco {
	public static void main(String[] args) {
		Banco conta = new Banco();
		
		conta.sacar = 200f;
		conta.saldo = 600f;
		conta.transferencia = 100f;
		
		conta.saque();
		conta.transferir();
		conta.saldo1();
	}
}
