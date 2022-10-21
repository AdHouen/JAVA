import java.util.Scanner;

public class Item2_2 {

	static Scanner scanner = new Scanner(System.in);
	static String rep;

	public static void main(String[] args) {

		 do { 
			System.out.println("Veuillez saisir votre chaine de caractere pour code son UNICODE");
			String s = scanner.nextLine();

			char[] motEnChar = s.toCharArray();

			for (char c : motEnChar) {
				System.out.printf("\\u%04x ", (int)c);
			
			}
			System.out.println();
			
			System.out.println("\nVoulez-vous continuer (O/N) ?");
			rep = scanner.nextLine();

			reponse();

			

		} while (rep.equalsIgnoreCase("o"));

	}

	private static void reponse() {
		
		
		do { 
			
            if(rep.equals("o"))
            {
                System.out.println("On continue");
                System.out.println();
                break;
                
            }
            else if(rep.equals("n"))
            {
                System.out.println("On arrete");
                break;
            }
          
        } while (!rep.equals("o") || !rep.equals("n")); 

	}

}
