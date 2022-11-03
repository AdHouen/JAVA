package eval.question;

/**
 * Affiche les multiples de 5 entre 1 et 20
 */

public class Quest2_Multiple_Correction {

	public static void main(String[] args) {



		System.out.println(
"*******************************************************************\n" +
"Question 2\n" +
"Ecrivez un programme  qui affiche les nombres entiers multiples\n" +
" de 5 entre 1 et 20.\n" +
"Documenter la classe de ce programme avec un commentaire javadoc et générez\n"+
"la javadoc.\n"+
"*******************************************************************\n\n\n"
		);


/////////////////
		for (int i = 1 ; i<=20 ; i++){
			if (i % 5 == 0){
				System.out.println("Multiple de 5 : " + i);
			}

		}
/////////////////




	}

}
