
class Karta
{

      //BITMAP *okl;
      //BITMAP *tyl;
      Kolor kolor;
      Figura figura;
      int poz_x;
      int poz_y;
      Boolean wyb;

      Karta()
      {
          kolor=Kolor.BRAK;
          figura = Figura.BRAK;
      }
     Karta(Kolor ko,Figura fi,String nazwa)
      {
           //tyl=load_bmp( "tylna1.bmp", default_palette );
    	   //okl=load_bmp(nazwa.c_str(), default_palette );
           kolor=ko;
           figura=fi;
           wyb=false;
           poz_x=0;
           poz_y=0;
           
      }
      

};
