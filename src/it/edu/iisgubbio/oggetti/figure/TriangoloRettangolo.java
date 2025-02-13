package it.edu.iisgubbio.oggetti.figure;

public class TriangoloRettangolo {
	
	double catetoMinore;
	double catetoMaggiore;
		
	// "get" e "set" cambiano i valori delle proprietà
	public double getCatetoMinore() {
		return catetoMinore;
	}

	public void setCatetoMinore(double catetoMinore) {
		this.catetoMinore = catetoMinore;
	}

	public double getCatetoMaggiore() {
		return catetoMaggiore;
	}

	public void setCatetoMaggiore(double catetoMaggiore) {
		this.catetoMaggiore = catetoMaggiore;
	}
			
	
	public TriangoloRettangolo(double baseactetoMinore,double catetoMaggiore) {
		this.catetoMinore=baseactetoMinore;
		this.catetoMaggiore=catetoMaggiore;
	}
	
	public double ipotenusa() {
		double i=Math.sqrt(catetoMinore*catetoMinore + catetoMaggiore*catetoMaggiore);
		return i;
		
	}
	
	public double perimetro() {
		double p=catetoMinore+catetoMaggiore+ipotenusa();
		return p;
	}
	
	public double area() {
		double a=(catetoMinore*catetoMaggiore)/2;
		return a;
	}
	
	public String toString() {
		return "TriangoloRettangolo"+" "+catetoMinore+" * "+""+catetoMaggiore;
	}

}
