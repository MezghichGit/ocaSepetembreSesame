package chapter4.lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class App {

	public static void main(String[] args) {
		//public abstract boolean test(String s);
		
		Prediction p1 =(String ch)->{return ch.length()>4;};
		
		Prediction p2 =(String ch)->{return ch.contains("oca");};
		
		System.out.println(p1.test("cycle java oca ocp"));
		System.out.println(p2.test("cycle java ocp ocp"));
		
		Calcul c1 = (int x, int y)->{return (x+y);};
		
		Calcul c11 = (x, y)->x+y;
		
		System.out.println(c1.operation(10, 20));
		
		Calcul c2 = (int x, int y)->{return (x*y);};
		System.out.println(c2.operation(10, 20));
		
		ArrayList<String>names = new ArrayList<>();
		names.add("amine");
		names.add("salah");
		names.add("imed");
		names.add("kamel");
		System.out.println(names);
		Predicate<String> pred = (String ch)->{return ch.contains("i");};
		names.removeIf(pred);
		System.out.println(names);
		

	}

}
