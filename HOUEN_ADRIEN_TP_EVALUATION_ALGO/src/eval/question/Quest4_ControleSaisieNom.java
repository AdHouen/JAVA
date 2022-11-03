package eval.question;

import java.util.Scanner;

public class Quest4_ControleSaisieNom {
	
	static Scanner scanner = new Scanner(System.in);
	
	

	
	public static void main(String[] args) {
		System.out.println(
"*******************************************************************\n" + 
"Question 4\n" +
"On demande la saisie d’un nom de famille.\n"+
"La saisie sera redemandée tant que :\n"+
"	le nom contiendra un caractère numérique ,\n"+
"	La longueur sera inférieure à 2,\n"+
"	La longueur sera supérieure à 10 .\n"+
"*******************************************************************\n\n\n"
		);
		
		
		System.out.println("Veuillez saisir votre nom de famille :");
		String nomFamille = scanner.nextLine();
		
		
		
		
		
		
		

	}

}
