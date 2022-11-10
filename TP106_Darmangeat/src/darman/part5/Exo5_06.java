package darman.part5;

import java.util.Scanner;

public class Exo5_06 {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Veuillez entrer un nombre pour calculer la somme de ses entier jusqu'a ce nombre : ");
		int nbEntier = scanner.nextInt();
		int somme = 0;
		int iteration = 1;
		
		
		
		while (iteration <= nbEntier) {
			somme = somme + iteration;
			iteration = iteration + 1;
			
		}
		System.out.println("Le calcul de la somme des entier precedent "+ nbEntier + " est de " + somme);

	}

}
