package chapter4.encapsulation;

public class Personne {
	
	private int age;
	private boolean estEtudiant;
	private String nom;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isEstEtudiant() {
		return estEtudiant;
	}
	public void setEstEtudiant(boolean estEtudiant) {
		this.estEtudiant = estEtudiant;
	}
	public String getNom() {
		return nom;
	}
	public Personne(int age, boolean estEtudiant, String nom) {
		super();
		this.age = age;
		this.estEtudiant = estEtudiant;
		this.nom = nom;
	}
	
	public Personne() {
		super();	
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

}
