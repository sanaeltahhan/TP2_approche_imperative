package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {
	
	/*La suite de Fibonacci est une suite qui commence par 0 et 1 et dans laquelle le nombre de rang N est égal à la somme des nombres de rangs N-1 et N-2
		• Créer une classe TestFibonacci
		• Demander à l’utilisateur de choisir un rang N
		• Ecrire un algorithme qui calcule et affiche le nombre de rang N*/

	public static void main(String[] args) {
		
		// Initialisation du scanner
		Scanner scanner = new Scanner(System.in) ;
				
		// Initialisation de la variable pour stocker la valeur entré par l'utilisateur
		int rang = 0 ;
		
		// Affichage du message de saisi de valeur dans la console
		System.out.println("Saisir une valeur :");
		
		// Methode qui permet d'attendre tant que l'utilisateur n'a pas saisi un nombre et a appuyé sur entrer
		rang = scanner.nextInt();
		
		//Initialisation du tableau de taille rang +1
		int[] array = new int[rang +1];
		
		
		// Test si l'utilisateur a bien saisi un rang positif ou null
		
		if (rang >= 0) {
			//Le tableau a au moins une case
			array[0] =0;
			
			// Si la taille du tableau est supérieur à 1
			if (array.length > 1) {
				
				array[1] = 1;
				
				// On peut maintenant calculer les éléments de la suite de proche en proche jusqu'à la fin du tableau qui correspond à l'élément qu'on souhaite afficher
				for (int i = 2; i < array.length; i++) {
					array[i] = array[i - 1] + array[i - 2];
				}	
			}
			//Affichage dernier élément du tableau
			System.out.println(array[rang]);
		}
		else {
			System.out.println("Le calcul de la suite de Fibonacci est impossible, vous devez saisir un rang positif ou nul.");

		}
		
		scanner.close();
		
	}

}
