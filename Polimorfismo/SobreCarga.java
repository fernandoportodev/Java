package Polimorfismo;

public class SobreCarga {

	int s;	
	public int soma(int n1, int n2)
	{
		s=n1+n2;
		return s;
	}
	public int soma(int n1, int n2, int n3)
	{
		s=(n1+n2+n3);
		return s;
	}
	 
	
}
