package darman.part3;

import java.util.Scanner;

public class Exo3_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Entrer deux nombres : ");
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		if ((a > 0 && b > 0  )|| ( a < 0 && b < 0 ) ){
			
			System.out.println("Leur produit est positif");
			
		} else {
			System.out.println("Leur produit est negatif");
		}
		
		

	}

}
