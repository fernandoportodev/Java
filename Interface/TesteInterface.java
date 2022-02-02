package Interface;

public class TesteInterface {
	public static void main(String[] args) {
		Radio2 radio = new Radio2();
		
		radio.ligar();
		radio.trocarEstacao();
		radio.maisVol();
		radio.maisVol();
		radio.trocarEstacao();
		radio.desligar();
		
	}
}
