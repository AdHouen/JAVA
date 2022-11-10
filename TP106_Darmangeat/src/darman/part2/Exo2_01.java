

// Quel résultat produit le programme suivant ?

// Variables val, double numériques
// Début
// Val ← 231
// Double ← Val * 2
// Ecrire Val
// Ecrire Double
// Fin

// ==> Reponse : 

// On verra apparaître à l’écran 231, puis 462 (qui vaut 231 * 2)

package darman.part2 ;

import java.util.Scanner;

public class Exo2_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer Une valeur pour connaitre le carre :");
		int val = sc.nextInt();
		int Double = (val * 2);
		
		System.out.println("Valeur : " + val);
		System.out.println("Valeur de Double : " + Double);
		
	}
}