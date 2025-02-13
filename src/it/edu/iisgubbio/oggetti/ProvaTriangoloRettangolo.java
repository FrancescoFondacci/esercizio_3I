package it.edu.iisgubbio.oggetti;

import it.edu.iisgubbio.oggetti.figure.TriangoloRettangolo;

public class ProvaTriangoloRettangolo {

	public static void main(String[] args) {
		
		TriangoloRettangolo t=new TriangoloRettangolo(2,4);
		
		t.setCatetoMaggiore(10);
		t.setCatetoMinore(20);
		
		System.out.println(t.toString());
		System.out.println(t.ipotenusa());
		System.out.println(t.perimetro());
		System.out.println(t.area());
	}

}
