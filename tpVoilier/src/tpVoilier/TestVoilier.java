package tpVoilier;

public class TestVoilier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		Voilier testMonocoque = new Monocoque("nomTestMonocoque", new route1());
		System.out.println(testMonocoque.toString());
		
		Voilier testMulticoque = new Monocoque("nomTestMulticoque", new route2());
		System.out.println(testMulticoque.toString());
		
		System.out.println("//le monocoque suit la route:");
		testMonocoque.appliqueSuivreRoute();
		System.out.println("//le multicoque suit la route:");
		testMulticoque.appliqueSuivreRoute();
		
		System.out.println("//Changement de route du monocoque..");
		testMonocoque.setSuivreRoute(new route2());
		System.out.println(">//le monocoque suit la route:");
		testMonocoque.appliqueSuivreRoute();
		
		
		Voilier voilierDecore = new Monocoque("nomVoilierDecore", new route1());
		System.out.println("//Creation du voilierDecorer:");
		System.out.println(voilierDecore.toString());
		
		System.out.println("//Attribution d'une route..");
		voilierDecore.setSuivreRoute(new route2());
		
		System.out.println("//voilierDecore suit la route: ");
		voilierDecore.appliqueSuivreRoute();
		
		System.out.println("//Ajout d'un armement supplementaire");
		voilierDecore = new SousArmementSupplementaire2(voilierDecore);
		System.out.println(voilierDecore.toString());
		
		System.out.println("//Ajout d'un armement supplementaire");
		voilierDecore = new SousArmementSupplementaire1(voilierDecore);
		System.out.println(voilierDecore.toString());
		
		System.out.println("//voilierDecore suit la route: ");
		voilierDecore.appliqueSuivreRoute();
		
		System.out.println("//Changement de route...");
		voilierDecore.setSuivreRoute(new route1());
		
		System.out.println("//Ajout d'un armement supplementaire");
		voilierDecore.appliqueSuivreRoute();

*/	
		//C:/Users/asimon/Desktop/classement_2015_11_19.xml
		Participants_TJV testParticipants = new Participants_TJV("C:/Users/asimon/Desktop/classement_2015_11_19.xml");
		System.out.println(testParticipants.inscrits);
	}

}
