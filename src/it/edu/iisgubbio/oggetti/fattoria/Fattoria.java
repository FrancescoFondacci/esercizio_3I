package it.edu.iisgubbio.oggetti.fattoria;

public class Fattoria {

	public static void main(String[] args) {
		Prodotto carote = new Prodotto("carote",2.50);
		System.out.println(carote.toString());
		
		double p=carote.calcolaPrezzo(4);
		System.out.println(p);
		
		Ortaggio pomodoro=new Ortaggio("pomodoro",2,true);
		double m=pomodoro.calcolaPrezzo(0.5);
		
		System.out.println(pomodoro);
		System.out.println(m);
		
		Formaggio taleggio= new Formaggio("Taleggio", 25, 1, true);
		Formaggio ricotta= new Formaggio("Ricotta", 4,0);
		
		System.out.println(taleggio);
		System.out.println(ricotta);
		
		Carne costarelle= new Carne("Costarelle", 9.5,false,false);
		System.out.println(costarelle);
		
		Carne pollo=new Carne("Pollo",9.90,false, true);
		System.out.println(pollo);
		System.out.println(pollo.isCarneBianca());
	}

}
