package it.edu.iisgubbio.oggetti.fattoria;

public class Carne extends Prodotto {
	
	private boolean macellazioneKosher;
	private boolean carneBianca;
	
	public Carne(String nome, double prezzoAlChilo, boolean macellazioneKosher, boolean carneBianca) {
		super(nome, prezzoAlChilo);
		this.macellazioneKosher = macellazioneKosher;
		this.carneBianca = carneBianca;
	}
	
	public String toString() {
		String descrizione=nome +" "+ prezzoAlChilo+ "€/kg";
		if (!macellazioneKosher) {
			descrizione+=" non kosher";
		}else {
			descrizione+=" kosher";
		}
		if(!carneBianca) {
			descrizione+=" [carne rossa]";
		}else {
			descrizione+=" [carne bianca]";
		}
		return descrizione;
	}

	public boolean isMacellazioneKosher() {
		return macellazioneKosher;
	}

	public boolean isCarneBianca() {
		return carneBianca;
	}

	
	
	
}
