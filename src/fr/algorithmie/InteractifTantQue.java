package fr.algorithmie;
import java.util.Scanner;

public class InteractifTantQue {
	
	/*Créer une classe InteractifTantQue
		Ecrire un programme qui demande un nombre à l’utilisateur qui doit être obligatoirement compris entre 1 et 10 :
			- Tant que ce nombre n’est pas compris entre 1 et 10, le programme redemande un nombre à l’utilisateur.
			- Si le nombre est compris entre 1 et 10, le programme affiche ce nombre et se termine.*/
	
	public static void main(String[] args) {
		
		// Initialisation du scanner
		Scanner scanner = new Scanner(System.in) ;
		
		// Initialisation du boolen pour tester la condition
		boolean stop = false;
		
		// Initialisation de la variable pour stocker la valeur entré par l'utilisateur
		int nb = 0 ;
		
		do {
			
			// Affichage du message de saisie dans la console
			System.out.println("Saisir un nombre : ");
			
			// Methode qui permet d'attendre tant que l'utilisateur n'a pas saisi un nombre et a appuyé sur entrer
			nb = scanner.nextInt();
			
			// Test : si le nb est bien compri entre 1 et 10
			if (nb >= 1 && nb <= 10 ) {
				stop = true;
			}

		}
		// Executer le do tant que stop est faux
		while (!stop);
		
		// Affichage du resultat et arret du scanner 
		System.out.println(nb);
		scanner.close();
		
	}
	

}
