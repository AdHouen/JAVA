package darman.part7;

import java.util.Arrays;

public class Exo7_06 {

	public static void main(String[] args) {
		int[] tab1={-2,3,9,12,17,23,33,43,62,87,98},tab2={1,2,16,17,25,32,44,76,96,108},tab3=new int[tab1.length+tab2.length];
		int i1=0,i2=0;
		
		while(true){
			if(tab1[i1]<tab2[i2]) {
				tab3[i1+i2]=tab1[i1];
				i1++;
			}
			else if(tab1[i1]>tab2[i2]) {
				tab3[i1+i2]=tab2[i2];
				i2++;
			}
			else {
				tab3[i1+i2]=tab3[i1+i2+1]=tab1[i1];
				i1++;
				i2++;
			}
			
			if(i1>=tab1.length&&i2>=tab2.length) {
				break;
			}
			else if(i1>=tab1.length) {
				for(int i=i2;i<tab2.length;i++) {
					tab3[i1+i]=tab2[i];
				}
				break;
			}
			else if(i2>=tab2.length) {
				for(int i=i1;i<tab1.length;i++) {
					tab3[i2+i]=tab2[i];
				}
				break;
			}
		}
			
		System.out.printf("1er tableau : %s\n",Arrays.toString(tab1));
		System.out.printf("2e tableau : %s\n",Arrays.toString(tab2));
		System.out.printf("Fusion : %s",Arrays.toString(tab3));
	}

}
