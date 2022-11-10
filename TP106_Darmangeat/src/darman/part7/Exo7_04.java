package darman.part7;

import java.util.Arrays;
import java.util.Scanner;



public class Exo7_04 {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		int [] monTab = {12 ,8 ,4 ,45 ,64 ,9 ,2 };
		
		System.out.println("Mon tableau est " + Arrays.toString(monTab));
		
		
//		CETTE TECHNIQUE MET LE NOMBRE CHOISI A 0 
		
//		System.out.println("Quelle valeur voulez vous supprimer ? ");
//		int suppr = scanner.nextInt();
//		
//		for (int i = 0; i < monTab.length; i++) {
//			if (suppr == monTab [i] ) {
//				monTab [i] = monTab [i]-suppr;
//				
//			}
//			
//		}
//		System.out.println("Le nouveau tableau est : " + Arrays.toString(monTab));
		
//		CETTE TECHNIQUE SUPPRIMER DU TABLEAU LE NOMBRE
		
		System.out.println("Quelle est la position du nombre que vous voulez supprimer ? ");
		
		int position = scanner.nextInt();
		
		int [] nouveauTab = new int [monTab.length-1];
		
		for (int i = 0; i < nouveauTab.length-1; i++) {
			if ( i >= position ) {
				nouveauTab[i] = monTab [i+1];
				
			} else {
				nouveauTab[i] = monTab [i];
			}
			
		}
		System.out.println("Mon nouveau tableau est : " + Arrays.toString(nouveauTab));
		
		
		
		
		

	}

}
