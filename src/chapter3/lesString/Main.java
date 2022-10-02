package chapter3.lesString;

public class Main {

	public static void main(String[] args) {
		
		//1)Immutable
		/*String formation = "OCA";
		
		System.out.println(formation.concat("-OCP"));
		formation = formation.concat("-OCP");
		System.out.println(formation);*/
		
		//2)Concaténation
		/*String formation = "OCA";
		String temp1 = formation+10+4;
		String temp2 = 10+4+formation;
		String temp3 = 10+4+formation +20+3;
		System.out.println("temp 1 ="+ temp1);
		System.out.println("temp 2 ="+ temp2);
		System.out.println("temp 3 ="+ temp3);*/
		
		//3)Memory and String and == vs equals
		/*
		String formation = "OCA";  //Pool
		String cours = new String("OCA"); //Heap
		String certif = "OCA"; //Pool
		String cours2 = new String("OCA");
		
		System.out.println(formation == cours); //false
		System.out.println(formation == certif); // true
		System.out.println(cours == cours2); //false
		System.out.println(formation.equals(cours)); //true
		System.out.println(formation.equals(certif)); // true*/
		
		//4)Common String methods
		/*
		String string = "animals";
		System.out.println(string.length());
		System.out.println(string.charAt(0));
		System.out.println(string.charAt(6));
		
		System.out.println(string.indexOf("mals"));
		System.out.println(string.indexOf("mals",3));
		
		System.out.println(string.toUpperCase());
		System.out.println(string);
		System.out.println(string.replace("an","AA"));
		System.out.println(string);
		
		String string1 = " ani mals \t";
		
		System.out.println(string1);
		System.out.println(string1.trim());*/
		
		String string = "animals";
		System.out.println(string.substring(4,6));
		/////////////// StringBuidler and StringBuffer
		
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder(8);
		StringBuilder sb3 = new StringBuilder("OCA");
		
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		/*
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		
		System.out.println(sb3.length());
		System.out.println(sb3.capacity());*/
		sb1.append("OCPOCPOCPOCPOCPABOCPOCPOCPOCPOCPABA");
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		
		StringBuilder sb = new StringBuilder("Je suis Amine");
		sb.insert(0, "Dr. ");
		sb.append(" Certifié OCA");
		String phrase = sb.toString();
		System.out.println(phrase);
		

	}

}
