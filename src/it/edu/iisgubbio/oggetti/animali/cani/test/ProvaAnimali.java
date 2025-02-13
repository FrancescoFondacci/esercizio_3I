package it.edu.iisgubbio.oggetti.animali.cani.test;

import it.edu.iisgubbio.oggetti.animali.cani.Cane;
import it.edu.iisgubbio.oggetti.animali.cani.Cuccia;

public class ProvaAnimali {

	public static void main(String[] args) {
		
		Cane fido=new Cane("Fido","husky",2017,412,"Fondacci");
		Cane wisky=new Cane("Wisky","bassotto",2013,512,"Fondacci");
		Cuccia cuccia=new Cuccia();
		
		cuccia.setInterno(true);
		cuccia.setPosti(1);
		cuccia.setPrezzo(87);
		cuccia.setColore("rosso");
		
		System.out.println(fido.toString());
		System.out.println(wisky.toString());
		System.out.println(cuccia.toString());
 
	}

}
