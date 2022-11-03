package eval.question;

import java.util.Scanner;

/**
 * Calcul de l'âge auquel la mère aura deux fois celui de son enfant
 */

public class Quest1_age_correction {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(
"*******************************************************************\n" +
"Question 1\n" +
"On veut savoir quand une mère aura le double de l'âge de son fils.\n"+
"Lecture au clavier des 2 âges et présentation du résultat.\n"+
"*******************************************************************\n\n\n"
		);


/////////////////
		System.out.println("Age de la mère :");
		int ageMere = scanner.nextInt();

		System.out.println("Age de l'enfant :");
		int ageEnfant = scanner.nextInt();

		while(true){
			if (ageEnfant * 2 == ageMere){
				System.out.println("La mère aura " + ageMere +
						"\nLe fils aura " + ageEnfant);
				break;
			}
			ageMere++;
			ageEnfant++;
		}
/////////////////


	}

}
