package Heranca;

public class ProfessorExemplo {

		private String Bloco;
		private double salario;
		
public void prepararAula()
{
	System.out.println("Preparando aula");
}

public String getBloco() {
	return Bloco;
}

public void setBloco(String bloco) {
	Bloco = bloco;
}

public double getSalario() {
	return salario;
}

public void setSalario(double salario) {
	this.salario = salario;
}

}
