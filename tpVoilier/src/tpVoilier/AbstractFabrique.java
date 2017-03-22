package tpVoilier;

import tpVoilier.Participants_TJV.ClassesTJV2015;

public interface AbstractFabrique {
	public abstract Voilier factorymethod(String nom, ClassesTJV2015 classe);
}
