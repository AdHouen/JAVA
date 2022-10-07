import java.util.Scanner;

public class Version1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String nom, prenom, adresse, carte, preference;
        char rep;

        do {    
                //SAISIE
            System.out.println("Nom du cavalier : ");
            nom = sc.nextLine();
            System.out.println("Prenom du cavalier : ");
            prenom = sc.nextLine();
            System.out.println("Entrer votre adresse : ");
            adresse = sc.nextLine();
            System.out.println("Entrer votre No de carte FNTE : ");
            carte = sc.nextLine();
            System.out.println("Entrer la liste de vos 3 chevaux preferes : ");
            preference = sc.nextLine();

                // PRESENTATION
            System.out.println("Cavalier No " + carte);
            System.out.println("\t" + prenom + " " + nom);
            System.out.println("\t" + adresse);
            System.out.println("\tChevaux : " + preference);

                //MESSAGE DE FIN
            System.out.print("\n\nVoulez-vous continuer (O/N) ? ");
            rep = sc.nextLine().charAt(0);
            do {         
                if( = 'o')
                {
                    System.out.println("On continue");
                }
                else if(rep == 'n')
                {
                    System.out.println("On arrete"); 
                }
            } while (rep == 'n' || rep == 'o');
        
            //  {
            //     if(rep == 'o')
            //     {
            //         System.out.println("On continue");
            //     }
            //     if(rep == 'n')
            //     {
            //         System.out.println("On arrete");
            //         break;
            //     }
            //     else {
            //         System.out.println("Entrer la bonne lettre");
            //     } 
            // } 
                
            
            
    
        } while (rep == 'o');

        

    
        sc.close();
    }    
}
