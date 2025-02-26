package it.edu.iisgubbio.oggetti.tempo;

public class Test {

	public static void main(String[] args) {
		/* nel metodo main della classe test, creare una istanza di orario che rappresenta 
		 * l'ora di fine l'ezione*/
		
		Orario fineLezione = new Orario(13,35,0);
		System.out.println(fineLezione.toString());
		
		fineLezione.aggiungiMinuti(8);
		System.out.println(fineLezione.toString());
		
		fineLezione.aggiungiSecondi(30);
		System.out.println(fineLezione.toString());
		
		fineLezione.aggiungiSecondi(400);
		System.out.println(fineLezione.toString());
		
		Orario inPiù= new Orario(1,50,30);
		fineLezione.aggiungiOrario(inPiù);
		System.out.println(fineLezione.toString());
		
		
	
	}

}
