package chapter3.LesCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
	
		//List :interface de java.util
		//ArrayList : classe qui implémente List de java.util
		/*List obj = new ArrayList();
		System.out.println(obj); //[]
		System.out.println(obj.isEmpty());
		System.out.println(obj.size());
		obj.add("oca");
		obj.add("ocp");
		System.out.println(obj);
		obj.clear();*/
		/*System.out.println(obj);//["oca"]
		System.out.println(obj.isEmpty());
		System.out.println(obj.size());
		obj.remove("oca");
		System.out.println(obj);
		obj.remove(0);*/
		//System.out.println(obj);
		
		// Passage d'une liste vers tableau et vise versa
		/*
		String names[] = {"Amine","Mohamed","Ali"};
		List obj = Arrays.asList(names);
		System.out.println(obj);
		//obj.add("a");
		obj.set(1, "aa");
		System.out.println(obj);
		System.out.println(names[1]);*/
		/*
		List names = new ArrayList();
		names.add("aa");
		names.add("bb");
		Object tab[] = names.toArray();
		System.out.println(tab[0]);
		System.out.println(tab[1]);
		names.add("cc");
		System.out.println(names);
		//System.out.println(tab[2]);*/
		
		// generics (Java v5)
		/*
		List<String> names = new ArrayList<>();
		names.add("Amine");
		names.add("true");
		names.add("12");
		
		for(Object obj : names)
		{
			String temp = (String)obj;
		}*/
		
		List<String> names = new ArrayList<>();
		names.add("bb");
		names.add("aa");
		names.add("dd");
		names.add("cc");
		System.out.println(names);
		Collections.sort(names);
		System.out.println(names);


	}

}
