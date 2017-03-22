package tpVoilier;

import tpVoilier.Participants_TJV.ClassesTJV2015;

public class FabriqueMulticoque implements AbstractFabrique{

	public Voilier factorymethod(String nom, ClassesTJV2015 classe) {
		switch(classe){
		case ULTIME:return new ULTIME(nom, null);
		case MULTI_50:return new MULTI_50(nom, null);
		}
		return null;
	}



}
