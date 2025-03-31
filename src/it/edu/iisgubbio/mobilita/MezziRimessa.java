package it.edu.iisgubbio.mobilita;

import it.edu.iisgubbio.mobilita.mezzi.AMotore;
import it.edu.iisgubbio.mobilita.mezzi.AMuscoli;
import it.edu.iisgubbio.mobilita.mezzi.Automobile;
import it.edu.iisgubbio.mobilita.mezzi.Bicicletta;
import it.edu.iisgubbio.mobilita.mezzi.MezzoDiTrasporto;
import it.edu.iisgubbio.mobilita.mezzi.Motocicletta;
import it.edu.iisgubbio.mobilita.mezzi.Skateboard;
import it.edu.iisgubbio.mobilita.mezzi.Terrestre;

public class MezziRimessa {

	public static void main(String[] args) {
		
		MezzoDiTrasporto moto=new MezzoDiTrasporto("moto",1000);
		System.out.println(moto);
		System.out.println(moto.importoRata(5));
		
		AMuscoli triciclo=new AMuscoli("triciclo",150,"quadricipiti");
		System.out.println(triciclo);
		System.out.println(triciclo.parteAlta());
		
		Bicicletta bicicletta=new Bicicletta(340,8);
		bicicletta.setNumeroDiRapporti(13);
		System.out.println(bicicletta);
		System.out.println(bicicletta.leggera());
		
		Skateboard skateboard= new Skateboard("skateboard",340);
		Skateboard skateboardLungo= new Skateboard("skateboard",340,90);
		System.out.println(skateboardLungo);
		System.out.println(skateboard);
		System.out.println(skateboard.longboard());
		System.out.println(skateboard.longboard());
		
		AMotore veicolo=new AMotore("elicottero",50000,210,"gasolio");
		System.out.println(veicolo);
		System.out.println(veicolo.possibileCentriAbitati());
		
		Terrestre veicolo2=new Terrestre();
		veicolo2.setNome("autocarro di Luigi");
		veicolo2.setCarburante("benzina");
		veicolo2.setVelocita(130);
		System.out.println(veicolo2);
		System.out.println(veicolo2.tempoDiPercorrenza(3090));
		
		Motocicletta moto1=new Motocicletta("MotoGuzzi",4000,345);
		System.out.println(moto1);
		moto1.setNumeroPosti(2);
		System.out.println(moto1.puoTrasportare(1));
		
		Automobile auto=new Automobile("Maserati di Mario",1,3);
		auto.setTarga("gjhw7wn21yi");
		System.out.println(auto);
	}

}
