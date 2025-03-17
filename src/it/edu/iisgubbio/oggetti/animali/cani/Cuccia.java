package it.edu.iisgubbio.oggetti.animali.cani;

public class Cuccia {
	
	//interno/esterno - prezzo - numeroposti - colore
	
	private boolean interno;
	private double prezzo;
	private int posti;
	private String colore;
	
	public boolean isInterno() {
		return interno;
	}
	public void setInterno(boolean interno) {
		this.interno = interno;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public int getPosti() {
		return posti;
	}
	public void setPosti(int posti) {
		this.posti = posti;
	}
	public String getColore() {
		return colore;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
	
	public String toString() {
		//n posti - prezzo - iterno/esterno - colore solo se impostato
		if(interno==true) {
			if(colore==null) {
				return "numero posti "+ posti +" prezzo "+ prezzo+" è per interno";
			}else {
				return "numero posti "+ posti +" prezzo "+ prezzo+" è per interno" +" colore "+colore;
			}
			
		}else {
			if(colore==null) {
				return "numero posti "+ posti +" prezzo "+ prezzo +" è per esterno";
			}else {
				return "numero posti "+ posti +" prezzo "+ prezzo +" è per esterno "+" colore "+colore;
			}
		}
		
	}

}
