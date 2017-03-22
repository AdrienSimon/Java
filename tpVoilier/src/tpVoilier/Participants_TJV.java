package tpVoilier;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.TreeSet;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Participants_TJV {
	public enum ClassesTJV2015{CLASS40,MULTI_50,IMOCA,ULTIME}
	public HashMap <String, Voilier> inscrits = new HashMap <String, Voilier> ();
	public TreeSet <String> [] inscritsParClasse =new TreeSet [ClassesTJV2015.values().length];
	public Participants_TJV(String adresseFichier ) {
		lectureFichierXML(adresseFichier);
		inscritsParClasse ();
	}
	public void lectureFichierXML (String adresse){
		DocumentBuilderFactory builderFactory =
		DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = null;
		try {
			builder = builderFactory.newDocumentBuilder();
			Document document = builder.parse(new FileInputStream(adresse));
			NodeList listeClasses = document.getElementsByTagName("classe");
			for (int i=0 ; i < listeClasses.getLength() ; i++) 
			{
				Element classeCourante = (Element) listeClasses.item(i);
				String classe = classeCourante.getAttribute("nom");
				ClassesTJV2015 classeEnum = ClassesTJV2015.valueOf (classe);
				NodeList listeVoiliers = classeCourante.getElementsByTagName("releve");
				for (int j= 0 ; j< listeVoiliers.getLength() ; j++) 
				{
					Element releveCourant = (Element) listeVoiliers.item(j);
					String nom = releveCourant.getAttribute("nom");
					if (!nom.equals(""))
					{
						String skippers = releveCourant.getAttribute("skippers");
						Voilier voilier = createVoilier (nom, classeEnum);
						inscrits.put (skippers,voilier);
					}
				}
			}// for
		} //try
		catch (SAXException e) {e.printStackTrace();}
		catch (IOException e) {e.printStackTrace();}
		catch (ParserConfigurationException e) {e.printStackTrace();}
	}
		private Voilier createVoilier(String nom, ClassesTJV2015 classe) {
			AbstractFabrique temp;
			switch(classe){
			default:temp=null;
			case IMOCA:temp = new FabriqueMulticoque();
			case MULTI_50:temp = new FabriqueMulticoque();
			case CLASS40:temp = new FabriqueMonocoque();
			case ULTIME:temp = new FabriqueMonocoque();
			}
			return temp.factorymethod(nom, classe);
			
			
		}
		private void inscritsParClasse() {
		for(String i:inscrits.keySet()){
			if(inscrits.get(i) instanceof CLASS40){
				inscritsParClasse[0].add(i);
			}
			else if(inscrits.get(i) instanceof MULTI_50){
				inscritsParClasse[1].add(i);
			}
			else if (inscrits.get(i) instanceof IMOCA){
				inscritsParClasse[2].add(i);
			}
			else if (inscrits.get(i) instanceof ULTIME){
				inscritsParClasse[3].add(i);
			}
		}
	}
}