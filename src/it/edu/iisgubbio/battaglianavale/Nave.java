package it.edu.iisgubbio.battaglianavale;

public class Nave {
	
	private Pezzo[] pezzi;
	private String nome;
	/**
	 * Costruisce una nuova nave
	 * @param x inizio della nave
	 * @param y inizio della nave
	 * @param lunghezza lunghezza della nave
	 * @param direzione se true "orizzontale"
	 * 					se false "verticale"
	 */
	public Nave(String nome,int x,int y, int lunghezza,boolean direzione) {
		super();
		this.nome=nome;
		pezzi=new Pezzo[lunghezza];
		for(int i=0;i<lunghezza;i++) {
			//FIXME ho ignorato la direzione
			//if(Math.random()>0.5){
				pezzi[i]=new Pezzo(x++,y);
			//}else {
				//pezzi[i]=new Pezzo(x,y++);
			//}
			
			
		}
	}
	
	public boolean affondata() {
		int pezziColpiti=0;
		boolean aff=false;
		for(int i=0;i<pezzi.length;i++) {
			if(pezzi[i].isColpito()==true) {
				pezziColpiti+=1;
			}
		}
		if(pezziColpiti==pezzi.length) {
			aff=true;
		}
		return aff;
	}
	
	public boolean colpo(int x,int y) {
		boolean preso=false;
		for(int i=0;i<pezzi.length;i++) {
			if(pezzi[i].colpo(x, y)) {
				preso=true;
			}
		}
		return preso;
	}
	
	public boolean sovrappone(Nave altra) {
		boolean sovrappone=false;
		for(int i=0;i<pezzi.length;i++) {
			for(int iAltra=0;iAltra<altra.pezzi.length;iAltra++) {
				if(this.pezzi[i].x==altra.pezzi[iAltra].x && this.pezzi[i].y==altra.pezzi[iAltra].y) {
					sovrappone=true;
				}
			}
		}
		return sovrappone;

	}
	
	@Override
	public String toString() {
		String risposta="Nome: "+nome;
		for(int i=0;i<pezzi.length;i++) {
			risposta+="\n"+i+": "+pezzi[i].toString();
		}
		return risposta;
	}

	public String getNome() {
		return nome;
	}

	public Pezzo[] getPezzi() {
		return pezzi;
	}
	
	
}


