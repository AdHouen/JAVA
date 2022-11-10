package darman.part6;

import java.util.Arrays;
import java.util.Scanner;

public class Exo6_04 {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		int [] monTab = new int [6];
		
		for (int i  = 0 ; i < monTab.length; i++) {
			monTab [i] = i*i;
			
		}
		
		System.out.println("Mon tableau est " + (Arrays.toString(monTab)));
				

	}

}
