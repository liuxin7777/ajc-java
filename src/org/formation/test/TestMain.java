package org.formation.test;

import org.formation.model.Adresse;
import org.formation.model.Person;

public class TestMain {

	public static void main(String[] args) {
		Person person1 = new Person("WANG", 37);
		person1.setPrenom("Jiliang");
		person1.setFemme(false);

		Adresse add = new Adresse();
		add.setCodePostal(91120);
		add.setNomDeVoie("clos madeleine");
		add.setNumero(16);
		add.setVille("Palaiseau");

		person1.setAdresse(add);

		person1.declineTonIdentite();
		
		
		Adresse newAdd = new Adresse();
		newAdd.setCodePostal(75013);
		newAdd.setNomDeVoie("rue des champs");
		newAdd.setNumero(1);
		newAdd.setVille("Paris");
		
		person1.demenage(newAdd);

		System.out.println(person1);

	}

}
