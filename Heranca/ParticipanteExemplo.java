package Heranca;

public class ParticipanteExemplo extends PessoaExemplo {
	private int mat;
	private String curso;
	
	public void entregaAtividade()
	{
		System.out.println("Atividade entregue...");
	}
	public void barometro()
	{
		System.out.println("Barometro respondido");
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
}
