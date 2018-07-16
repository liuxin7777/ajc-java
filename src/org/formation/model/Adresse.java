package org.formation.model;

public class Adresse {
	private int numero;
	private String nomDeVoie;
	private int codePostal;
	private String ville;

	public Adresse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNomDeVoie() {
		return nomDeVoie;
	}

	public void setNomDeVoie(String nomDeVoie) {
		this.nomDeVoie = nomDeVoie;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	@Override
	public String toString() {
		return "Adresse [numero=" + numero + ", nomDeVoie=" + nomDeVoie + ", codePostal=" + codePostal + ", ville="
				+ ville + "]";
	}

}
