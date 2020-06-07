package fr.boucles;

import java.util.Arrays;

public class ExerciceTableauEntier {
	
	public static void main(String[] args) {
		
		// Déclarez un tableau d’entiers contenant tous les entiers de 1 à 10
		
		int [] tableauEntier = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println();
		
		//Affichez le premier élément du tableau
		
		System.out.println("La premiere valeur du tableau est : " + tableauEntier[0]);
		
		System.out.println();
		
		//Affichez la longueur du tableau en utilisant la propriété length
		
		System.out.println("La longeur du tableau est de : "+ tableauEntier.length);
		
		System.out.println();
		
		//Affichez le dernier élément du tableau en utilisant la propriété length
		
		System.out.println("Le dernier élément du tableau est : "+ tableauEntier[tableauEntier.length-1]);
		
		System.out.println();
		
		//Modifiez la valeur de l’élément d’index 4 et donnez lui la valeur 8.
		
		tableauEntier[4] = 8;
		
		System.out.println("Le nouveau tableau est " + Arrays.toString(tableauEntier));
		
	}


}
