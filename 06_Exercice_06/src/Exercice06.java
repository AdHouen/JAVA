import java.util.Scanner;

public class Exercice06 {
	
	
	// AFFICHAGE DE 4 CHAR PAR LIGNE
	// 10 LIGNES PAR PAGE 
	
	
	static final int CHAR_BY_LINE=3;
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		 int nombreElementsDansUneLigne = 0;
		 
        for (int codeDecimal = 33; codeDecimal <= 127; codeDecimal++) {
            nombreElementsDansUneLigne++;
            if (nombreElementsDansUneLigne == CHAR_BY_LINE) {
                System.out.println("");
                nombreElementsDansUneLigne = 0;
            }
            char caracter = (char) codeDecimal;
            System.out.print("'" + caracter + "'\t" + Integer.toHexString(codeDecimal) + "\t" + codeDecimal + "\t\t\t");
        }
		
		
		
		
		
		

	}

}
