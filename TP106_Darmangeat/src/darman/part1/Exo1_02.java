// Variables A, B, C en Entier
// Début
// A ← 5
// B ← 3
// C ← A + B
// A ← 2
// C ← B – A
// Fin

// ==> Reponse :
// Après         La valeur des variables est :
// A ← 5         A = 5          B = ?           C = ?
// B ← 3         A = 5          B = 3           C = ?
// C ← A + B     A = 5          B = 3           C = 8
// A ← 2         A = 2          B = 3           C = 8
// C ← B – A     A = 2          B = 3           C = 1


package darman.part1 ;

public class Exo1_02 {
    public static void main(String[] args) {
        int A = 5;
        int B = 3;
        int C = A + B;
        A = 2;
        C = B - A;
 
        
        System.out.println("Valeur de A : " + A + " Valeur de B : " + B + " Valeur de C : " + C);
        
    }

}