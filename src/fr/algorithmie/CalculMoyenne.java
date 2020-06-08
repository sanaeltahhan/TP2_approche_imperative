package fr.algorithmie;

public class CalculMoyenne {
	
	public static void main(String[] args) {

		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		// Quelle est la moyenne des éléments du tableau ?
		System.out.println("####Quelle est la moyenne des éléments du tableau ?####");
		
		int somme = 0;
		float moyenne = 0.0f;
		
		for (int i=0; i<array.length; i++) {
			
			somme = somme + array[i];
		}
		
		moyenne = somme / (float)array.length;
		
		System.out.println("la moyenne des éléments du tableau est : " + moyenne);
		
	}

}
