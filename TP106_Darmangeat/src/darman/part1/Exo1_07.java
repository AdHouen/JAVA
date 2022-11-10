// Une variante du précédent : 
// On dispose de trois variables A, B et C. Ecrivez un algorithme transférant à B la valeur de A, à C la valeur de B et à A la valeur de C (toujours quels que soient les contenus préalables de ces variables). 

// ==> Reponse : 
// Début
// …
// D ← C
// C ← B
// B ← A
// A ← D
// Fin

// En fait, quel que soit le nombre de variables, une seule variable temporaire suffit…
package darman.part1 ;

public class Exo1_07 {
    public static void main(String[] args) {
    	int A = 1;
    	int B = 5;
    	int C = 10;
    	int D;
    	
    	D = C;
        C = B;
        B = A;
       	A = D; 
        
       	
        System.out.println("Valeur de A : " + A + " Valeur de B : " + B + " Valeur de C : " + C);
        
    }
    
    
}