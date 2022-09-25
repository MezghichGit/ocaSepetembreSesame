package chapter6;

public class App {
	
	public static void info() throws ArithmeticException, NullPointerException
	{
		System.out.println("Lebes");
		throw new ArithmeticException("No pas du tout");
	}
	
	public static void affichage() throws Exception{
		System.out.println("RAS");
		throw new Exception("Probleme dans affichage");
	}

	public static void main(String[] args) throws Exception{  //declare
		info();
		affichage();
		try {
		affichage();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		//info();
		
		try {
		info();
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}

}
