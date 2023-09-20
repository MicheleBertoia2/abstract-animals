package org.java.lessons.animals;

import org.java.lessons.animals.abs.Animale;
import org.java.lessons.animals.interf.Swimmer;

public class Delfino extends Animale implements Swimmer {

	public Delfino(String specie, int nArti) {
		super(specie, nArti);

	}

	@Override
	public void verso() {
		System.out.println("delfino curioso");
		
	}

	@Override
	public void dieta() {
		System.out.println("questo animale mangia pesci e crostacei");
		
	}

	@Override
	public String getAnimal() {
		// TODO Auto-generated method stub
		return "Delfino";
	}

	@Override
	public void nuota() {
		System.out.println("Nuota nuota, zitto e nuota");
		
	}
	
}
