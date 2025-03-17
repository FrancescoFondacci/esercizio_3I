package it.edu.iisgubbio.mobilita.mezzi;

public class Terrestre extends AMotore {
	
	private double velocita;

	public Terrestre() {
		super();
	}
	
	@Override
	public String toString() {
		return "Veicolo terrestre a motore: "+nome+", va a "+getCarburante()+" e al massimo percorre "+velocita+" km in un'ora";
	}
	
	public double tempoDiPercorrenza(int distanza) {
		return distanza/velocita;
	}

	public double getVelocita() {
		return velocita;
	}

	public void setVelocita(double velocita) {
		this.velocita = velocita;
	}
	
	

}
