package darman.part3;

import java.util.Scanner;

public class Exo3_05{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Veuillez entrer deux nombres : ");
		
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		
		if ((a > 0 && b > 0) || (a < 0 && b < 0)) {
            System.out.println("Le produit de ces deux nombres est positif");
		
            
        } 
		else if (a == 0 || b == 0){
            System.out.println("Le produit de ces deux nombres est nul");
            
        } else {
        	System.out.println("Le produit de ces deux nombres est négatif");
			
		}
	
		

	}

}

