// Variables A, B, C en Entier
// Début
//  A ← 3
// B ← 10
// C ← A + B
// B ← A + B
// A ← C
// Fin

// 	==> Reponse : 
// 	Après         La valeur des variables est :
// A ← 3         A = 3          B = ?           C = ?
// B ← 10        A = 3          B = 10          C = ?
// C ← A + B     A = 3          B = 10          C = 13
// B ← A + B     A = 3          B = 13          C = 13
// A ← C        A = 13         B = 13         C = 13

	
package darman.part1 ;

public class Exo1_04 {
    public static void main(String[] args) {
        int A = 3;
        int B = 10;
        int C = A + B;
        B = A + B; 
        A = C;
        
        System.out.println("Valeur de A : " + A + " Valeur de B : " + B + " Valeur de C : " + C);
                
               
    }
    

}

