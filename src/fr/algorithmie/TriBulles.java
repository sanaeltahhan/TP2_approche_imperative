package fr.algorithmie;

import java.util.Arrays;

public class TriBulles {
	
	public static void main(String[] args) {
				
		int[] array = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
		
		System.out.print("Avant le tri le tableau est : " + Arrays.toString(array));
		
	    array = tri_bulles(array);
	    
	    System.out.print("\nAprès le tri le tableau est : " + Arrays.toString(array));
	 }
	 
	//Implémenter la méthode de tri à bulles
	
	 static int[] tri_bulles(int tab[]){
	      
		 int temp;
	      
	      for(int i = tab.length-1 ; i>=1 ; i--){
              for(int j = 0 ; j<i ; j++) {
            	  if(tab[j] > tab[j+1]){
	                  temp = tab[j+1];
	                  tab[j+1]=tab[j];
	                  tab[j]=temp;         
                  }
              }
              
	      }
	      return tab;
	 }

}
