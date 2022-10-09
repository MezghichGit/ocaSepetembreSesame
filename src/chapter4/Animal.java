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
		System.out.println("Constructeur par d�faut");
		//this("Chat");
	}
	
	public Animal(String espece)
	{
		//this();  //appel au constructeur par d�faut
		this.espece = espece;
		System.out.println("Constructeur avec param�tre espece");
	}
	public Animal(double poids)
	{
		this.poids = poids;
		System.out.println("Constructeur avec param�tre poids");
	}

}
