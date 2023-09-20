package org.java.lessons.animals;

import org.java.lessons.animals.abs.Animale;
import org.java.lessons.animals.interf.Flyer;

public class Aquila extends Animale implements Flyer {

	public Aquila(String specie, int nArti) {
		super(specie, nArti);
		
	}

	@Override
	public void verso() {
		System.out.println("Skreeee / 'Murica");
		
	}

	@Override
	public void dieta() {
		System.out.println("questo animale mangia prevalentemente piccoli animali");		
	}

	@Override
	public String getAnimal() {
		
		return "Aquila";
	}

	@Override
	public void vola() {
		System.out.println("Sto volando Jack");
		
	}
	
	

}
