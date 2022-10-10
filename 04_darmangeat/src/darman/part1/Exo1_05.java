// Variables A, B en Entier
// Début
// A ← 5
// B ← 2
// A ← B
// B ← A
// Fin

// ==> Reponse : 
// Après         La valeur des variables est :
// A ← 5         A = 5          B = ?
// B ← 2         A = 5          B = 2
// A ← B         A = 2          B = 2
// B ← A         A = 2         B = 2
package darman.part1 ;

public class Exo1_05 {
    public static void main(String[] args) {
        int A = 5;
        int B = 2;
        A = B; 
        B = A;
        
        
        System.out.println("Valeur de A : " + A + " Valeur de B : " + B);
        
    }

}
