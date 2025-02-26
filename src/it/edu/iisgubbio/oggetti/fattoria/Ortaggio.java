package it.edu.iisgubbio.oggetti.fattoria;

public class Ortaggio extends Prodotto{
	protected boolean biologico;
	
	public Ortaggio(String nome, double prezzoAlChilo, boolean biologico){
		super(nome,prezzoAlChilo);
		this.biologico = biologico;
		
	}
	
	public boolean isBiologico() {
		return biologico;
	}
	public void setBiologico(boolean x) {
		this.biologico = x;
	}
	
	@Override
	public String toString() {
		if(biologico==true) {
			return "Ortaggio:"+ nome+ " costo al chilo "+ prezzoAlChilo+"€"+" l'ortaggio è biologico";
		}else {
			return "Ortaggio:"+ nome+ " costo al chilo "+ prezzoAlChilo+"€"+" l'ortaggio non è biologico";
		}
	}
}

