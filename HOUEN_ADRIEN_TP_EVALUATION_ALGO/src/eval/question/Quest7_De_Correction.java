package eval.question;

public class Quest7_De_Correction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(
"*******************************************************************\n" +
"Question 7\n" +
"Lancer un dé ( valeur aléatoire de 1 à 6 ) 15 fois.\n" + 
"Afficher les sorties et  afficher le nombre de sorties du\n" +
"chiffre 1, de 2, de 3, de 4, de 5 et de 6\n" +
"*******************************************************************\n\n\n"
		);
		
		int[] tab= new int[6];
		
		for(int i=1;i<=15;i++){
			int d=(int)(Math.random()*100)%6+1;
			tab[d-1]++;
            System.out.printf("Lancé n°%d : %d\n",i,d);
        }
		
		for (int i=0;i<6;i++) 
			System.out.printf("\nNombre de %d : %d",i+1,tab[i]);

	}

}
