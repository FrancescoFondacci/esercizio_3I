package it.edu.iisgubbio.file;

public class Comune {
	
	public String nome;
	public String codice;
	public String provincia;
	
	public Comune(String riga) {
		super();
		this.nome=riga.substring(4,54).trim();
		this.codice=riga.substring(0,4);
		this.provincia=riga.substring(54,56);
	}
}