package it.edu.iisgubbio.oggetti.vivaio;

public class Bonsai extends Pianta  implements Imballabile{
	private int età;
	

	public Bonsai(String nome, double costo, int età) {
		super(nome, costo);
		this.età = età;
	}

	public int getEtà() {
		return età;
	}

	public void setEtà(int età) {
		this.età = età;
	}
	
	public boolean vecchio() {	
		return età>20;
	}
	
	@Override
	public String toString() {
		String descrizione="Nome: "+getNome()+", prezzo: "+getCosto()+ ", età:"+ età;
		if(this.vecchio()) {
			descrizione+=", il bonsai è vecchio";
		}else {
			descrizione+=", il bonsai è giovane";
		}
		return descrizione;
	}

	@Override
	public double getVolumeImballo() {
		return 16;
	}

	@Override
	public int getUnitàperImballo() {
		return 20;
	}
	
	
	
	
	

}
