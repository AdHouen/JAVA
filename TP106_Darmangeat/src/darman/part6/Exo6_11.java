package darman.part6;

import java.util.Arrays;
import java.util.Scanner;

public class Exo6_11 {
	
	static Scanner scanner = new Scanner(System.in);
	

	public static void main(String[] args) {
		
		int [] tableau1 = {4, 8, 7, 12};
		int [] tableau2 = {3 ,6};
		int schtroump = 0;
		
		
		System.out.println("Tableau 1 " + Arrays.toString(tableau1));
		System.out.println("Tableau 1 " + Arrays.toString(tableau2));
		
		for (int i = 0; i < tableau1.length; i++) {
			for (int j = 0; j < tableau2.length; j++) {
				schtroump = schtroump + (tableau1 [i] * tableau2 [j]);
			}
			
			
		}
		
		System.out.println("Le Schtroump est de : " + schtroump);
		

	}

}
