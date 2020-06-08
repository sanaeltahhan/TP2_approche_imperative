package fr.algorithmie;

import java.util.Arrays;

public class Rotation {
	
	public static void main(String[] args) {

		// Declaration tableau d'entiers
		int[] array = {6, 17, 5, 4, 0, 6} ;

		// Stockage de l'element le plus à droite
		int elementPlusAdroite = array[array.length-1] ;
		
		// Décalage des éléments vers la droite
		for (int i=array.length -2; i >= 0 ; i--) {
			array[i+1] = array[i];
			
		}
		
		// Positionnement de l'element le plus à droite à gauche du tableau
		array[0] = elementPlusAdroite;
		
		System.out.println("Le nouveau tableau avec une rotation est " + Arrays.toString(array));
	}
	


}
