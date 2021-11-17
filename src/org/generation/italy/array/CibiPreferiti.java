package org.generation.italy.array;

public class CibiPreferiti {

	public static void main(String[] args) {

		String[] favFood = {"pizza", "pollo", "pasta", "tonno", "manzo", "cioccolato", "biscotti"};
		
		int arrayLength = favFood.length;
		
		System.out.println("La classifica contiene " + arrayLength + " cibi.");

		System.out.println("Cibo preferito: " + favFood[0] + ".");
		
		System.out.println("Cibo preferito ma non troppo: " + favFood[arrayLength - 1] + ".");
		
		System.out.println("Cibo a metà della classifica: " + favFood[(arrayLength - 1)/2] + ".");
		
	}

}
