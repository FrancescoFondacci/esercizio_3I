package it.edu.iisgubbio.oggetti.vivaio;

public class Pianta {
	private String nome;
	private double costo;
	
	public String getNome() {
		return nome;
	}
	public double getCosto() {
		return costo;
	}
	
	public Pianta(String nome, double costo) {
		super(); 
		this.nome = nome;
		this.costo = costo;
	}
	
	@Override
	public String toString() {
		return "Pianta: "+ nome+ " ,costo: "+ costo+"€";
	}
	
	

}
