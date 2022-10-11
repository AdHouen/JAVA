package darman.part4;

import java.util.Scanner;

public class Exo4_02 {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Veuillez entrer l'heure :");
		int a = scanner.nextInt();
		System.out.println("Veuillez entrer les minutes :");
		int b = scanner.nextInt();
		
		
		if (b + 1 == 60 ){
            System.out.println("Dans une minute, il sera " + ( a + 1 ) + " heure(s) et 00 minutes");
        } 
		else if (b + 1 > 60){
			System.out.println("Veuillez entrer un nombre de minute correct");
        	
        }
		else {
            System.out.println("Dans une minute, il sera " + a + " heure(s) " + ( b + 1 ) + " minutes(s) ");
        }
		
	}
    
}
