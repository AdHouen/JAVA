import java.util.Scanner;

public class Item3 {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Connaitre la SURFACE d'un cercle à partir de son diametre ");
		System.out.println();
		
		System.out.println("Veuillez entrer le diametre du cercle");
		double diamDouble = scanner.nextDouble();
		float diamFloat = (float) diamDouble;
		
		
		
		double valeurDouble = Math.PI * ((diamDouble/2)*(diamDouble/2));
		float valeurFloat = (float) (Math.PI * ((diamDouble/2)*(diamDouble/2)));
		
		
		
		
		
		
		
		System.out.println("La surface du cercle avec la valeur Double est : " + valeurDouble);
		System.out.println("La surface du cercle avec la valeur Float est : " + valeurFloat);
		
		
		
		

	}

}
