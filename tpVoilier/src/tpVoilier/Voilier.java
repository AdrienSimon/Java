package tpVoilier;

public abstract class Voilier implements Comparable<Voilier> {
	String nom;
	SuivreRoute suivreRoute; 
	public Voilier(String n, SuivreRoute s){
		this.nom=n;
		this.suivreRoute=s;
	}
	public Voilier(String n){
		this.nom=n;
		this.suivreRoute=new route1();
	}
	public Voilier(Voilier v){
		this.nom = v.nom;
		this.suivreRoute = v.suivreRoute;
	}
	public String toString(){
		return nom;
	}
	public void setSuivreRoute(SuivreRoute s){
		this.suivreRoute = s;
	}
	public void appliqueSuivreRoute(){
		suivreRoute.suivreRoute();
	}
	public int compareTo(Voilier voilier){
		return 1;
	}
}


