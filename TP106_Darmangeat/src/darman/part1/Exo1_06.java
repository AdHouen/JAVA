// Ennonce :
// Plus difficile, mais c’est un classique absolu, qu’il faut absolument maîtriser : 
// Ecrire un algorithme permettant d’échanger les valeurs de deux variables A et B, et ce quel que soit leur contenu préalable.

// ==> Reponse : 
// Début
// …
// C ← A
// A ← B
// B ← C
// Fin

// Il existe différentes solutions possibles (comme toujours), mais le plus simple est de passer par une variable dite temporaire (la variable C).
package darman.part1 ;

public class Exo1_06 {
    public static void main(String[] args) {
    	int A = 1;
    	int B = 5;
    	int C;
        C = A;
        A = B;
       	B = C; 
        
        
        System.out.println("Valeur de A : " + A + " Valeur de B : " + B);
        
    }
    
    
}
    
