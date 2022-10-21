import java.util.Scanner;

public class Item3 {

	static Scanner scanner = new Scanner(System.in);
	static int numCryp = 5;

	public static void main(String[] args) {
		String chaine1;
		String chaine2;

		do {

			System.out.println("Taper le texte que vous voulez crypter : ");
			chaine1 = scanner.next();

			System.out.println("Votre chaine a cryper est : " + chaine1);
			
			chaine2 = cryptage(chaine1);
			System.out.println("Votre chaine cryptée est : " + chaine2);
			
			chaine2 =decryptage(chaine2);
			System.out.println("Votre chaine decryptée est : " + chaine2);
			

		} while (recommence());

		System.out.println("FIN DU PROGRAMME");

	}

	

	private static String cryptage(String s) {
		StringBuffer buffer = new StringBuffer();
		char [] monTab = s.toCharArray();
		for (char c : monTab) {
			if(c>='a'&&c<='z')
				buffer.append(c+=(c<='z'-numCryp)?numCryp:-26+numCryp);
			else if (c>='A'&&c<='Z') {
				buffer.append(c+=(c<='Z'-numCryp)?numCryp:-26+numCryp);
			}
			else {
				buffer.append(c);
			}
		}
		
		return buffer.toString();
	}
	
	private static String decryptage(String s) {
		
		StringBuffer buffer = new StringBuffer();
		char [] monTab = s.toCharArray();
		for (char c : monTab) {
			if(c>='a'&&c<='z')
				buffer.append(c-=(c>='a'+numCryp)?numCryp:-26+numCryp);
			else if (c>='A'&&c<='Z') {
				buffer.append(c-=(c>='A'+numCryp)?numCryp:-26+numCryp);
			}
			else {
				buffer.append(c);
			}
		}
		
		return buffer.toString();
	}

	private static boolean recommence() {
		boolean flag = false;
		String rep;
		do {
			System.out.println("Voulez vous recommencer ? O/N");
			rep = scanner.next();
			if (rep.equalsIgnoreCase("o") || rep.equalsIgnoreCase("n")) {
				flag = true;

			}
		} while (!flag);

		return (rep.equals("o") ? true : false);

	}

}
