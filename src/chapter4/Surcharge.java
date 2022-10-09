package chapter4;

import java.util.ArrayList;

public class Surcharge {
	
	public static void somme(int x, int y)
	{
		System.out.println("int x, int y");
	}
	
	public static void somme(short x, short y)
	{
		System.out.println("short x, short y");
	}
	
	public static void somme(long x, long y)
	{
		System.out.println("long x, long y");
	}
	
	public static void somme(double x, double y)
	{
		System.out.println("double x, double y");
	}
	
	public static void somme(Integer x, Integer y)
	{
		System.out.println("Integer x, Integer y");
	}
	
	public static void somme(int ...x)
	{
		System.out.println("int ...x");
	}

	public static void main(String[] args) {
		somme(10,2);
		/*
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<String> names = new ArrayList<>();
		ArrayList<String> objs = new ArrayList();
		objs.add("Amine");
		objs.add(true);
		objs.add(12);
		for(Object o : objs)
		{
			String temp = (String)o;
		}*/

	}

}
