package fr.algorithmie;

public class ComparaisonTableau {
	
	public static void main(String[] args) {

		int[] array =  {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		int [] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
		
		//Ecrire le code permettant de compter le nombre d’éléments en commun dans ces 2 tableaux
		System.out.println("####Ecrire le code permettant de compter le nombre d’éléments en commun dans ces 2 tableaux####");
		
		int nbrElementCommun = 0;
		
		// Si array est le plus grand ou de la même taille que array2
		if (array.length >= array2.length) {
			
			//Test pour chaque élément de array s'il y a une correspondance dans array2
			for (int i = 0; i < array.length; i++) {
				
				for (int j=0; j<array2.length; j++) {
					if (array[i] == array2[j]) {
						//Incrementation du compteur si c'est vrai
						nbrElementCommun = nbrElementCommun +1;
	
					}
				}
			}
		}
		
		// Si array 2 est le plus grand tableau
		else { 
		  for (int i = 0; i < array2.length; i++) {
				
			for (int j=0; j<array.length; j++) {
				if (array2[i] == array[j]) {
					nbrElementCommun = nbrElementCommun +1;
	
				}
			}
		  }  
	  }
		 
		
		System.out.println("Le nombre commun d'élément entre les deux tableau est de : " + nbrElementCommun);
	}

}
