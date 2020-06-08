package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {
	
	/* Créer une classe InteractifTableMult
	   Ecrire un programme qui demande un nombre à l’utilisateur qui doit être compris entre 1 et 10. 
	   Une fois que le nombre est bien entre 1 et 10, le programme affiche la table de multiplication de ce nombre.*/
	
public static void main(String[] args) {
		
		// Initialisation du scanner
		Scanner scanner = new Scanner(System.in) ;
		
		// Initialisation du boolen pour tester la condition
		boolean stop = false;
		
		// Initialisation de la variable pour stocker la valeur entré par l'utilisateur
		int nb = 0 ;
		
		do {
			
			// Affichage du message de saisie dans la console
			System.out.println("Saisir un nombre entre 1 et 10 : ");
			
			// Methode qui permet d'attendre tant que l'utilisateur n'a pas saisi un nombre et a appuyé sur entrer
			nb = scanner.nextInt();
			
			// Test : si le nb est bien compri entre 1 et 10
			if (nb >= 1 && nb <= 10 ) {
				stop = true;
			}

		}
		
		// Executer le do tant que stop est faux
		while (!stop);
		
		// Affichage du resultat de la table de multiplication et arret du scanner 
		System.out.println("Table de " + nb + " :");
		for (int i = 0; i <= 10; i++) {
			System.out.println(nb + " * " + i + " = " + (nb * i));
		}
		scanner.close();
		
	}

}
