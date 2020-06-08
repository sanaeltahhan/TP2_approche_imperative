package fr.algorithmie;

public class AffichagePartiel {
	
	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		//Combiner une boucle et un test de manière à n’afficher que les entiers supérieurs à 3
		  System.out.println("####Combiner une boucle et un test de manière à n’afficher que les entiers supérieurs à 3####");

		  
		  for (int i =0; i < array.length; i++) {
			  			  
			  if (array[i] > 3) {
				  System.out.println("Les éléments de la liste supérieur à 3 sont : " + array[i]);
				  
			  }
			  
		  }
		  
		  System.out.println();

		  //Combiner une boucle et un test de manière à n’afficher que les entiers pairs
		  System.out.println("####Combiner une boucle et un test de manière à n’afficher que les entiers pairs####");
		  
		  for (int i=0; i < array.length ; i++) {
			  
			  if (array[i]%2 == 0) {
				  System.out.println("Les élements pairs du tableau sont : " + array[i]);
			  }
		  }
		  
		  
		  System.out.println();
		  
		//Combiner une boucle et un test de manière à n’afficher que valeurs des index pairs
		  System.out.println("####Combiner une boucle et un test de manière à n’afficher que valeurs des index pairs####");

		  for (int i = 0; i < array.length ; i++) {
			  
			  if (i % 2 == 0) {
				  System.out.println("Les élements du tableau dont leur index est pair sont : " + array[i]);
			  }  
		  }
		  
		  
		  System.out.println();
		  
		// Combiner une boucle et un test de manière à n’afficher que les entiers impairs
		  System.out.println("####Combiner une boucle et un test de manière à n’afficher que les entiers impairs####");
		  
		  for (int i=0; i < array.length ; i++) {
			  
			  if (array[i]%2 != 0) {
				  System.out.println("Les élements impairs du tableau sont : " + array[i]);
			  }
		  }

	}

}
