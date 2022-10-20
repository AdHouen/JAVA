package darman.part7;

import java.util.Arrays;
import java.util.Scanner;

public class Exo7_03 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    
    	System.out.println("Combien de valeur voulez vous rentrer ?");
		int nombre = scanner.nextInt();
		Integer [] monTab = new Integer[nombre];
		
		for (int i = 0; i < monTab.length; i++) {
			System.out.printf("Veuillez entrer la valeur %s : ", (i+1));
			monTab [i] = scanner.nextInt();
			
		}
		
		for(int i=0; i < monTab.length/2 ;i++) {
			int temp=monTab [i];
			monTab [i]=monTab [monTab .length-1-i];
			monTab [monTab.length-1-i]=temp;
		}
		
		
		System.out.println("Mon tableau est : " + Arrays.toString(monTab));
    }

}