package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {
	
	/*Faire un programme avec le menu suivant :
		1. Ajouter un nombre
		2. Afficher les nombres existants.
		
		Description :
		Demander à l’utilisateur de choisir une option dans le menu.
		Si l’utilisateur sélectionne l’option 1, le programme demande un nombre à l’utilisateur puis
		l’ajoute à un tableau.
		Si l’utilisateur sélectionne l’option 2, le programme affiche le contenu du tableau.
		Si le tableau est plein, écrire un algorithme pour agrandir le tableau.*/

	public static void main(String[] args) {
		
		// Initialisation du scanner
		Scanner scanner = new Scanner(System.in) ;
		
		// Initialisation du tableau
		int[] array = new int[0];
		
		// Initialisation de la variable pour stocker la valeur entré par l'utilisateur
		int select = 0 ;
		
		boolean sortie = false;
		
		do {
			// Affichage les options du programme à l'utilisateur
			System.out.println("Options:");
			System.out.println("1 - Pour saisir une valeur");
			System.out.println("2 - Pour afficher les valeurs saisies");
			
			// Methode qui permet d'attendre tant que l'utilisateur n'a pas saisi un nombre et a appuyé sur entrer
			select = scanner.nextInt();
			
			
			switch (select) {
			// Si la valeur est 1
			case 1:

				// On demande à l'utilisateur de saisir une valeur
				System.out.println("Saisissez une valeur");
				int valeur = scanner.nextInt();

				// Creation d'un tableau temporaire plus grand d'une case que le tableau précédent
				int[] tmpArray = new int[array.length + 1];

				// Stockage de toutes les valeurs du tableau array dans le nouveau tableau tmpArray
				for (int i = 0; i < tmpArray.length - 1 && array.length > 0; i++) {
					tmpArray[i] = array[i];
				}

				//  En fin de tableau, on ajoute la valeur saisie
				tmpArray[tmpArray.length - 1] = valeur;

				// Affectage du tableau tmpArray au tableau array
				array = tmpArray;
				break;
			case 2:
				
				// Affichage de toutes les valeurs stockées dans le tableau tab
				for (int i = 0; i < array.length; i++) {
					System.out.print(array[i] + " ");
				}
				System.out.println();
				break;
				
			case 3:

				// Sortie de boucle
				sortie = true;
				break;
				
			default:

				// On ne fait rien
				break;
			}
		}
		
		while(!sortie);
				
		// Arret du scanner
				scanner.close();
			
	}
}
