package eval.question;

import java.util.Scanner;

/**
 * Classe les prénoms du plus au moins long
 */

public class Quest6_PrenomLongTri_Correction {


	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(
"*******************************************************************\n" +
"Question 6\n" +
"Demander 5 prénoms et les stocker dans un tableau.\n" +
"Les réafficher « triés » de telle sorte que le prénom le plus long\n" +
"soit en premier etc.\n" +
"Par exemple avec Didier, Bernard, Christine, Ahn, Ali\n" +
"Le programme affichera\n" +
"Christine, Bernard, Didier, Ahn, Ali\n" +
"*******************************************************************\n\n\n"
		);


/////////////////
		String[] cinqPrenoms = new String[5];
		System.out.println("Entrez 5 prénoms");

		for (int i = 0 ; i < 5 ; i++){
			System.out.print("Prénom numéro " + (i+1) + " : ");
			cinqPrenoms[i] = scanner.nextLine();
		}

		String temp;
		for(int i = cinqPrenoms.length-1 ; i>=1 ; i--)
		{
			for(int j = 0 ; j<i ; j++)
				if(cinqPrenoms[j].length() < cinqPrenoms[j+1].length())
				{
					temp = cinqPrenoms[j+1];
					cinqPrenoms[j+1]=cinqPrenoms[j];
					cinqPrenoms[j]=temp;
				}
		}

		for (int i = 0 ; i < 5 ; i++){
			System.out.print(cinqPrenoms[i]);
			if (i < 4){
				System.out.print(", ");
			}
		}
/////////////////

	}
}
