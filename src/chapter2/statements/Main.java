package chapter2.statements;

public class Main {

	public static void main(String[] args) {

		/*
		 * int x = 12; final int y = 4;
		 * 
		 * switch(x) {
		 * 
		 * case 1 : System.out.println("Lundi"); break; // il faut le mettre bien que
		 * c'est pas obligatoire case 2 : System.out.println("Mardi"); break; case 3 :
		 * System.out.println("Mercredi"); break; case y : System.out.println("Jeudi");
		 * break; case 5 : System.out.println("Vendredi"); break; case 6 :
		 * System.out.println("Samedi");break; case 7 :
		 * System.out.println("Dimanche");break; default :
		 * System.out.println("Valeur invalide");
		 * 
		 * }
		 */
		/*
		 * Saison saison = Saison.ETE; switch(saison) { case ETE :
		 * System.out.println("Swiming Time"); break; case HIVER :
		 * System.out.println("Studing Time"); break; default: }
		 */

		/*String names[] = { "Amine", "Salah", "Emna", "Ridha" };
		for (int x = 0; x < names.length; x++) {
			System.out.println(names[x]);
		}*/
		
		//enhanced loop
		/*System.out.println("***********");
		for (String name : names) {
			System.out.println(name);
		}*/
		
		/*String groups[][] = {
				{"Amine","Ali","Ahmed"},
				{"Samah","Salah","Sami","Souad"},
				{"Bilel","Bechir"}
				};
		
		for(String group[]: groups)
		{
			for(String name : group)
			{
				System.out.print(name + "\t");
			}
			System.out.println();
		}*/
		
		// break et continue boucle sans label
		/*
		for(int i = 0; i<10; i++)
		{
			
			//if(i==5) break;
			if(i==5) continue;
			System.out.println("i = "+i);
		}*/
		
		//Notion de label
		
		outer:for(int i = 0; i<10; i++)
		{
			for(int j=0; j<10;j++) {
				        //if(j==5) break outer;
						if(j==5)  continue outer;
						//break;
						System.out.println("(i,j) = ("+i+" "+j+")");
			}
		}
		
		
		System.out.println("Suite du programme...");
	}

}
