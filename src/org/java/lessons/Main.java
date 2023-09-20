package org.java.lessons;

import org.java.lessons.animals.Aquila;
import org.java.lessons.animals.Cane;
import org.java.lessons.animals.Delfino;
import org.java.lessons.animals.Passerotto;
import org.java.lessons.animals.abs.Animale;
import org.java.lessons.animals.interf.Flyer;
import org.java.lessons.animals.interf.Swimmer;

public class Main {
	static void faiVolare(Flyer animale)
	{
		animale.vola();
	}
	static void faiNuotare(Swimmer animale)
	{
		animale.nuota();
	}
	public static void main(String[] args) {
	
		
		
		Animale[] animali = new Animale[4];
		
		animali[0] = new Cane("mammifero", 4, "Lampino");
		animali[1] = new Passerotto("volatile", 4);
		animali[2] = new Aquila("volatile", 4);
		animali[3] = new Delfino("mammifero", 3);
		
		for(int i = 0; i < animali.length; i++)
		{
			Animale anim = animali[i];
			System.out.println(anim + "\n");
			System.out.print("Verso: ");
			anim.verso();
			System.out.print("\nDieta: ");
			anim.dieta();
			System.out.println("\n");
			if(anim instanceof Flyer)
			{
				faiVolare((Flyer) anim);
			}
			if(anim instanceof Swimmer)
			{
				faiNuotare((Swimmer) anim);
			}
			System.out.println("\n-------------------\n");
		}
		
		
	}
}
