package Orientacao_Objeto;

public class IntroPaciente {
	public static void main(String[] args) {
		Paciente paciente1 = new Paciente();
		
		paciente1.nome = "Ana";
		paciente1.contato = 215151321;
		paciente1.idade = 12;
		paciente1.altura = 1.65f;
		paciente1.sintoma = "Perna quebrada";
		
		
		paciente1.status();
		paciente1.convenioTrue();
		paciente1.verifyConvenio();
		paciente1.responsavel();
	}
}
