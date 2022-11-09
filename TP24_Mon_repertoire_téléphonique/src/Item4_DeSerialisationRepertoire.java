import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;

import java.util.TreeMap;

import javax.swing.JOptionPane;

public class Item4_DeSerialisationRepertoire {
	
	static void lireFichierTexte(){
        System.out.println("\n\n\nAffichage par fichier texte ---");
        try
        {
            File file = new File("repertoire.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            StringBuilder sb = new StringBuilder();
            String line;
            while((line = br.readLine()) != null)
            {
                // ajoute la ligne au buffer
                sb.append(line);
                sb.append("\n");
            }
            fr.close();
            System.out.println("Contenu du fichier: ");
            System.out.println(sb);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
	
//	private static void lireFichierTexte2() {
//		
//		String msg;
//		try {
//            FileInputStream file=new FileInputStream("repertoire.txt");
//            ObjectInputStream obj=new ObjectInputStream(file);
//            TreeMap<String,String> rep=(TreeMap<String,String>) obj.readObject();
//            if(rep.size()>0) {
//	            msg="";
//	    		rep.forEach((k,v)->msg += "\n"+k+" : "+v);
//	            JOptionPane.showMessageDialog(null,msg,"Répertoire",JOptionPane.INFORMATION_MESSAGE);
//            }
//            else 
//            	JOptionPane.showMessageDialog(null,"Le répertoire importé est vide","Répertoire",JOptionPane.INFORMATION_MESSAGE);
//            obj.close();
//        }
//        catch (FileNotFoundException e) {
//        	JOptionPane.showMessageDialog(null, "Le fichier repertoire.txt est introuvable","Erreur",JOptionPane.ERROR_MESSAGE);
//        }
//        catch (IOException e) {
//        	JOptionPane.showMessageDialog(null, "Problème de lecture","Erreur",JOptionPane.ERROR_MESSAGE);
//        }
//        catch (ClassNotFoundException e) {
//        	JOptionPane.showMessageDialog(null, "Class introuvable","Erreur",JOptionPane.ERROR_MESSAGE);
//        }
	}


