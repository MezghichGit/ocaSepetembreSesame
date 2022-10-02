package chapter3.LesTableaux;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		//int []tab  = {10,20,30};
		/*
		int []tab  = new int[4];
		
		System.out.println("Classic loop");
		tab[0]=10;
		for(int i=0; i<tab.length;i++)
		{
			System.out.println(tab[i]);
		}
		
		System.out.println("Enhanced loop");
		
		for(int e : tab)
		{
			System.out.println(e);
		}*/
		
		//Arrays.sort et Arrays.binarySearch
		/*
		int tab[] = {10,3,18,55,4};
		
		
		Arrays.sort(tab);
		System.out.println(Arrays.binarySearch(tab, 3));
		for(int e : tab)
		{
			System.out.print(e+"\t");
		}*/
		
		// Les tableaux multi-dimensions
		
		String names[][]= {{"A","B","C"},{"AA","BB"},{"AAA","BBB","CCCC","EEEFT"}};
		
		for(String [] tab: names)
		{
			for(String name : tab)
			{
				System.out.print(name+"\t");
			}
			System.out.println();
		}
		
		//int [][]tab2,x;  // les deux(tab2 et x) à deux dimensions
		
		int []tab2[],x;   // tab2  2 dimensions mais x tableau à 1 dimension
	}

}
