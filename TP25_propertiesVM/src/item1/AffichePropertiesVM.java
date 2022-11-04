package item1;


import java.util.Properties;

public class AffichePropertiesVM {
	
	public static void main(String[] args) {
		
		Properties properties = System.getProperties();
		
		for (int i = 0; i < args.length; i++) {
			sout
			
		}
		
		properties.forEach((k,v) -> System.out.println(k + " =====> " + v));
		
	}

}
