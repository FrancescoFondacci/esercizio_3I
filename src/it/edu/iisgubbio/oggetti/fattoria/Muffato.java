package it.edu.iisgubbio.oggetti.fattoria;

public class Muffato extends Formaggio{
	
	public String nomeMuffa;
	public boolean interno;
	
	public Muffato(String nome, double prezzoAlChilo ,String nomeMuffa) {
		super(nome, prezzoAlChilo,0, false);
		this.nomeMuffa = nomeMuffa;
		this.interno = true;
	}

	public void setInterno(boolean interno) {
		this.interno = interno;
	}
	
	public String toString() {
		String descrizione=nome +" "+ prezzoAlChilo+ "€/kg" + " stagionato"+tempoStagionatura+ " nome muffa "+nomeMuffa;
		if(dop) {
			descrizione+=" dop";
		}else {
			descrizione+=" non dop";
		}
		if(interno) {
			descrizione+=" muffa interna";
		}else {
			descrizione+=" muffa esterna";
		}
		return descrizione;
	}
	
	
	

}
