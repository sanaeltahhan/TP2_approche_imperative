package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {
	
/*Ecrire un jeu qui :
	- choisit un nombre aléatoire entre 1 et 100
	- puis demande à l’utilisateur de trouver ce nombre en lui indiquant s’il est au-dessus ou en dessous du nombre,
	- Lorsque l’utilisateur a trouvé le nombre, le programme affiche « Bravo, vous avez trouvé en N coups » où N représente le nombre d’essais effecté par l’utilisateur
	- le programme se termine.*/
	
	public static void main(String[] args) {
			
		// Initialisation du scanner
		Scanner scanner = new Scanner(System.in) ;
		
		// Initialisation du nombre aléatoire
		int nbAleatoir = new Random().nextInt(100) + 1;;
		
		// Initialisation de la variable pour stocker la valeur entré par l'utilisateur
		int nb = 0 ;
		
		// Initialisation du compteur de coup 
		int coup = 0;
		
		// Initialisation la condition de fin 
		boolean trouve = false;
		
		// Tant que l'utilisateur n'a pas trouvé on reste dans cette boucle
		do {
			
			// Affichage du message de saisie dans la console
			System.out.println("Devine mon nombre, il est compris entre 1 et 100. Bonne chance ! ");
			
			// Methode qui permet d'attendre tant que l'utilisateur n'a pas saisi un nombre et a appuyé sur entrer
			nb = scanner.nextInt();
			
			//Test si l'utilsateur a bien trouvé le nombre
			if (nb == nbAleatoir) {
				trouve = true;
			}
			
			// Sinon lui donner des indices 
			else if (nb > nbAleatoir) {
				System.out.println("Tu es parti loin, descend ! ");		
			}
			else if (nb < nbAleatoir) {
				System.out.println("Tu es trop petit, monte!");
			}
			//Incrementation du nombre de coup à chaque tour où l'utilisateur n'a pas trouver
			coup++;
			
		}
		
		while(!trouve);
		
		// Une fois le nombre trouvé on affiche le msg avec le nombre de coup et on ferme le scanner
		System.out.println("Bien joué ! Tu as trouvé en " + coup + " coup(s)");
		scanner.close();
			
	}

}

