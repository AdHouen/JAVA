// Ecrire un programme qui demande son prénom à l'utilisateur, et qui lui réponde par un charmant « Bonjour » suivi du prénom. On aura ainsi le dialogue suivant :

// machine : Quel est votre prénom ?
// utilisateur : Marie-Cunégonde
// machine : Bonjour, Marie Cunégonde !

// ==> Reponse :

// Variable prenom en Caractere
// Début
// Ecrire "Quel est votre prenom ?"
// Lire Prenom
// Ecrire "Bonjour ", Prenom, " !"
// Fin

package darman.part2 ;

import java.util.Scanner;

public class Exo2_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quelle est votre prenom ? ");
		String prenom = sc.nextLine();
		
		
		System.out.println ("Bonjour,  " + prenom + " !"  );
		
		
	}
}