package org.java.lessons.animals;

import org.java.lessons.animals.abs.Animale;
import org.java.lessons.animals.interf.Swimmer;

public class Cane extends Animale implements Swimmer {
	
	private String nome;

	public Cane(String specie, int nArti, String nome) {
		super(specie, nArti);
		
		setNome(nome);
	}	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public void dieta() {

		System.out.println("questo animale mangia tutto tranne la cioccolata");
		
	}
	@Override
		public void verso() {
			
			System.out.println("Bau Bau");
			
		}

	@Override
	public String getAnimal() {
		
		return "Cane";
	}

	@Override
	public String toString() {
		return super.toString() + " [nome=" + nome + "]";
	}

	@Override
	public void nuota() {
		
		System.out.println("Nuota nuota, zitto e nuota");
		
	}
	
	
}
