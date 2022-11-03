package eval.question;

import java.util.Arrays;
import java.util.Scanner;

public class Quest6_PrenomLongTri {
	
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
		
		
		StringBuffer [] tab1 = {
				new StringBuffer("Didier"),
				new StringBuffer("Bernard"),
				new StringBuffer("Christine"),
				new StringBuffer("Ahn"),
				new StringBuffer("Ali"),
				
				
		};
		
		System.out.println("Annuaire : " + Arrays.toString(tab1));
		
//		boolean trouver = true;
//
//		while (trouver) {
//			trouver = false;
//			for (int i = 0; i < tab1.length - 1; i++) {
//				if (tab1[i].compareTo(tab1[i + 1]) ) {
//					int temp = monTab[i];
//					tab1[i] = tab1[i + 1];
//					tab1[i + 1] = temp;
//					trouver = true;
//				}
//
//			}
		}
		
//		System.out.println("Mon tableau trier avec la methode de trie à bulle est : " + Arrays.toString(monTab));
		
		
		
		
		
		
		
	
		
		
		
		
		
		
//		String[] monTab = new String[5];
//
//		for (int i = 0; i <= 5; i++) {
//			System.out.printf("Veuillez le NOM %s : ", (i + 1));
//			monTab[i] = scanner.nextLine();
//
//		}
//
//		System.out.println("Mon tableau est : " + Arrays.toString(monTab));

	}


