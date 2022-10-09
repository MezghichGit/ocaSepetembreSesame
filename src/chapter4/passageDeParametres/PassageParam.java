package chapter4.passageDeParametres;

public class PassageParam {

	public static void permut(int a, int b) // a et b : paramètres formels
	{
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

	public static void modifStringBuilder(StringBuilder sb) {
		sb.append("-ocp");
	}
	
	public static void modifString(String sb) {
		//sb = sb.concat("-ocp");
		sb.concat("-ocp");
	}

	public static void main(String[] args) {
		Character c = 'a';
		//StringBuilder s = new StringBuilder("oca");
		//modifStringBuilder(s);
		
		String s = new String("oca");
		modifString(s);
		System.out.println("s = "+s);
		/*
		int x = 10;
		int y = 20;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		permut(x, y); // a et y sont les paramètres effectifs
		System.out.println("x = " + x);
		System.out.println("y = " + y);*/
		

	}

}
