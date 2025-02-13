package it.edu.iisgubbio.oggetti.figure;

public class Cerchio {
	
	double raggio;
	
	public Cerchio (double x) {
		this.raggio=x;		
	}
	
	public Cerchio() {
		this.raggio=1;
	}
	
	public void setRaggio(double raggio) {
		this.raggio=raggio;
	}
	
	public double getRaggio() {
		return raggio;
	}
	
	
	public double diametro() {
		return raggio*2;
	}
	
	public double circonferenza() {
		double c=2*Math.PI*raggio;
		return c;
	}
	
	

}
