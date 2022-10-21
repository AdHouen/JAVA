import java.util.Scanner;

public class Item4 {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		System.out.println("Application pour connaitre les nombres premiers : ");
		
		System.out.println("Veuillez entrer la valeur MIN");
		
		int debut = scanner.nextInt();
		
		System.out.println("Veuillez entrer la valeur MAX");
		
		int fin = scanner.nextInt();
		
		for (int nb = debut; nb <= fin; nb++) {
			int i = nb-1;
			while ((i >= 2) && (nb % i !=0)) {
				i--;
			}
			if (i == 1) {
				System.out.println("" + nb);
			}
		
			
			
		}
		System.out.println("");
		
		

		
			
			

		

	}
}
