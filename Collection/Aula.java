package Collection;

public class Aula {
	
	private String titulo;
	private int tempo;
	
	public Aula(String x, int n1)
	{
		this.titulo=x;
		this.tempo=n1;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	
	public String toString()
	{
		return "Aulas: "+this.titulo+", "+this.tempo+" minutos.";
	}
}
