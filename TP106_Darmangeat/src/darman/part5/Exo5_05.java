package darman.part5;

import java.util.Scanner;

public class Exo5_05 {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Veuillez entrer un chiffre pour connaitre sa table de multiplication : ");
		int choixChiffre = scanner.nextInt();
		
		System.out.println("Table de " + choixChiffre + " :");
		for (int i = 1; i <= 10; i++) {
			System.out.println(choixChiffre + "x" + i + " = " + (choixChiffre*i));
			
			
		}
		
		
		
	}

}
