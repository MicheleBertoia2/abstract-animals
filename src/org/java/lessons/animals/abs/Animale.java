package org.java.lessons.animals.abs;

public abstract class Animale {
	
	private String specie;
	private int nArti;
	
	public Animale(String specie, int nArti)
	{
		setSpecie(specie);
		setnArti(nArti);
	}
	
	public abstract void verso();
	public abstract void dieta();
	public abstract String getAnimal();
	
	public String getSpecie() {
		return specie;
	}

	public void setSpecie(String specie) {
		this.specie = specie;
	}

	public int getnArti() {
		return nArti;
	}

	public void setnArti(int nArti) {
		this.nArti = nArti;
	}

	public void dormi()
	{
		System.out.println("Zzzz....");
	}

	@Override
	public String toString() {
		return "Animale = " + getAnimal() + " [specie=" + getSpecie() + ", nArti=" + getnArti() + "]";
	}
	
	
}
	
