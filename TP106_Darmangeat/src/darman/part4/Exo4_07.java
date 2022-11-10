package darman.part4;

import java.util.Scanner;

public class Exo4_07 {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Saisir son age : ");
		int age = scanner.nextInt();
		System.out.println("Depuis combien de temps avez vous votre permis ? ");
		int nbAnneePermis = scanner.nextInt();
		System.out.println("Combien d'accident etes vous responsable ? ");
		int nbAccident = scanner.nextInt();
		System.out.println("Entrer le nombre d'année que vous etes assuré chez nous  : ");
		int nbAnneeAssur = scanner.nextInt();
		
		boolean caracteristique1 = (age >=25) ;
		boolean caracteristique2 = (nbAnneePermis >= 2) ;
		
		boolean caracteristique3 = (nbAnneeAssur > 5);
		
		int nbPoints = 1; 
		nbPoints = caracteristique1? nbPoints+1 : nbPoints;
		nbPoints = caracteristique2? nbPoints+1 : nbPoints;
		
		nbPoints = nbPoints - nbAccident;
		
		nbPoints = caracteristique3 && nbPoints >= 1? nbPoints+1 : nbPoints;
		
		String tarifCouleur = "";
		
		switch (nbPoints) {
		case 4:
			tarifCouleur = "Wuaaa tu es dans la tarification Bleue";
			break;
		case 3:
			tarifCouleur = "Tu es dans la tarification Verte";
			break;
		case 2:
			tarifCouleur = "Tu es dans la tarification Orange";					
			break;
		case 1:
			tarifCouleur = "Tu es dans la tarification Rouge";				
			break;
		case 0:
			tarifCouleur = "Tu ne peux malheureusement pas etre assuré chez nous";
			break;

		default:
			tarifCouleur = "Les données sont erronées";
		}
		
		System.out.println(tarifCouleur);
		
	
		
	}
    
}
