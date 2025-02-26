package it.edu.iisgubbio.oggetti.tempo;

public class Orario {
	/*l'oggetto va costruito specificando ore, minuti, secondi e tutte le proprietà devono essere private
	implementare il metodo tostring che deve rappresentare l'oggetto come testo, ad esempio 10:13:02*/
	
	private int ore;
	private int minuti;
	private int secondi;
	
	public Orario(int ore, int minuti, int secondi) {
		super();
		this.ore = ore;
		this.minuti = minuti;
		this.secondi = secondi;
		
	}

	public String toString() {
		
		if(ore==00 && minuti==00 && secondi==00) {
			return "0"+ore+":"+"0"+minuti+":"+"0"+secondi;	
		}
		return ore+":"+minuti+":"+secondi;
	}
	
	//aggiungere un metodo che aggiunge ore a un certo orario
	
	public void aggiungiOre(int o) {
		this.ore=ore+o;
	}
	
	public void aggiungiMinuti(int m) {
		this.minuti=minuti+m;
		if(minuti>=60) {
			int oreDaAggiungere= this.minuti/60;
			this.minuti=this.minuti%60;
			aggiungiOre(oreDaAggiungere);
		}
	}
	
	public void aggiungiSecondi(int s) {
		this.secondi=secondi+s;
		if(secondi>=60) {
			int minutiDaAggiungere= this.secondi/60;
			this.secondi=this.secondi%60;
			aggiungiMinuti(minutiDaAggiungere);
		}
	}
	
	public void aggiungiOrario(Orario x) {
		aggiungiOre(x.ore);
		aggiungiMinuti(x.minuti);
		aggiungiSecondi(x.secondi);
	}
	
	
}
