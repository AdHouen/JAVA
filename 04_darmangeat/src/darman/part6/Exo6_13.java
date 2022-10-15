package darman.part6;

import java.util.Scanner;

public class Exo6_13 {
	
	static Scanner scanner = new Scanner(System.in);
	

	public static void main(String[] args) {
		
		System.out.println("Combien de valeur voulez vous saisir ? ");
		int valeur = scanner.nextInt();
		int [] monTab = new int [valeur];
		
		System.out.println("il y aura " + valeur + " dans votre tableau ");
		System.out.println();
		
		for (int i = 0; i < monTab.length; i++) {
			System.out.println("Veuillez entrer la valeur numero " + (i+1) + " :");
			monTab [i] = scanner.nextInt();
			
		}
		
		int nbMax = 0;
		int nbPosition = 0;
		
		for (int i = 1; i < valeur; i++) {
			nbMax = monTab [i] > nbMax ? nbMax = monTab [i] : nbMax ;
			nbPosition = nbMax == monTab [i]? nbPosition = i+1 : nbPosition;
			
		}
		
		System.out.println("La valeur max est de : " + nbMax);
		System.out.println("Situer en position : " + nbPosition);
		

	}

}
