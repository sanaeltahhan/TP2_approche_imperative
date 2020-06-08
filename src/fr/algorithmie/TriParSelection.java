package fr.algorithmie;

import java.util.Arrays;

public class TriParSelection {

	public static void main(String[] args) {
		
		//Implémenter la méthode tri par sélection
		
		int[] array = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;

	    int min; 
	    int x;
	    
	    //Pour chaque élement du tableau
		     
	    for(int i = 0 ; i < array.length - 1 ; i++){
	         
	    	min = i;
	    	
	    	// Je verifie si l'élément suivent est plus petit que l'élément precedent 
	        for(int j = i+1 ; j < array.length; j++) {
	        	if(array[j] < array[min]) {
	        		min = j;
	        	}
	        }
	        
	        //Si oui je remplace l'élement precedent par l'element suivent
	        if(min != i){ 
             x = array[i];
             array[i] = array[min];
             array[min] = x;
	        }
	    }
		
		System.out.println("Le tableau trié par selection est : " + Arrays.toString(array));
		
	}
	
	}
