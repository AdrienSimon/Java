package obvservateur;


import java.util.TreeSet;

public class Abandons implements Observateur{
	public TreeSet<Position> listeAbandons = new TreeSet<Position>();
	
	public void actualise(Observable penguin) {
		for(ClassementIntermediaire_TJV CI: ((ToutLesClassement)(penguin)).listeClassement){
			for(Position undeux:CI.classementIntermediaire){
				if(undeux.abandon==true){
					listeAbandons.add(undeux);
				}
			}
		}
		
	}
	public String ToString(){
		String resultat="";
		for(Position undeux:listeAbandons){
			resultat+=undeux.nomVoilier;
			resultat+="\n";
		}
		
		
		return resultat;
		
	}

	



}
 