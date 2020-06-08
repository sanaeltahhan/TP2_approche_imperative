package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {
	
	/*Ecrire un programme qui demande un nombre à l’utilisateur puis calcule la somme de tous les entiers compris entre 1 et ce nombre.
	  Exemple si l’utilisateur saisit 5, le programme affiche: 15*/
	
	public static void main(String[] args) {
			
		// Initialisation du scanner
		Scanner scanner = new Scanner(System.in) ;
		
		// Initialisation de la variable pour stocker la valeur entré par l'utilisateur
		int nb = 0 ;
		
			
		// Affichage du message de saisie dans la console
		System.out.println("Saisir un nombre: ");
		
		// Methode qui permet d'attendre tant que l'utilisateur n'a pas saisi un nombre et a appuyé sur entrer
		nb = scanner.nextInt();
		
		// Affichage du resultat de la somme de tout les nombres compris ente 1 et le nombre entré par l'utilisateur et arret du scanner 
		
		System.out.println("La somme de tous les entiers compris entre 1 et " + nb + " est :");
		int somme = 0;
		for (int i = 0 ; i <= nb; i++) {
			somme = somme + i;
		}
		System.out.println(somme);

		scanner.close();
		
	}

}
