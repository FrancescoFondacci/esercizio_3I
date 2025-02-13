package it.edu.iisgubbio.oggetti;

import it.edu.iisgubbio.oggetti.figure.Cerchio;

public class ProvaCerchio {

	public static void main(String[] args) {
		Cerchio c;
		c=new Cerchio(7);
		
		Cerchio p= new Cerchio(22);
		
		System.out.println(c.circonferenza());
		
		c.setRaggio(10);
		System.out.println(p.getRaggio());

	}

}
