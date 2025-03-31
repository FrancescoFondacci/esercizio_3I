package it.edu.iisgubbio.battaglianavale;

public class Prova {

	public static void main(String[] args) {
		/*Pezzo pezzo1=new Pezzo(2,4);
		System.out.println(pezzo1);
		System.out.println("risultato colpo "+pezzo1.colpo(2,4));
		System.out.println(pezzo1);
		System.out.println("colpito ? : "+pezzo1.isColpito());*/
		
		Nave nave=new Nave("Nave",1,1,3,true);
		System.out.println(nave);
		/*boolean preso=nave.colpo(1, 1);
		boolean preso1=nave.colpo(2, 1);
		boolean preso2=nave.colpo(3, 1);
		System.out.println(nave);
		//System.out.println(preso);
		System.out.println("affondata ? "+nave.affondata());*/
		
		Nave nave2=new Nave("Nave 2",2,1,3,true);
		System.out.println(nave2);
		System.out.println("sovrappone ? "+nave2.sovrappone(nave));

	}

}
