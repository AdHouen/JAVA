package eval.question;

import java.util.Scanner;

public class Quest1_age {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("*******************************************************************\n" + "Question 1\n"
				+ "On veut savoir quand une mère aura le double de l'âge de son fils.\n"
				+ "Lecture au clavier des 2 âges et présentation du résultat.\n"
				+ "*******************************************************************\n\n\n");
		int ageMere, ageFils;

		System.out.println("Quelle est l'age de la mère ?");
		ageMere = scanner.nextInt();

		System.out.println("Quelle est l'age du fils ?");
		ageFils = scanner.nextInt();
		
		System.out.println("L'age de la mere est de " + ageMere + " ans et l'age du fils est de " + ageFils + " ans");
		System.out.println();
		
		int ageMereNew = (ageMere-ageFils);
		
		int ageMereNew2 = (ageMere+(ageMereNew-ageFils));
		
	
		System.out.println("La mere aura le double du fils quand le fils aura " + ageMereNew + " et elle aura donc " + ageMereNew2 );
		
		
	}

}
