package darman.part3;

import java.util.Scanner;

public class Exo3_04{
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Veuillez entrer un nombre : ");
		
		double a = scanner.nextDouble();
		
		if (a < 0){
			
			System.out.println("Le nombre est negatif");
				
		}
		else if (a == 0) {
			System.out.println("Le nombre est egal a 0");
			
		} else {
			System.out.println("Le nombre est positif");
		}
		
		

	}

}

