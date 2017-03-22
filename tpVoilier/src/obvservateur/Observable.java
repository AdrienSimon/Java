package obvservateur;

public interface Observable {
	
	public void ajoutObservateur(Observateur batman);
	public void retireObservateur(Observateur batman);
	public void informeObservateur();
	
}
