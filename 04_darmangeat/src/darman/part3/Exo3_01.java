package darman.part3;

import java.util.Scanner;


public class Exo3_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a;
		
		System.out.println("Entrer une valeur : ");
		a = sc.nextInt();
	
			if (a > 0) {
				
				System.out.println("La valeur est superieur a 0");
				
			} 
			
			else {
				
				System.out.println("La valeur est inférieur a 0");
				
			} 
		
	}

}
