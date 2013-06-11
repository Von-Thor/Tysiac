import java.io.Serializable;


public class Gracz implements Serializable
{
	private static final long serialVersionUID = 1L;
		boolean start;
	      String nazwa;
	      Karta kartyGracza[];
	      int punkty;
	      int suma_punktow;
	      int ile_kart;
	      int deklaracja;
	      int wybrana;
	
	      Gracz(String name)
	      {
	    	  wybrana=-1;
	    	kartyGracza=new Karta[10];
	         
	    	  for (int i=0;i<10;i++)
	              kartyGracza[i]=null;
	        start=false;
	        suma_punktow=0;
	        nazwa=name;
	        punkty=0;
	        ile_kart=0;
	      }
	      
	      Gracz()
	      {
	    	  wybrana=-1;
	    	  kartyGracza=new Karta[10];
	          for (int i=0;i<10;i++)
	              kartyGracza[i]=null;
	          start=false;
	          suma_punktow=0;
	          nazwa="Anonim";
	          punkty=0;
	          ile_kart=0;
	      }
	      
	      void sort()
	      {
	    	  Karta work;
	    	     for (int i=0;i<ile_kart-1;i++)
	    	     {
	    	     for (int k=i+1;k<ile_kart;k++)
	    	           {
	    	                if( kartyGracza[i].kolor.getKolor() < kartyGracza[k].kolor.getKolor())
	    	                {
	    	                    work=kartyGracza[i];
	    	                    kartyGracza[i]=kartyGracza[k];
	    	                    kartyGracza[k]=work;
	    	                }
	    	           }
	    	     }
	    	     int k=0;
	    	     for (int i=1;i<ile_kart;i++)
	    	     {
	    	         k=i-1;
	    	         while(kartyGracza[k+1].kolor.getKolor()==kartyGracza[k].kolor.getKolor() && kartyGracza[k+1].figura.getFigura() > kartyGracza[k].figura.getFigura())
	    	         {
	    	             work=kartyGracza[k];
	    	             kartyGracza[k]=kartyGracza[k+1];
	    	             kartyGracza[k+1]=work;
	    	             k--;
	    	         }
	    	     }
	      }
	      void ref()
	      {
	    	  
	      }
}
