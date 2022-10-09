package chapter4.encapsulation;

import java.util.ArrayList;

public final class Player {
	
	private final String nom;
	private final int age;
	private final ArrayList<String> foods;
	public String getNom() {
		return nom;
	}
	public Player(String nom, int age, ArrayList<String> foods) {
		super();
		this.nom = nom;
		this.age = age;
		this.foods = new ArrayList(foods);
	}
	public int getAge() {
		return age;
	}
	public ArrayList<String> getFoods() {
		return new ArrayList(foods);
	}

}
