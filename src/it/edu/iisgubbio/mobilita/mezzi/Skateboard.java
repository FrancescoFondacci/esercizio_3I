package it.edu.iisgubbio.mobilita.mezzi;

public class Skateboard extends AMuscoli{
	
	private int lunghezza;
	
	public Skateboard(String nome,double costo) {
		super(nome,costo,"polpacci");
		this.lunghezza=60;
	}

	public Skateboard(String nome,double costo,int lunghezza) {
		super(nome,costo,"polpacci");
		this.lunghezza = lunghezza;
	}
	
	@Override
	public String toString() {
		String descrizione="Skateboard";
		if(longboard()) {
			descrizione+=" longboard:";
		}
		return descrizione+=" lungo "+lunghezza+"cm"+" costa "+costo+"€";
	}
	
	public boolean longboard() {
		return lunghezza>80;
	}

	public int getLunghezza() {
		return lunghezza;
	}

	public void setLunghezza(int lunghezza) {
		this.lunghezza = lunghezza;
	}
	
	

}
