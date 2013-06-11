import java.util.Random;


public class Tysiac extends Talia
{
	Gracz [] gracze;
	Karta [] reszta;
	Karta pierwsza;
	Kolor meldunek;
	int kolejka;
	
	Integer ileGraczy;
	Tysiac()
	{
		kolejka=0;
		meldunek = Kolor.BRAK;
		pierwsza = null;
		ileGraczy=0;
		gracze = new Gracz[3];
		for(int i=0;i<3;i++)
			gracze[i]=null;
		
		reszta= new Karta[3];
		for(int i=0;i<3;i++)
			reszta[i]=null;
		
	}
	void addGracz(Gracz gracz)
	{
		if(ileGraczy<3)
		gracze[ileGraczy]=gracz;
		ileGraczy++;
	}
	void rozdaj()
	{
		int temp;
		zeruj();
		Random gen = new Random();
		for(int i=0; i<7;i++)
		{
			for(int j=0; j<3;j++)
			{
				while(true)
				{
					temp = znak(gen.nextInt())%24;
					if(!talia[temp].wyb)
					{
					gracze[j].kartyGracza[gracze[j].ile_kart]=talia[temp];
					talia[temp].wyb=true;
					gracze[j].ile_kart++;
					break;
					}
				}
			}
		}
		temp=0;
		for(int i=0;i<24;i++)
	    {
			if(!(talia[i].wyb))
	        {
				reszta[temp]=talia[i]; 
				temp++;
				talia[i].wyb=true;
	        }
	    }
		
	}
	
	int znak(int liczba)
	{
		if(liczba<0)
			return -liczba;
		return liczba;
	}
	
}
