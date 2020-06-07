package fr.boucles;

public class ExerciceBouclesEtTests {
	
	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		// Afficher l’ensemble des éléments du tableau grâce à une boucle

		System.out.println("####Afficher l’ensemble des éléments du tableau grâce à une boucle####");

		
		for(int i = 0; i < array.length; i++) {
			
			System.out.println("Les élement du tableau sont: "+array[i]);
		}
		
		// Afficher l’ensemble des éléments dans l’ordre inverse du tableau

		System.out.println("####Afficher l’ensemble des éléments dans l’ordre inverse du tableau####");

		
		for(int i = 0; i < array.length / 2; i++)
		  {
		      int temp = array[i];
		      array[i] = array[array.length - i - 1];
		      array[array.length - i - 1] = temp;
		  }
		System.out.println("Le tableau inversé est : ");
		  for(int i = 0; i < array.length; i++)
		  {
		   System.out.println(array[i]);
		  }
		  
		  
		  //Combiner une boucle et un test de manière à n’afficher que les entiers supérieurs à 3

		  System.out.println("####Combiner une boucle et un test de manière à n’afficher que les entiers supérieurs à 3####");

		  
		  for (int i =0; i < array.length; i++) {
			  			  
			  if (array[i] > 3) {
				  System.out.println("Les éléments de la liste supérieur à 3 sont : " + array[i]);
				  
			  }
			  
		  }
		  
		  //Combiner une boucle et un test de manière à n’afficher que les entiers pairs
		  
		  System.out.println("####Combiner une boucle et un test de manière à n’afficher que les entiers pairs####");
		  
		  for (int i=0; i < array.length ; i++) {
			  
			  if (array[i]%2 == 0) {
				  System.out.println("Les élements pairs du tableau sont : " + array[i]);
			  }
		  }
		  
		  //Combiner une boucle et un test de manière à n’afficher que valeurs des index pairs
		  
		  System.out.println("####Combiner une boucle et un test de manière à n’afficher que valeurs des index pairs####");

		  for (int i = 0; i < array.length ; i++) {
			  
			  if (i % 2 == 0) {
				  System.out.println("Les élements du tableau dont leur index est pair sont : " + array[i]);
			  }  
		  }
		  
		  // Combiner une boucle et un test de manière à n’afficher que les entiers impairs
		  
		  System.out.println("####Combiner une boucle et un test de manière à n’afficher que les entiers impairs####");
		  
		  for (int i=0; i < array.length ; i++) {
			  
			  if (array[i]%2 != 0) {
				  System.out.println("Les élements impairs du tableau sont : " + array[i]);
			  }
		  }

		  
	}

}
