package tpVoilier;

public class Monocoque extends Voilier {
	
	public Monocoque(String n, SuivreRoute s){
		super(n,s);
	}
	public String toString(){
		return "Monocoque: "+super.toString();
		
	}

}
