package obvservateur;

public class TestToutLesclassements {
	
	public static void main(String[] args){
		ClassementIntermediaire_TJV classmentInter = new ClassementIntermediaire_TJV("C:/Users/asimon/Documents/WorkspaceIHM/tpVoilier/src/files/classement_2015_11_27.xml");
		ToutLesClassement toutLesClassement = new ToutLesClassement();
		Abandons abandon = new Abandons();
		toutLesClassement.ajoutObservateur(abandon);
		toutLesClassement.ajouterClassement(classmentInter);
		System.out.println(abandon.ToString());
		System.out.println(classmentInter.toString());
	}
}
