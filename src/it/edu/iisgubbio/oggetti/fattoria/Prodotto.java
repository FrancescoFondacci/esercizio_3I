package it.edu.iisgubbio.oggetti.fattoria;

public class Prodotto {
	protected String nome;
	protected double prezzoAlChilo;
	
	public Prodotto(String nome, double prezzoAlChilo) {
		super(); //richiama la super classe Object
		this.nome = nome;
		this.prezzoAlChilo = prezzoAlChilo;
	}
	
	public Prodotto() {
		super();
	}

	@Override
	public String toString() {
		return "Prodotto"+ nome+ "costo al chilo "+ prezzoAlChilo+"€";
	}
	
	public double calcolaPrezzo(double peso) {
		return peso*prezzoAlChilo;
		
		
	}
	
	
	
	

}