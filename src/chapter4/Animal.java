package chapter4;

public class Animal extends Object{
	private String name;
	String espece;
	protected double poids;
	public String nom;

	@Override  // redefinition
	public String toString() {
		return this.name+" "+this.espece +" "+ this.poids+" "+this.nom;
	}
	
	public Animal()
	{
		this("Chat");
		System.out.println("Constructeur par défaut");
		//this("Chat");
	}
	
	public Animal(String espece)
	{
		//this();  //appel au constructeur par défaut
		this.espece = espece;
		System.out.println("Constructeur avec paramètre espece");
	}
	public Animal(double poids)
	{
		this.poids = poids;
		System.out.println("Constructeur avec paramètre poids");
	}

}
