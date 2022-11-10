package item2;

import java.util.Map;

public class AffichePropertiesVM {
	
	static String exploitation = "";
	static String virtuelle = "";
	static String utilisateur = "";
	
	public static void main(String[] args) {
		
		for (Map.Entry<Object, Object> entry : System.getProperties().entrySet()) {
			String key = entry.getKey().toString();
			String val = entry.getValue().toString();
			
			
			if (key.contains("os")) {
				exploitation = exploitation + "\n\t" + key + "  =  " + val ;
			}
			
			/////autre essai que contains avec matches ///
			if (key.matches(".*(java.vm.).*")) {
				virtuelle = virtuelle + "\n\t" + key + "  =  " + val ;
				
			}
			
			////// indexOf = TYPE BOOLEAN //////
			if (key.indexOf("user.") != -1) {
				utilisateur = utilisateur + "\n\t" + key + "  =  " + val ;
			}
			
		}
		System.out.println("Informations sur le système d'exploitation :");
		System.out.println(exploitation);
		System.out.println("\nInformations sur la machine virtuelle :");
		System.out.println(virtuelle);
		System.out.println("\nInformations sur l'utilisateur :");
		System.out.println(utilisateur);
			
	}
	
	
	
	

}
