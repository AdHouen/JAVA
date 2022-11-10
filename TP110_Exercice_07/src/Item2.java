import java.util.Scanner;

public class Item2 {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		
		System.out.println("Veuillez saisir le caractere a passer en majuscule ");
		System.out.println("Taper stop pour arreter le programme");
		
		
		
		
		while (true) {
			String texte = scanner.nextLine();
			if (texte.equalsIgnoreCase("stop")) {
				break;
				
			}
			System.out.println("la lettre en Minuscule est : " + texte);
			char caract = texte.charAt(0);
			System.out.println("La lettre en Majuscule est : " + (char)(caract-32));
		}
		
		
		

	}

}
