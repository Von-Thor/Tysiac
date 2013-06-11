
public class Oddaj extends Msg
{
	private Karta [] karty;
	private final int size;
	
	Oddaj()
	{
		size=2;
	}
	public int get()
	{
		return 2;
	}
	public void setKarta(Karta [] lista)
	{
	karty=lista;
	}
	public Karta [] getKarty()
	{
		return karty;
	}
	public int getSize()
	{
		return size;
	}


}
