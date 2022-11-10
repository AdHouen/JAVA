package darman.part5;

import java.util.Scanner;

public class Exo5_01 {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Veuillez rentrer un nombre compris encore 1 est 3 : ");
		int nb = scanner.nextInt();
		
		
		
		
		if (nb >= 1 && nb <=3 ) {
			System.out.println("Bien joué, la reponse me convient");
			
			
		} else {
			System.out.println("La reponse ne me convient pas ");
		}
		
		
		}
		

}
