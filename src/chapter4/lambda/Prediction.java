package chapter4.lambda;

@FunctionalInterface
public abstract interface Prediction {
	
	public abstract boolean test(String s); // une méthode abstraite
	
	//public abstract boolean test2(String s); 
	//version 8 et >
	
	public default void info() {
		System.out.println("Interface Fonctionnelle");
	}
	public default void info2() {
		System.out.println("Interface Fonctionnelle");
	}
	public static void info3() {
		System.out.println("Interface Fonctionnelle");
	}

}
