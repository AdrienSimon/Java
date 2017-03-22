package tpVoilier;

public abstract class ArmementSupplementaire extends Voilier {
	
	Voilier  voilier;
	
	public ArmementSupplementaire(String n, SuivreRoute s) {
		super(n, s);
		// TODO Auto-generated constructor stub
	}
	public ArmementSupplementaire(String n) {
		super(n);
	}
	public ArmementSupplementaire(Voilier v){
		super(v);
		voilier = v;
	}



}
