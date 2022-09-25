package chapter6;

public class Main {

	public static void main(String[] args) {
		/*
		int y = 10;
		int x = 0;
		System.out.println("y/x = "+(y/x));
		*/
		/*
		String nom = null;
		
		System.out.println(nom.length());
		
		*/
		
		int tab[]= {10,20};
		try {
				System.out.println(tab[1]);
				String nom = null;
				System.out.println(nom.length());
		}
		
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Problème dans l'indice du tableau...");
		}
		catch(Exception ex)
		{
			System.out.println("Problème..." + ex.getMessage());
			ex.printStackTrace();
			return;
		}
		
		finally {
		System.out.println("Suite du programme...");
		}
	}

}
