package obvservateur;

import java.util.GregorianCalendar;

public class Position implements Comparable <Position>{
	String nomVoilier;
	double distanceArrivee;
	GregorianCalendar dateEtHeureArrivee;
	boolean abandon;
	
	public Position(String pnomVoilier, double pdistanceArrivee, GregorianCalendar pdateEtHeureArrivee, boolean pabandon){
		this.nomVoilier=pnomVoilier;
		this.distanceArrivee=pdistanceArrivee;
		this.dateEtHeureArrivee=pdateEtHeureArrivee;
		this.abandon=pabandon;
	}
	public int compareTo(Position po){
		if (this.dateEtHeureArrivee!=null && po.dateEtHeureArrivee!=null){
			return this.dateEtHeureArrivee.compareTo(po.dateEtHeureArrivee);
		}
		else if(this.dateEtHeureArrivee!=null && po.dateEtHeureArrivee==null) {
			return 1;
		}
		else if(this.dateEtHeureArrivee==null && po.dateEtHeureArrivee!=null){
			return -1;
		}
		else if(this.dateEtHeureArrivee==null && po.dateEtHeureArrivee==null){
			return (int) (this.distanceArrivee-po.distanceArrivee);
		}
		return 1;
		
	}
}