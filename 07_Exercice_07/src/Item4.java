
public class Item4 {

	public static void main(String[] args) {
		

        double numDouble = 456789.789013456789;
        
        char numChar = (char) numDouble;
        int numInt = (int) numDouble;
        float numFloat = (float) numDouble;
        short numShort = (short) numDouble;
        byte numByte = (byte) numDouble;
        long numLong = (long) numDouble;

        System.out.println("valeur du double : " + numDouble);
        System.out.println("valeur du char : " + numChar);
        System.out.println("valeur du int : " + numInt);
        System.out.println("valeur du float : " + numFloat);
        System.out.println("valeur du short : " + numShort);
        System.out.println("valeur du byte : " + numByte);
        System.out.println("valeur du long : " + numLong);
    }
}

// double a la valeur précise
// char n'a pas de caractère correspondant
// int a la valeur sans précision
// float à la valeur avec une précision de 2
// short a bouclé car il ne peut pas contenir une aussi grande valeur
// byte IDEM
// long a la valeur sans précision