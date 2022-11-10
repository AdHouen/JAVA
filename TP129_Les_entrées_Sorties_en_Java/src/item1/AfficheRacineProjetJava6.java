package item1;

import java.io.File;
import java.io.IOException;


public class AfficheRacineProjetJava6 {
	

	  public static void main(String[] args) throws IOException 
	    { 
	      File repertoire  = new File("I:\\GitHub\\JAVA\\TP26_Les_entrées_Sorties_en_Java");
	      File[] maList = repertoire.listFiles();
	      
	      System.out.println("Contenu du répertoire racine du projet : ");
	      
	      for(File item : maList){
	        if(item.isFile())
	        { 
	          System.out.format("Nom du fichier: %s%n", item.getName()); 
	        } 
	        else if(item.isDirectory())
	        {
	          System.out.format("Nom du répertoire: [%s]%n", item.getName()); 
	        } 
	      }
	    } 
	}
	
	

