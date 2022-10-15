package darman.part6;

import java.util.Arrays;
import java.util.Scanner;

public class Exo6_10 {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
	
		
		
		int [] tableau1 = {4, 8, 7, 9, 1, 5, 4, 6};
		int [] tableau2 = {7, 6, 5, 2, 1, 3, 7 ,4};
		int [] tableau3 = new int [tableau1.length] ;
		
		System.out.println("Valeur tableau 1 : " + Arrays.toString(tableau1));
		System.out.println("Valeur tableau 2 : " + Arrays.toString(tableau2));
		
		
		for (int i = 0 ; i < tableau1.length ; i++) {
			tableau3[i]= tableau1[i] + tableau2[i];
			
		
			
		}
		System.out.println();
		System.out.println("Valeur tableau 3 : " + Arrays.toString(tableau3)); 
		

	}

}
