package darman.part6;


import java.util.Scanner;

public class Exo6_14 {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Veuillez saisir la moyenne de la classe ");
		double moyenneClass = scanner.nextDouble();

		System.out.println("Combien de notes voulez vous saisir pour cet eleve ? ");
		int note = scanner.nextInt();
		double [] monTab = new double [note];
		
		double somme = 0;

		for (int i = 0; i < monTab.length; i++) {
			System.out.println("Saisir la note numero " + (i + 1) + " :");
			monTab[i] = scanner.nextInt();
			somme = somme + monTab[i];
			
		}
		
		double moyenneEleve = somme / note;
		double noteSup = 0;
		
		for (int i = 0; i < monTab.length; i++) {
			noteSup = (monTab[i] >= moyenneClass)? noteSup+1 : noteSup;
			
		}
		
		
		
		
		System.out.println("La moyenne de la classe est de " + moyenneClass);
		System.out.println("La moyenne de l'eleve est de " + moyenneEleve);
		System.out.println();
		System.out.println("L'eleve a "+ noteSup + " note(s) au dessus de la moyenne");
		
		
		
		
		

	}

}
