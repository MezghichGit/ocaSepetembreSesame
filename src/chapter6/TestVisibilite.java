package chapter6;

import chapter4.Animal;

public class TestVisibilite {

	public static void main(String[] args) {
		
			Animal a = new Animal();
			//System.out.println(a.name);
			//System.out.println(a.espece); //default
		
			//System.out.println(a.poids); // proteced
			System.out.println(a.nom);
	
	}

}
