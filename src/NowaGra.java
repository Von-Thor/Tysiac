
public class NowaGra {

	
	public static void main(String[] args) 
	{
		Tysiac tysiac=new Tysiac();
		
		tysiac.addGracz(new GraczZdalny("Wojtek"));
		tysiac.addGracz(new GraczLokalny("Yeti"));
		tysiac.addGracz(new Gracz());
		tysiac.addGracz(new Gracz());
		
		tysiac.rozdaj();
		
	}

}
