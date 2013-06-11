import java.io.Serializable;


public class Msg implements Serializable
{
final private int rodzaj;

	Msg()
	{
		rodzaj = 0;
	}

	public int getRodzaj() 
	{
		return rodzaj;
	}
	
}
