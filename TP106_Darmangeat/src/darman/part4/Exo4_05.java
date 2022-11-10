package darman.part4;


import java.util.Scanner;

public class Exo4_05 {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Etes vous un homme (h) ou une femme (f) ? ");
		boolean unHomme = scanner.nextLine().equals("h");
		
		System.out.println("Quel age avez vous ?");
		int age = scanner.nextInt();
		
		boolean imposable = unHomme && age > 20 || !unHomme && age >=18 && age <=35;
		
		if (imposable) {
			System.out.println("Tu es imposable cette année");
			
		} else {
			System.out.println("Tu n'es pas imposable cette année");
		}
	}
	
    
}
