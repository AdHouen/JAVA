package darman.part5;

import java.util.Scanner;

public class Exo5_07 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Veuillez entrer un nombre pour connaitre la valeur de son factoriel ");
		int nb = scanner.nextInt();
		int facto = 1;
		int iteration = 1;

		while (iteration <= nb) {
			facto = facto * iteration;
			iteration = iteration + 1;

		}
		System.out.println("La factorielle de " + nb + " est de : " + facto);

	}
////////////////////////////////////////////////////////////////////
/////////////////////////    OU     //////////////////////////////// 
////////////////////////////////////////////////////////////////////
	
//	public static void main(String[] args) {
//
//        System.out.println("calculer le factoriel de : ");
//        int factoriel = scanner.nextInt();
//
//        for (int i = factoriel-1 ; i > 0 ; i--){
//            factoriel *= i;
//        }
//
//        System.out.println(factoriel);
//
//    }
}
