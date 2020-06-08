package fr.algorithmie;

import java.util.Arrays;

public class SommeDeTableauxDiff {
	
	public static void main(String[] args) {

		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		int [] array2 = {-1, 12, 17, 14, 5, -9, 0, 18 } ;
		
		int [] sommeArray;
		
		// Créer un tableau qui contient la somme des 2 précédents tableaux
		System.out.println("####Créer un tableau qui contient la somme des 2 précédents tableaux####");
		
		//Verfier quel tableau est plus grand pour ajuster la taille du nouveau tableau 
		if (array.length >= array2.length) {
			sommeArray = new int[array.length];
		} else {
			sommeArray = new int[array2.length];
		}
		
		// Si le array est le plus grand ou de la même taille que array2
		if (array.length >= array2.length) {
			
			for (int i = 0; i < array.length; i++) {

				// On fait la somme jusqu'à l'index max de array2
				if (i < array2.length) {
					sommeArray[i] = array[i] + array2[i];
				} else {
					sommeArray[i] = array[i];
				}
			}
		} else {
			// si le array2 est le plus grand
			for (int i = 0; i < array2.length; i++) {

				// On fait la somme jusqu'à l'index max de array
				if (i < array.length) {
					sommeArray[i] = sommeArray[i] + array2[i];
				} else {
					sommeArray[i] = array2[i];
				}
			}
		}
		
		
		System.out.println("La somme des éléments des deux tableaux est : " + Arrays.toString(sommeArray));
		
	}

}
