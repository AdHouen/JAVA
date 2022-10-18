import java.util.Arrays;

public class Item2 {
	
	public static void main(String[] args) {
		
		// Creation d'un tableau STRING BUFFER 
		
		StringBuffer [] tab1 = {
				new StringBuffer("salut"),
				new StringBuffer("hello"),
				new StringBuffer("coucou"),
				new StringBuffer("gracias"),
				new StringBuffer("homme"),
				new StringBuffer("femme"),
				new StringBuffer("ciao"),
				new StringBuffer("thank you"),
				new StringBuffer("merci"),
				new StringBuffer("poisson"),
				
		};
		
		System.out.println("Tableau 1 : " + Arrays.toString(tab1));
		
		// COPIE DE REFERENCE 
		
		StringBuffer[] tab2_1 = tab1;
		
		System.out.printf("Tableau 2_1 : %s\n ", Arrays.toString(tab2_1));
		
		// COPIE AVEC LA METHODE CLONE
		
		StringBuffer[] tab2_2 = tab1.clone();
		
		System.out.printf("Tableau 2_2 : %s\n ", Arrays.toString(tab2_2));
		
		// COPIE DE CASE A CASE (CREATION D'UN TABLEAU DE 10 LIGNES) 
		
		 StringBuffer [] tab2_10lignes = new StringBuffer [10];
				
		System.arraycopy(tab1, 0, tab2_10lignes, 0, tab1.length);
				
		System.out.printf("Tableau 2_3 : %s\n ", Arrays.toString(tab2_10lignes));
	
		
		//AFFICHER TABLEAU TRIER
		
		Arrays.sort(tab1);
		System.out.println();
		
		System.out.println("Le tableau 1 TRIER : " + Arrays.toString(tab1));
		
		// MODIFICATION DE LA PREMIERE LETTRE DE CHAQUE CHAINE CONTENU DANS tab1
		System.out.printf("\nModification de la 1ere lettre de chaque element de tab1\n");
			for(StringBuffer s : tab1){
			s.setCharAt(0,s.toString().toUpperCase().charAt(0));
		
		
			}
			
			System.out.println();		
			System.out.println("Le tableau 1 changement : " + Arrays.toString(tab1));
			
		
	}

}
