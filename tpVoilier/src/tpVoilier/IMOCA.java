package tpVoilier;

public class IMOCA extends Monocoque{

	public IMOCA(String n, SuivreRoute s) {
		super(n, s);
		// TODO Auto-generated constructor stub
	}
	public String toString(){
		return super.toString()+" "+this.getClass().getSimpleName();
		
	}
}
