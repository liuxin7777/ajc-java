package org.formation.model;

public class Person {
	private String prenom;
	final private String nom;
	final private int age;
	private Adresse adresse;
	private boolean femme;

	public Person(String nom, int age) {
		super();
		this.nom = nom;
		this.age = age;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public int getAge() {
		return age;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public boolean isFemme() {
		return femme;
	}

	public void setFemme(boolean femme) {
		this.femme = femme;
	}
	
	public void demenage(final Adresse adresse) {
		System.out.println("Ancienne adresse : " + this.adresse);
		this.adresse = adresse;
		System.out.println("Nouvelle adresse : " + this.adresse);
	}
	
	public void declineTonIdentite() {
		System.out.println("Person [prenom=" + prenom + ", nom=" + nom + ", age=" + age);
	}

	@Override
	public String toString() {
		return "Person [prenom=" + prenom + ", nom=" + nom + ", age=" + age + ", adresse=" + adresse + ", femme="
				+ femme + "]";
	}

}
