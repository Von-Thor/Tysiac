
public class Talia 
{
	
	    Karta talia[];
	
	  Talia()
	  {
		  talia = new Karta[24];
		  
		  	talia[0]=new Karta(Kolor.WINO,Figura.DZIEWIEC,"9w.bmp");
		    talia[1]=new Karta(Kolor.TREFL,Figura.DZIEWIEC,"9r.bmp");
		    talia[2]=new Karta(Kolor.DZWONEK,Figura.DZIEWIEC,"9d.bmp");
		    talia[3]=new Karta(Kolor.CZERWO,Figura.DZIEWIEC,"9c.bmp");
		    talia[4]=new Karta(Kolor.WINO,Figura.DZIESIEC,"10w.bmp");
		    talia[5]=new Karta(Kolor.TREFL,Figura.DZIESIEC,"10r.bmp");
		    talia[6]=new Karta(Kolor.DZWONEK,Figura.DZIESIEC,"10d.bmp");
		    talia[7]=new Karta(Kolor.CZERWO,Figura.DZIESIEC,"10c.bmp");
		    talia[8]=new Karta(Kolor.WINO,Figura.JUPEK,"jw.bmp");
		    talia[9]=new Karta(Kolor.TREFL,Figura.JUPEK,"jr.bmp");
		    talia[10]=new Karta(Kolor.DZWONEK,Figura.JUPEK,"jd.bmp");
		    talia[11]=new Karta(Kolor.CZERWO,Figura.JUPEK,"jc.bmp");
		    talia[12]=new Karta(Kolor.WINO,Figura.DAMA,"dw.bmp");
		    talia[13]=new Karta(Kolor.TREFL,Figura.DAMA,"dr.bmp");
		    talia[14]=new Karta(Kolor.DZWONEK,Figura.DAMA,"dd.bmp");
		    talia[15]=new Karta(Kolor.CZERWO,Figura.DAMA,"dc.bmp");
		    talia[16]=new Karta(Kolor.WINO,Figura.KROL,"kw.bmp");
		    talia[17]=new Karta(Kolor.TREFL,Figura.KROL,"kr.bmp");
		    talia[18]=new Karta(Kolor.DZWONEK,Figura.KROL,"kd.bmp");
		    talia[19]=new Karta(Kolor.CZERWO,Figura.KROL,"kc.bmp");
		    talia[20]=new Karta(Kolor.WINO,Figura.AS,"aw.bmp");
		    talia[21]=new Karta(Kolor.TREFL,Figura.AS,"ar.bmp");
		    talia[22]=new Karta(Kolor.DZWONEK,Figura.AS,"ad.bmp");
		    talia[23]=new Karta(Kolor.CZERWO,Figura.AS,"ac.bmp");
	  }
	void zeruj()
	{
		for(int i=0;i<talia.length;i++)
			talia[i].wyb=false;	
	}
	
}
