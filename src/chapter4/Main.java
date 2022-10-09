package chapter4;

public class Main {

	// public : access modifier
	// static, final, synchronized : optional specifier
	// retun type
	// nom de la méthode
	// les patamètres
	// throws
	public static void info(String name) throws IllegalArgumentException {
		// instructions
		System.out.println("Vous êtes : " + name);
	}

	public static void somme( int... tab) {
		int som = 0;
		for (int e : tab) {
			som += e;
		}
		System.out.println("Somme = " + som);
	}

	public static void main(String ... args) {
	somme();
	somme(10);
	somme(10,2,5,8);

	}

}
