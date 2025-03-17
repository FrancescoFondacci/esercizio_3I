package it.edu.iisgubbio.mobilita.mezzi;

public class Motocicletta extends Terrestre{
	
	private double cilindrata;
	private int numeroPosti;
	
	public Motocicletta(String nome, double costo,double cilindrata) {
		super();
		this.cilindrata = cilindrata;
		this.nome=nome;
		this.costo=costo;
	}
	
	@Override
	public String toString() {
		return "Motocicletta: "+nome+" cilindrata "+cilindrata;
	}
	
	public boolean puoTrasportare(int persone) {
		if(numeroPosti<persone) {
			return false;
		}else {
			return true;
		}
	}

	public double getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(double cilindrata) {
		this.cilindrata = cilindrata;
	}

	public int getNumeroPosti() {
		return numeroPosti;
	}

	public void setNumeroPosti(int numeroPosti) {
		this.numeroPosti = numeroPosti;
	}
	
	
	

}
