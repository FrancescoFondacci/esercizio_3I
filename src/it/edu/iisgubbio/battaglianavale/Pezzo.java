package it.edu.iisgubbio.battaglianavale;

public class Pezzo {
	
	protected int x;
	protected int y;
	private boolean colpito;
	
	/**
	 * il metodo serve per sparare contro il pezzo
	 * @param x cordinate colonna del colpo
	 * @param y cordinate riga del colpo
	 * @return true se colpisce
	 */
	public boolean colpo(int x,int y) {
		if(x==this.x && y==this.y) {
			this.colpito=true;
			return true;
		}else {
			return false;
		}
	}

	public Pezzo(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		this.colpito=false;
	}
	/**
	 * verifica se il pezzo è stato colpito
	 * @return true se è stato colpito
	 */
	public boolean isColpito() {
		return colpito;
	}

	@Override
	public String toString() {
		String descrizione= "Pezzo [x=" + x + ", y=" + y ;
		if(colpito) {
			descrizione+="; il pezzo è stato colpito";
		}else {
			descrizione+="; il pezzo non è stato colpito";
		}
		return descrizione+="]";
	}
		
}
