package fr.algorithmie;

import java.util.Arrays;

public class InversionContenu {

	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		//Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy mais dans l’ordre inverse.
		System.out.println("####Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy mais dans l’ordre inverse.####");
		
		int[] arrayCopy = new int[array.length];
				
		for (int i=0; i<arrayCopy.length; i++) {
			arrayCopy[i] = array[array.length -1-i];
		}
		System.out.println("Le tableau arrayCopie est : " + Arrays.toString(arrayCopy));
		
		
		System.out.println();
		
		//Afficher l’ensemble des éléments des 2 tableaux
		System.out.println("####Afficher l'ensemble des éléments des 2 tableau####");
		
		for (int i=0; i<array.length; i++) {
			System.out.println("La valeur du tableau array est : " + array[i] + " et la valeur du tableau arrayCopy est : " + arrayCopy[i]);
		}

	
	}
}
