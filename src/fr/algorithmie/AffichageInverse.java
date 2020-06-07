package fr.algorithmie;

import java.util.Arrays;

public class AffichageInverse {
	
	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		// Afficher l’ensemble des éléments du tableau grâce à une boucle
		System.out.println("####Afficher l’ensemble des éléments du tableau grâce à une boucle####");
		
		for (int i=0; i < array.length; i++) {
			System.out.println("Les éléments du tableau sont : " + array[i]);
		}
		
		System.out.println();


		
		// Afficher l’ensemble des éléments dans l’ordre inverse du tableau
		System.out.println("####Afficher l’ensemble des éléments dans l’ordre inverse du tableau####");
		
		System.out.println("Le tableau inversé est : ");

		for (int i = array.length - 1; i >= 0; i--) {

			System.out.println(array[i] + " ");
		}
		
		System.out.println();

		//Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy
		System.out.println("####Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy####");

		int[] arrayCopie = new int[array.length];
		
		for (int i=0; i<array.length; i++) {
			arrayCopie[i]=array[i];
		}
		System.out.println("Le tableau arrayCopie est : " + Arrays.toString(arrayCopie));
		
		
		
	}
	
	

}
