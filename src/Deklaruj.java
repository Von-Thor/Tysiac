
public class Deklaruj extends Msg
{
private int min;
private int ile;
private boolean pass;
	Deklaruj(int min,int ile)
	{
		this.min=min;
		this.ile=ile;
		pass=false;
	}
	public int get()
	{
		return 1;
	}
	public int getMin()
	{
	return min;
	}
	public int getIle()
	{
	return ile;
	}
	public boolean getPass()
	{
	return pass;
	}
	public void setMin(int val)
	{
		min=val;
	}
	public void setIle(int val)
	{
		ile=val;
	}
	public void setPass(boolean val)
	{
		pass=val;
	}
}

