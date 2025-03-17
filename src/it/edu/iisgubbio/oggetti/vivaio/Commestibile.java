package it.edu.iisgubbio.oggetti.vivaio;

public class Commestibile extends Pianta implements Imballabile{
	private int quantità;
	private int stagioneProduzione;
	
	public Commestibile(String nome, double costo) {
		super(nome, costo);
	}

	public int getQuantità() {
		return quantità;
	}

	public void setQuantità(int quantità) {
		this.quantità = quantità;
	}

	public String getStagioneProduzione() {
		String x;
		switch(stagioneProduzione) {
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

	public void setStagioneProduzione(String x) {
		switch(x) {
		case "primavera":
			stagioneProduzione=1;
			break;
		case "estate":
			stagioneProduzione=2;
			break;
		case "autunno":
			stagioneProduzione=3;
			break;
		case "inverno":
			stagioneProduzione=4;
			break;
		default:
			stagioneProduzione=0;
		}	
	}
	
	@Override
	public String toString() {
		return "Nome: "+getNome()+
				" ,costo al kilo "+getCosto()+
				" ,Quantità: "+quantità+
				" ,Stagione Produzione: "+getStagioneProduzione();
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
