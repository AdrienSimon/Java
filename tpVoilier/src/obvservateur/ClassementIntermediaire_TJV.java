package obvservateur;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.TreeSet;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
   
 
public class ClassementIntermediaire_TJV {
		 
	
	public TreeSet <Position> classementIntermediaire = new TreeSet <Position> ();
		
	public String toString(){
		String resultat="";
		for(Position undeux:classementIntermediaire){
			resultat+=undeux.nomVoilier;
			resultat+="\n";
		}
		return resultat;
	}
	public ClassementIntermediaire_TJV (String adresseFichierClassement ) {
		lectureFichierXMLclassement (adresseFichierClassement );
		System.out.println("jaisonne sseutatahme");
	} 
	
	
	public void lectureFichierXMLclassement (String adresseFichierClassement ) {
		
            
     DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
     DocumentBuilder builder = null;
     try {builder = builderFactory.newDocumentBuilder();
         Document document = builder.parse(new FileInputStream(adresseFichierClassement));
         NodeList listeElementReleve = document.getElementsByTagName("releve");
         for (int i=0 ; i < listeElementReleve.getLength() ; i++)      
           { Element courant =  (Element) listeElementReleve.item(i);
             String nomVoilier = courant.getAttribute("nom");
             if ( ! nomVoilier.equals(""))
               { String classement = courant.getAttribute("classement");
                 String chaineDistance = courant.getAttribute("distance");
                 String chaineDateTime = courant.getAttribute("arrivee");
                 double distance = 0;
                 GregorianCalendar dateEtHeure = null;
                 boolean abandon = classement.equals("ABD");
                 if (! abandon )
                    if (!chaineDistance.equals(""))
                    	distance = Double.parseDouble(chaineDistance);
                    else    dateEtHeure = new GregorianCalendar (
                    		Integer.parseInt(chaineDateTime.substring (0,4)),	  	// annee
                    		Integer.parseInt(chaineDateTime.substring (5,7)) -1,	// mois janvier=0, fev=1 ...
                    		Integer.parseInt(chaineDateTime.substring (8,10)),	  	// mois
                    		Integer.parseInt(chaineDateTime.substring (11,13)),		// heure
                    		Integer.parseInt(chaineDateTime.substring (14,16)),		// minute 
                    		Integer.parseInt(chaineDateTime.substring (17,19)) 		// seconde
                    		);
                         			 
               Position position =  new Position ( nomVoilier,  distance, dateEtHeure, abandon);
               classementIntermediaire.add(position); 
               }
           } 
      
        
    }
    catch (SAXException e) {e.printStackTrace();}
    catch (IOException e) {e.printStackTrace();}
    catch (ParserConfigurationException e) {e.printStackTrace();}
    }

	
 
	
}
