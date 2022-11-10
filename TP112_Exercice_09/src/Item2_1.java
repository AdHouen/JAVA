
public class Item2_1 {

	public static void main(String[] args) {
		String s="L'élève";
		
		char [] motEnChar = s.toCharArray();
		
		for (char c : motEnChar) {
			System.out.printf("\\u%04x ",(int)c);
			
			
		}
		
		
		
		

	}

}
