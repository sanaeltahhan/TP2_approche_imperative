package fr.algorithmie;

import java.util.Arrays;

public class FirstLast {

public static void main(String[] args) {
		
		//On declare des tableaux d'entiers
		
		int[] array = {6, 17, 5, 4, 0, 6} ;
		int[] array2 = {6} ;
		int[] array3 = {3, 17, 5, 4, 0} ;
		int[] array4 = {} ;

		System.out.println("La valeur du controle pour le tableau : " + Arrays.toString(array) + " est " + firstLast(array)); // result : true
		System.out.println("La valeur du controle pour le tableau : " + Arrays.toString(array2) + " est " + firstLast(array2)); // result : true
		System.out.println("La valeur du controle pour le tableau : " + Arrays.toString(array3) + " est " + firstLast(array3)); // result : false
		System.out.println("La valeur du controle pour le tableau : " + Arrays.toString(array4) + " est " + firstLast(array4)); // result : false

	}
	
	// Creation de la methode firstLast qui verifie les conditions données
	
	static boolean firstLast(int tab[]){
		//Initialisation du boolean
		boolean control = false;
				
		/* On test : elle vaut true si le tableau est de longueur supérieure ou égale à 1 et que le premier et le dernier élément du tableau ont la même valeur
					 elle vaut false dans les autres cas*/
		
		if ( tab.length >= 1 && (tab[0] == tab[tab.length -1])) {
			control = true;
		}
		return control;
	}
}
