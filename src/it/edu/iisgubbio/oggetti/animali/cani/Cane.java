package it.edu.iisgubbio.oggetti.animali.cani;

public class Cane {
	
	private String nomeCane;
	private String razza;
	private int anno;
	private int grammiCibo;
	private String nomePropietario;
	
	public  Cane() {
	}

	public Cane(String nomeCane, String razza, int anno, int grammiCibo, String nomePropietario) {
		super();
		this.nomeCane = nomeCane;
		this.razza = razza;
		this.anno = anno;
		this.grammiCibo = grammiCibo;
		this.nomePropietario = nomePropietario;
	}
		
	public String toString() {
		return "nome "+nomeCane+" razza "+razza+" anno "+anno;
	}
	
	//metodo verifica proprietario, dato un nome proprietatario si/no
	public boolean verificaProprietario(String nome) {
		if (this.nomePropietario.equals(nome)) {
			return true;
		}else {
			return false;
		}
		//return this.nomePropietario.equals(nome); scritto in una riga
	}

	//class cane metodo età dato un anno restituisce età cane
	public int età(int anno) {
		return anno-this.anno;
	}
}
