package chapter4.encapsulation;

import java.util.ArrayList;

public class UsePlayer {

	public static void main(String[] args) {
		ArrayList<String> repas = new ArrayList<>();
		
		repas.add("Fish");
		repas.add("Pizza");
		repas.add("Proteine");
		Player p = new Player("Cristiano",38,repas);
		repas.clear();
		ArrayList<String> dinnerFoods = p.getFoods();
		dinnerFoods.clear();
		System.out.println(p.getFoods());
		

	}

}
