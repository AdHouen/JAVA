package darman.part4;

import java.util.Scanner;

public class Exo4_06 {
	
	static Scanner scanner = new Scanner(System.in);
	

	public static void main(String[] args) {
		
		System.out.println("Saisir le score du 1er candidat : ");
		double scorecandidat1 = scanner.nextDouble();
		System.out.println("Saisir le score du 2eme candidat : ");
		double scorecandidat2 = scanner.nextDouble();
		System.out.println("Saisir le score du 3er candidat : ");
		double scorecandidat3 = scanner.nextDouble();
		System.out.println("Saisir le score du 4er candidat : ");
		double scorecandidat4 = scanner.nextDouble();
		
		boolean candidat1 = scorecandidat1 > 50;
		boolean candidat2 = scorecandidat2 > 50 || scorecandidat3 > 50 || scorecandidat4 > 50;
		boolean candidat3 = scorecandidat1 >= scorecandidat2 && scorecandidat1 >= scorecandidat3 && scorecandidat1 >= scorecandidat4;
		boolean candidat4 = (scorecandidat1 >= 12.5F);
		
		if (candidat1) {
			System.out.println("Le candidat est elu au premier tour avec au moins 50% des suffrages");
		} else if (candidat2 || !candidat4){
			System.out.println("Eliminé");			
		} else if (candidat3) {
			System.out.println("Ballotage favorable");	
		} else if (candidat4) {
			System.out.println("Ballotage défavorable");	
		} 
		
		
		
	}
    
}
	