package Interface;

public class Radio2 implements Radio {

	private boolean ligado;
	private int volume=0;
	
	
	@Override
	public void ligar() {
		System.out.println("Ligando o radio");
		ligado=true;
	}

	@Override
	public void desligar() {
		System.out.println("Desligando o radio");
		ligado=false;
	}

	@Override
	public void maisVol() {
		volume++;
		System.out.println(volume);
	}

	@Override
	public void menosVol() {
		volume--;
		System.out.println(volume);
		
	}

	@Override
	public void trocarEstacao() {
		System.out.println("Mudando estação...");
		
	}
	
}
