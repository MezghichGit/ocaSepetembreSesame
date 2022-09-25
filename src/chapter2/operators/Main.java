package chapter2.operators;

public class Main {

	public static void main(String[] args) {
		//Unary operators
		
		//1) Pre-increment, pre-decrement, post-increment, post-decrement
		/*
		int x = 10;
		//int y = ++x;
		int y = x++;
		System.out.println("x = "+x);
		System.out.println("y = "+y);*/
		
		//boolean test = true;
		//System.out.println(!test);
		
		// Ternary operator
		/*int v1 = 100;
		int v2 = 200;
		int x = (v1>v2)?1:-1;
		//int k = (v1>v2)?true:"OK";
		System.out.println((v1>v2)?true:"OK");
		System.out.println("x = "+x);
		
		int l = (v1<v2)?(v1<20)?-2:2:-1;
		System.out.println("l = "+l);*/
		
		//Binary logical operators
		/*
		int x = 10;
		int y = 20;
		//boolean res = (x>y)&&(++x>2); // operateur de courcircuit
		//boolean res = (x>y)&(++x>2);
		//boolean res = (x<y)||(++x>2); // operateur de courcircuit
		//boolean res = (x<y)|(++x>2);
		boolean res = (x>y)||(++x>2); 
		System.out.println("res = "+res);
		System.out.println("x = "+x);*/
		
		//Promotion rules
		/*
		byte x = 7;
		byte y = 8;
		int z = x+y;
		char x1='a';
		char y1 = 'b';
		
		int res = x1+y1;
		System.out.println("res = "+res);*/
		
		//byte x = 7;
		//System.out.println("x = "+x);
		/*long x = 10_000_000;
		int y = 50_000_000;*/
		//y = y * x;
		//y = (int)(y * x); 
		/*y *= x; 
		System.out.println(y);
		System.out.println(Integer.MAX_VALUE);*/
		
		Animal a = new Animal();
		Oiseau o = new Oiseau();
		Animal a1 = new Oiseau();  //upcasting
		
		boolean test1 = o instanceof Animal;
		boolean test2 = o instanceof Oiseau;
		boolean test3 = a instanceof Animal;
		boolean test4 = a instanceof Oiseau;
		
		System.out.println("test1 = "+ test1); // true
		System.out.println("test2 = "+ test2); // true
		System.out.println("test3 = "+ test3); // true
		System.out.println("test4 = "+ test4); // false

	}

}
