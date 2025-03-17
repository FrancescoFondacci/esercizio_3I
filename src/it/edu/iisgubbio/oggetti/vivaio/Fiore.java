package it.edu.iisgubbio.oggetti.vivaio;

public class Fiore extends Pianta{
	
	private String colore;
	private int stagioneFioritura;
	
	public Fiore(String nome, double costo, String colore, String stagioneFioritura) {
		super(nome, costo);
		this.colore = colore;
		setStagioneFioritura(stagioneFioritura);
		
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}
	
	public String getStagioneFioritura() {
		String x;
		switch(stagioneFioritura) {
		case 1:
			x="primavera";
			break;
		case 2:
			x="estate";
			break;
		case 3:
			x="autunno";
			break;
		case 4:
			x="inverno";
			break;
			default:
				x=" ";		
		}
		return x;
	}

	public void setStagioneFioritura(String stagione) {
		switch(stagione) {
		case "primavera":
			stagioneFioritura=1;
			break;
		case "estate":
			stagioneFioritura=2;
			break;
		case "autunno":
			stagioneFioritura=3;
			break;
		case "inverno":
			stagioneFioritura=4;
			break;
		default:
			stagioneFioritura=0;	
		}
	}
	@Override
	public String toString() {
		return "Pianta: "+ getNome()+
				" ,costo: "+ getCosto()+"€"+
				" colore: "+colore+
				" stagione fioritura: "+getStagioneFioritura();
	}
	
	
	

}

