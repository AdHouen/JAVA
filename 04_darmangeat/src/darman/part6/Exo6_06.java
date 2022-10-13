package darman.part6;


import java.util.Arrays;
import java.util.Scanner;

public class Exo6_06 {
	
	static Scanner scanner = new Scanner(System.in);
	

	public static void main(String[] args) {
		
		int  [] monTab = new int [8];
		monTab [0] = 1;
		monTab [1] = 1;
		for (int i = 2; i < monTab.length; i++) {
			monTab [i] = monTab[i-1] + monTab[i-2];
			
		}
		
		
		System.out.println("Mon tableau est " + Arrays.toString(monTab));
		
		
		

	}

}
