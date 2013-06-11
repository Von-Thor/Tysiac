
public class DajKarte extends Msg
{
	private Karta [] karty;
	private int size;
	private int ktora;
	
	DajKarte()
	{
	}
	public int get()
	{
		return 2;
	}
	public void setKarta(Karta [] lista)
	{
	karty=lista;
	}
	public void setSize(int size)
	{
		this.size=size;
	}
	public Karta [] getKarty()
	{
		return karty;
	}
	public int getSize()
	{
		return size;
	}
	public void setKtora(int ktora)
	{
		this.ktora=ktora;
	}
	public int getKtora()
	{
		return ktora;
	}

}
