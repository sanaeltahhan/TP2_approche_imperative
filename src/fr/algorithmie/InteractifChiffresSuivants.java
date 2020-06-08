package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {
	
	/*Ecrire un programme qui demande un nombre à l’utilisateur puis qui affiche les 10 nombres suivants. Par exemple si l’utilisateur saisit 5, le programme affiche : 6, 7, 8, 9, 10, 11, 12, 13,
	14, 15.*/
	
	public static void main(String[] args) {
			
		// Initialisation du scanner
		Scanner scanner = new Scanner(System.in) ;
		
		// Initialisation de la variable pour stocker la valeur entré par l'utilisateur
		int nb = 0 ;
		
			
		// Affichage du message de saisie dans la console
		System.out.println("Saisir un mombre: ");
		
		// Methode qui permet d'attendre tant que l'utilisateur n'a pas saisi un nombre et a appuyé sur entrer
		nb = scanner.nextInt();
		
		// Affichage du resultat des 10 nombres suivent et arret du scanner 
		
		System.out.println("Les 10 nombres suivant " + nb + " sont :");
		
		for (int i = nb +1 ; i <= nb+10; i++) {
			System.out.println(i);
		}
		scanner.close();
		
	}

}
