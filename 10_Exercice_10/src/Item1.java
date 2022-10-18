import java.util.Arrays;





public class Item1 {

	public static void main(String[] args) {
		
		int [] tab1 = { 30, 24, 37, -4, -58, 67, 78, -8, 97, -100};
		
		System.out.printf(" Les entiers de mon tableau sont : %s\n ", Arrays.toString(tab1));
		
		// COPIE DE REFERENCE 
		
		int [] tab2_1 = tab1;
		
		System.out.printf("Les entiers de mon tableau sont : %s\n ", Arrays.toString(tab2_1));
		
		// COPIE AVEC LA METHODE CLONE
		
		int [] tab2_2 = tab1.clone();
		
		System.out.printf("Les entiers de mon tableau sont : %s\n ", Arrays.toString(tab2_2));
		
		// COPIE DE CASE A CASE (CREATION D'UN TABLEAU DE 10 LIGNES) 
		
		int [] tab2_10lignes = new int  [10];
		
		System.arraycopy(tab1, 0, tab2_10lignes, 0, tab1.length);
		
		System.out.printf("Les entiers de mon tableau sont : %s\n ", Arrays.toString(tab2_10lignes));
		
		
		// AJOUT DE AU NOMBRE ENTIER 
		
		for (int i = 0; i < tab1.length; i++) {
			tab1 [i] = tab1 [i] + 10;
			
			
		}
		
		System.out.println("Le tableau 1 : " + Arrays.toString(tab1));
		System.out.println("Le tableau 2_1 : " + Arrays.toString(tab2_1));
		System.out.println("Le tableau 2_2: " + Arrays.toString(tab2_2));
		System.out.println("Le tableau 2_3 : " + Arrays.toString(tab2_10lignes));
		
		
		
		//AFFICHER TABLEAU TRIER
		
		Arrays.sort(tab1);
		System.out.println();
		
		System.out.println("Le tableau 1 TRIER : " + Arrays.toString(tab1));
		
		

	}
	
	
	
	

}
