
// Ecrire un programme qui demande un nombre à l’utilisateur, puis qui calcule et  affiche le carré de ce nombre.


// ==> Reponse :

// Variables nb, carr en Entier
// Début
// Ecrire "Entrez un nombre :"
// Lire nb
// carr ← nb * nb
// Ecrire "Son carré est : ", carr
// Fin

// ou 

// En fait, on pourrait tout aussi bien économiser la variable carr en remplaçant les deux avant-dernières lignes par :
// Ecrire "Son carré est : ", nb*nb
// C'est une question de style ; dans un cas, on privilégie la lisibilité de l'algorithme, dans l'autre, on privilégie l'économie d'une variable.

package darman.part2 ;

import java.util.Scanner;

public class Exo2_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer Une valeur pour connaitre le carre :");
		int val = sc.nextInt();
		int carre = (val * val);
		
		System.out.println("Valeur de Double : " + carre);
		
	}
}