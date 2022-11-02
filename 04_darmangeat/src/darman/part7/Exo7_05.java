
package darman.part7;

import java.util.Arrays;
import java.util.Scanner;

public class Exo7_05 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] dico= {"allo","bonjour","bye","ciao","coucou","hello","hi","ohayo","ola","salut","sayonara"};
		System.out.printf("Dictionnaire\n%s\n",Arrays.toString(dico));
		
		System.out.printf("\nSaisir un mot : ");
		String mot=sc.nextLine();
		
		int start=0,end=dico.length-1;
		do {
			int i=(int)((end+start)/2);
			int c=mot.compareToIgnoreCase(dico[i]);
			
			if(c<0) {
				end=i-1;
			}
			else if(c>0) {
				start=i+1;
			}
			else {
				System.out.printf("Le mot \"%s\" est dans le dictionnaire",mot);
				break;
			}
			
			if(end<start) {
				System.out.printf("Le mot \"%s\" n'est pas dans le dictionnaire",mot);
				break;
			}
		}
		while(true);
		sc.close();
	}

}
