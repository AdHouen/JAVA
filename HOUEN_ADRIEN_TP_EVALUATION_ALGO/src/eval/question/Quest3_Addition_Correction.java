package eval.question;

import java.util.Scanner;

/**
 * Addition de 5 nombres maximum
 */

public class Quest3_Addition_Correction {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(
                "*******************************************************************\n" +
                        "Question 3\n" +
                        "L'utilisateur saisit 5 nombres maximum.\n" +
                        "Chaque nombre saisi est suivi de la touche [Entrée].\n" +
                        "La saisie est terminée quand les 5 nombres sont saisis ou si on entre le nombre zéro.\n" +
                        "Réafficher la liste des nombres saisis sous la forme d'une addition avec la somme de ses nombres.\n" +
                        "( exemple: 8 + 9 + 2 + 1  = 20 )\n" +
                        "*******************************************************************\n\n\n"
        );

/////////////////
        int[] numberToAdd = new int[5];
        System.out.println("Tapez 5 nombres pour les additioner : (vous pouvez quitter l'application en tapant 0)");

        for (int i = 0; i < 5; i++) {
            int newNumber = scanner.nextInt();

            if (newNumber == 0) {
                break;
            }
            numberToAdd[i] = newNumber;
        }

        StringBuilder finalSentence = new StringBuilder();
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            if (numberToAdd[i] != 0) {
                sum += numberToAdd[i];
                finalSentence.append(numberToAdd[i]);

                if (i < 4 && numberToAdd[i + 1] != 0) {
                    finalSentence.append(" + ");
                }
            }
        }

        if (finalSentence.isEmpty()) {
            finalSentence.append("0");
        }

		finalSentence.append(" = ").append(sum);
		System.out.println(finalSentence);
/////////////////

    }

}
