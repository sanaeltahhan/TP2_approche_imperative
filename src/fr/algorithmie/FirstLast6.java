package fr.algorithmie;

import java.util.Arrays;

public class FirstLast6 {
	

	public static void main(String[] args) {
		
		//On declare des tableaux d'entiers
		
		int[] array = {3, 17, 5, 4, 0, 6} ;
		int[] array2 = {6, 17, 5, 4, 0} ;
		int[] array3 = {3, 17, 5, 4, 0} ;
		int[] array4 = {} ;

		System.out.println("La valeur du controle pour le tableau : " + Arrays.toString(array) + " est " + firstLastSix(array)); // result : true
		System.out.println("La valeur du controle pour le tableau : " + Arrays.toString(array2) + " est " + firstLastSix(array2)); // result : true
		System.out.println("La valeur du controle pour le tableau : " + Arrays.toString(array3) + " est " + firstLastSix(array3)); // result : false
		System.out.println("La valeur du controle pour le tableau : " + Arrays.toString(array4) + " est " + firstLastSix(array4)); // result : false

	}
	
	// Creation de la methode firstLastSix qui verifie les conditions données
	
	static boolean firstLastSix(int tab[]){
		//Initialisation du boolean
		boolean control = false;
				
		/* On test : elle vaut true si le tableau a au moins 1 élément et si le premier élément ou ledernier élément vaut 6.
					 elle vaut false dans les autres cas*/
		
		if ( tab.length != 0 && (tab[0] == 6 || tab[tab.length -1] == 6) ) {
			control = true;
		}
		return control;
	}

}
