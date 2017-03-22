package obvservateur;

import java.util.ArrayList;

public class ToutLesClassement implements Observable{
	public ArrayList<ClassementIntermediaire_TJV> listeClassement=new ArrayList<ClassementIntermediaire_TJV>();
	public ArrayList<Observateur> listeObservateur = new ArrayList<Observateur>();
	public void ajoutObservateur(Observateur robin) {
		listeObservateur.add(robin);
		informeObservateur();
	}
	public void retireObservateur(Observateur robin) {
		listeObservateur.remove(robin);
		
	}

	public void informeObservateur() {
		for(Observateur obs:listeObservateur){
			obs.actualise(this);
		}
		
		
	}
	public void ajouterClassement(ClassementIntermediaire_TJV c){
		listeClassement.add(0,c);
		informeObservateur();
	}


}
