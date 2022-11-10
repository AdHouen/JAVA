// Variables A, B en Entier
// Début
// A ← 5
// B ← A + 4
// A ← A + 1
// B ← A – 4
// Fin

// ==> Reponse : 
// Après         La valeur des variables est :
// A ← 5         A = 5          B = ?
// B ← A + 4     A = 5          B = 9
// A ← A + 1     A = 6          B = 9
// B ← A – 4     A = 6          B = 2

package darman.part1 ;

public class Exo1_03 {
    public static void main(String[] args) {
        int A = 5;
        int B = A + 4;
        A = A + 1;
        B = A -4; 
        
        System.out.println("Valeur de A : " + A + " Valeur de B : " + B);
        
    }

}