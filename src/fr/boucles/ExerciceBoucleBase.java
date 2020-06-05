package fr.boucles;

public class ExerciceBoucleBase {
	
	public static void main(String[] args) {
		
		System.out.println("####Affichez tous les nombres de 1 à 10####");
		//Affichez tous les nombres de 1 à 10
		
		for (int i=0; i<=10;i++) {
			System.out.println(i);
		}
		
		System.out.println("####Affichez 20 fois votre nom et votre prénom####");

		
		//Affichez 20 fois votre nom et votre prénom
		
		for (int i=0; i<=20; i++) {

			System.out.println(i+". Sana EL TAHHAN" );
		}
		
		System.out.println("####Affichez les éléments pairs de 2 à 100####");

		//Affichez les éléments pairs de 2 à 100
		
		for (int i=0; i<=100; i=i+2) {
			System.out.println(i);
		}
		
		System.out.println("####Affichez les éléments impairs de 1 à 99####");
		// Affichez les éléments impairs de 1 à 99
		
		for (int i=0; i<=100; i=i+2) {
			System.out.println(i-1);
		}
		
	}

}
