package tpVoilier;

import tpVoilier.Participants_TJV.ClassesTJV2015;

public class FabriqueMonocoque implements AbstractFabrique {

	public Voilier factorymethod(String nom, ClassesTJV2015 classe) {
		switch(classe){
		case IMOCA:return new IMOCA(nom, null);
		case CLASS40:return new CLASS40(nom, null);
		}
		return null;
	}


}
