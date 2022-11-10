package darman.part3;

import java.util.Scanner;


public class Exo3_01 {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		int a;
		
		System.out.println("Entrer une valeur : ");
		a = scanner.nextInt();
	
			if (a > 0) {
				
				System.out.println("La valeur est superieur a 0");
				
			} 
			
			else {
				
				System.out.println("La valeur est inférieur a 0");
				
			} 
		
	}

}
