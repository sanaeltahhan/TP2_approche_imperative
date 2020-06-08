package fr.algorithmie;

import java.util.Scanner;

public class Interfactif21Batons {
	
	/*Le jeu est simple mais la réalisation est plus délicate. Vous allez jouer contre l’ordinateur.
	Celui qui prend le dernier baton a perdu.
	Dans ce TP vous allez devoir imaginer vous-même le mécanisme à mettre en place, sur la base
	de ce que vous avez vu précédemment.*/
	
	public static void main(String[] args) {
		
		// Initialisation du scanner
		Scanner scanner = new Scanner(System.in) ;
						
		// Initialisation des batons
		int batons = 21 ;
		
		// Initialisation variable qui stocke le nombre de baton retirés
		int nbBaton = 0;
		
		// Initialisation du boolean pour savoir si la partie est fini
		boolean fini = false;
		
		do {
			// Message au joueur pour qu'il puisse saisir le nombre de baton qu'il souhaite prendre (entre 1 et 3)
			System.out.println("Saisisez le nombre de batons que vous souhaitez retirer (entre 1 et 3) :");
			
			// Methode qui permet d'attendre tant que l'utilisateur n'a pas saisi un nombre et a appuyé sur entrer
			nbBaton = scanner.nextInt();
			
			// Test qui verifie si la saisi du joueur est valide
			if (nbBaton > 0 && nbBaton < 4) {
				// Test si la saisie de l'utilisateur fait terminer la partie
				if(batons - nbBaton <= 0) {
					// si c'est le cas la partie est donc terminer -> fini passe a true
					System.out.println("La partie est terminée, vous avez perdu !");
					fini = true;
				}
				// Sinon il faut juste retirer les batons saisient par le joueur du total
				else {
					batons = batons - nbBaton;
					
				}
				// Si la parti n'est pas fini c'est au tour de l'ordi de jouer
				if (!fini) {
					// L'astuce qui permet à l'ordinateur de ne jamais perdre est de prendre systématiquement
					//un nombre de bâtons égal à 4-nbBatonsJoueur. Par exemple si la joueur a pris
					// 2 bâtons alors l'ordinateur en prend 1 seul, etc.
					int nbBatonOrdi = 4 - nbBaton;
					
					// Test : si l'ordi a prit le dernier baton
					if (batons - nbBatonOrdi <= 0) {
						// Si c'est le cas l'ordi a donc perdu et la partie est terminé -> fini passe a true
						System.out.println("La partie est terminée, vous avez gagner !");
						fini = true;
					}
					//Sinon il faut juste retirer les batons saisient par l'ordi du total
					else {
						batons = batons - nbBatonOrdi;
						System.out.println("L'ordinateur a pris " + nbBatonOrdi + " batons");
					}
				}
			}
			else {
				// Sinon c'est que la saisie du joueur est invalide 
				System.out.println("Votre saisie est non valide !");
				
			}
			
			
		}
		
		// Faire le do tant que fini est false & fermer le scanner
		while(!fini);
		
		scanner.close();
				
		
	}
	 

}
