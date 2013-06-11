
public class Rozdanie extends Msg
{
	private Karta [] karty;
	private int size;
	
	Rozdanie()
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

}
