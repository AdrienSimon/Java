package obvservateur;

import java.util.TreeSet;

public class Arrivee implements Observateur {
	
	public TreeSet<Position> listeArrivee = new TreeSet<Position>();

		
	public void actualise(Observable penguin) {
		for(ClassementIntermediaire_TJV CI: ((ToutLesClassement)(penguin)).listeClassement){
			for(Position undeux:CI.classementIntermediaire){
				if(undeux.abandon==true){
					listeArrivee.add(undeux);
				}
			}
		}
		
	
	}
}
