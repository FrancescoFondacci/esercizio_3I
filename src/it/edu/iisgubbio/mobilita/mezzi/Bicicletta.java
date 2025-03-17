package it.edu.iisgubbio.mobilita.mezzi;

public class Bicicletta extends AMuscoli{
	
	private int numeroDiRapporti;
	private double peso;
	public Bicicletta(double costo,double peso) {
		super("bicicletta",costo,"quadricipiti");
		this.peso = peso;
	}
	
	@Override
	public String toString() {
		String descrizione="Bicicletta: pesa "+peso+"Kg ";
		if(leggera()) {
			descrizione+="(leggera)";
		}else {
			descrizione+="(pesante)";
		}
		descrizione+=" costa "+costo+"€"+"(ha "+numeroDiRapporti+" rapporti)";
		return descrizione;
	}
	
	public boolean leggera() {
		return peso<10;
	}

	public int getNumeroDiRapporti() {
		return numeroDiRapporti;
	}

	public void setNumeroDiRapporti(int numeroDiRappoti) {
		this.numeroDiRapporti = numeroDiRappoti;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
}
