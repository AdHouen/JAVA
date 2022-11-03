package eval.question;

import java.util.Scanner;

public class Quest5_Intervalle_Correction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(
"*******************************************************************\n" +
"Question 5\n" +
"Demander les deux intervalles [a ; b] et [c ; d]\n"+
"Si b < c ou bien a > d, l'intersection est vide\n"+
"Sinon, calculer deux variables : m (maximum de a et de c) et M (minimum de b et de d)\n"+
" et afficher l'intervalle [m; M]\n"+
"*******************************************************************\n\n\n"
		);
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.printf("================================\nInterval [a,b], a : ");
		int a=sc.nextInt();
		System.out.printf("Interval [a,b], b : ");
		int b=sc.nextInt();
		System.out.printf("================================\nInterval [c,d], c : ");
		int c=sc.nextInt();
		System.out.printf("Interval [c,d], d : ");
		int d=sc.nextInt();
		
		
		if(b<c || d<a) 
			System.out.printf("\nEnsemble vide");
		else {
			int ac=a>c?a:c;
			int bd=b<d?b:d;
			System.out.printf("\n[%d;%d]",ac,bd);
		}
		
		
		
		
		
		sc.close();
	}

}
