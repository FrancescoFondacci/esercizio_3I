package it.edu.iisgubbio.oggetti.fattoria;

public class Formaggio extends Prodotto {
	//due costrutturi - 1 imposta propietà - 
	//2 nome ,prezz alchilo , periodo stagionatuta , serve a creare formaggio non dop
	
	protected int tempoStagionatura;
	protected boolean dop;
	
	public Formaggio(String nome, double prezzoAlChilo, int tempoStagionatura, boolean dop) {
		super(nome, prezzoAlChilo);
		this.tempoStagionatura = tempoStagionatura;
		this.dop = dop;
	}

	public Formaggio(String nome, double prezzoAlChilo, int tempoStagionatura) {
		super(nome, prezzoAlChilo);
		this.tempoStagionatura = tempoStagionatura;
		this.dop=false;
	}	

	public void setTempoStagionatura(int tempoStagionatura) {
		this.tempoStagionatura = tempoStagionatura;
	}

	public void setDop(boolean dop) {
		this.dop = dop;
	}

	public String toString() {
		if(dop==true) {
			if(tempoStagionatura>0) {
				return "Formaggio: "+ nome+ " costo al chilo "+ prezzoAlChilo+"€"+" stagionato "+ tempoStagionatura+" mese/i"+" dop";
			}else {
				return "Formaggio: "+ nome+ " costo al chilo "+ prezzoAlChilo+"€"+" dop";
			}
			
		}else {
			if(tempoStagionatura>0) {
				return "Formaggio: "+ nome+ " costo al chilo "+ prezzoAlChilo+"€"+" stagionato "+ tempoStagionatura+" mese/i"+" non dop";
			}else {
				return "Formaggio: "+ nome+ " costo al chilo "+ prezzoAlChilo+"€"+" non dop";
			}
		}
	}
	
	
	
	
	
	

}
