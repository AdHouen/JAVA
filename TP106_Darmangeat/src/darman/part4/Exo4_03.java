package darman.part4;

import java.util.Scanner;


public class Exo4_03 {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Veuillez entrer l'heure : ");
		int heure = scanner.nextInt();
		System.out.println("Veuillez entrer les minutes : ");
		int minute = scanner.nextInt();
		System.out.println("Veuillez entrer les secondes : ");
		int seconde = scanner.nextInt();
		int secondePlusUn = seconde +1;
		;
		
		if (secondePlusUn  == 60 ){
			secondePlusUn  = 0;
			minute++;
			
		}
		if (minute == 60) {
			minute = 0;
			heure++;
			

		} 
		if (heure == 24) {
			heure = 0;
			
		}
		if (heure > 24 || minute > 60 || seconde > 60) {
			System.out.println("Veuillez entrer une heure avec des valeurs existantes !" );
			
		} else {
			System.out.println("Dans une seconde il sera : " + heure + " heure(s) " + minute + " minute(s) et " + secondePlusUn + " seconde(s)");
			
		}
	
		
		
	}
    
}
