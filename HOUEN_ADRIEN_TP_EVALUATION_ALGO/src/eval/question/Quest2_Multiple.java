package eval.question;

/**
 * @author 77011-05-09
 *Cette classe permet de calculer les nombres divisible par 5
 */
public class Quest2_Multiple {

	
	
	
	/**
	 * @param args
	 * Coucou le main
	 * 
	 */
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
		
		int nbDiv = 5;
		System.out.println("\nAffichage des MULTIPLES de " + nbDiv + " entre 1 et 20\n");
		
		for ( int x = 1 ; x <= 20 ; x++) {
			if (x % nbDiv == 0) {
				System.out.println("Le nombre " + x + " est divisible par " + nbDiv   );
				
			} 
			
		}
		
	}
		
		
		

	}


