package org.java.lessons.animals;

import org.java.lessons.animals.abs.Animale;
import org.java.lessons.animals.interf.Flyer;

public class Passerotto extends Animale implements Flyer{

	public Passerotto(String specie, int nArti) {
		super(specie, nArti);
		
	}

	@Override
	public void verso() {
		System.out.println("Cirp Cirp");
		
	}

	@Override
	public void dieta() {
		System.out.println("questo animale mangia prevalentemente vermi e insetti");
		
	}

	@Override
	public String getAnimal() {
		
		return "Passerotto";
	}

	@Override
	public void vola() {
		
		System.out.println("Sto volando Jack");
	}

}
