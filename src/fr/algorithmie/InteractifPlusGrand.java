package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	/*Ecrire un programme qui demande 10 nombres à un utilisateur et qui affiche le plus grand de ces nombres.*/
	
	public static void main(String[] args) {
			
		// Initialisation du scanner
		Scanner scanner = new Scanner(System.in) ;
		
		// Initialisation de la variable max contenant la plus petite valeur 
		int max = 0;
		
		// Initialisation de la variable pour stocker la valeur entré par l'utilisateur
		int nb = 0 ;
		
		for (int i = 0 ; i <= 10; i++) {
			// Affichage du message de saisie dans la console
			System.out.println("Saisir un nombre: ");
			
			// Methode qui permet d'attendre tant que l'utilisateur n'a pas saisi un nombre et a appuyé sur entrer
			nb = scanner.nextInt();
			
			if (nb > max) {
				max = nb;
			}
			
		}
		
		//Affichage de la valeur max saisie
		System.out.println("La valeur max saisie est : " + max);

		scanner.close();
		
	}
}
