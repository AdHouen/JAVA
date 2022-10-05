import java.util.Scanner;

public class MesNombres {
    public static void main(String[] args) {
        
        System.out.println("Entrer la limite de nombre a calculer");
        Scanner clavier = new Scanner(System.in);
        short limite = clavier.nextShort();



       /* for(int i = 1 ; i<=limite ; i++) {
            System.out.print(i + "     | ");
            System.out.print(i*i + "     | ");
            System.out.println(Math.sqrt(i));
        
        }*/

        for(byte i = 1 ; i<=limite ; i++) {
            short j=(short)Math.pow(i,2);
            float f=(float)Math.sqrt(i);
            System.out.printf("%d | %d | %f\n",i,j,f);
            
        }
    }
}