package tpVoilier;

public class SousArmementSupplementaire2 extends ArmementSupplementaire {


	public SousArmementSupplementaire2(Voilier v) {
		super(v);
		// TODO Auto-generated constructor stub
	}

	public String toString(){
		return voilier.toString()+" + barre-franche";
	}
}
