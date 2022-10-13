package darman.part6;


import java.util.Arrays;
import java.util.Scanner;

public class Exo6_05 {
	
	static Scanner scanner = new Scanner(System.in);
	

	public static void main(String[] args) {
		
		int  [] monTab = new int [7];
		monTab [0] = 1;
		
		
		for (int i =  1 ; i < 7 ; i++) {
			monTab [i] =  monTab[i-1] + 2  ;
			
		}
		
		System.out.println("Mon tableau est " + Arrays.toString(monTab));
		
		
		

	}

}
