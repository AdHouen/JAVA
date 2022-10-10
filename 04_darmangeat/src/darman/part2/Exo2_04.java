
// Ecrire un programme qui lit :
// -le prix HT d’un article, le nombre d’articles 
// -le taux de TVA
// -le prix total TTC correspondant
// -Faire en sorte que des libellés apparaissent clairement

// ==> Reponse :

// Variables nb, pht, ttva, pttc en Numérique
// Début
// Ecrire "Entrez le prix hors taxes :"
// Lire pht
// Ecrire "Entrez le nombre d’articles :"
// Lire nb
// Ecrire "Entrez le taux de TVA :"
// Lire ttva
// pttc ← nb * pht * (1 + ttva)
// Ecrire "Le prix toutes taxes est : ", pttc
// Fin
// Là aussi, on pourrait squeezer une variable et une ligne en écrivant directement. :
// Ecrire "Le prix toutes taxes est : ", nb * pht * (1 + ttva)
// C'est plus rapide, plus léger en mémoire, mais un peu plus difficile à relire (et à écrire !)

package darman.part2 ;

import java.util.Scanner;

public class Exo2_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer votre prix Hors Taxe : ");
		float prixHT = sc.nextFloat();
		System.out.println("Entrer votre nombre d'article : ");
		int nbArt = sc.nextInt();
		System.out.println("Entrer le % de TVA : ");
		float txTVA = sc.nextFloat();
		float prixTTC = prixHT * nbArt * (1 + txTVA/100);
		
		
		System.out.println("Le prix Hors Taxe est de : " + prixHT + "€");
		System.out.println("Le nombre d'article est de :  " + nbArt );
		System.out.println("Le taux de TVA est de : " + txTVA +"%");
		System.out.printf("Le prix total TTC est de : %.2f € " , prixTTC);
		
		
		
		
	}
	
	
}