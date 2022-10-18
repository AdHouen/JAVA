import java.util.Scanner;



public class Version2 {
	
	static Scanner scanner = new Scanner(System.in);
	
	
	
	public static void main(String[] args) {
		
		
		
		
		String reponse;
		
		
		do {
			
			System.out.println("Veuillez saisir la valeur du modulo ");
			
			int nbDiv = scanner.nextInt();
			
			System.out.println("Veuillez saisir la valeur de l'intervale Minimal ");
			
			int min =scanner.nextInt();
			
			System.out.println("Veuillez saisir la valeur de l'intervale Maximal ");
			
			int max =scanner.nextInt();
			
			
			System.out.println("\nAffichage des MULTIPLES de " + nbDiv + " entre 0 et 100\n");
			
			for ( int x = min ; x <= max ; x++) {
				if (x % nbDiv == 0) {
					System.out.println(" (" + x + ") \t");
					
				} else {
					System.out.println(" " + x + " \t");
					
				}
				
			}
			
			
			
			
			reponse = scanner.nextLine();
			
				do { 
	
	                if(reponse.equals("o"))
	                {
	                    System.out.println("On continue");
	                    break;
	                    
	                }
	                else if(reponse.equals("n"))
	                {
	                    System.out.println("On arrete");
	                    break;
	                }
	                else
	                {
	                    System.out.print("\n\nVoulez-vous continuer (O/N) ? ");
	                    reponse = scanner.nextLine();
	                }
	            } while (!reponse.equals("o") || !reponse.equals("n"));
			
			
		} while ( reponse.equals("o"));
		
		scanner.close();
		
		
		
		

       
	}
}
