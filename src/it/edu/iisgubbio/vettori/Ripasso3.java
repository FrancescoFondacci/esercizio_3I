package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ripasso3 extends Application{
	
	TextField tfNumeri=new TextField();
	Label lElenco=new Label("Elenco");
	TextField tfPosizione=new TextField();
	Label lPosizione=new Label("Elimina posizione");
	Label lRisultato=new Label("??");
	Label lSRisultato=new Label("Risultato");
	Button bScambia=new Button("Scambia");
	

	@Override
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		
		principale.add(tfNumeri,1,0);
		principale.add(lElenco,0,0);
		principale.add(tfPosizione,1,1);
		principale.add(lPosizione,0,1);
		principale.add(bScambia,1,3);
		principale.add(lSRisultato,0,2);
		principale.add(lRisultato,1,2);
		bScambia.setMaxWidth(Integer.MAX_VALUE);
		
		Scene scena = new Scene(principale);	  	        
	    finestra.setTitle("IndovinaNumero");
	    finestra.setScene(scena);
		finestra.show();	
		
		bScambia.setOnAction( e -> eseguiScambia() );	
	}
	int[] testoNumeri (String testo) {
		String parti[];
		int vettoreNumeri[];
		parti= testo.split(" ");
		vettoreNumeri= new int[parti.length];
		for(int i=0;i<parti.length;i++) {
			vettoreNumeri[i]= Integer.parseInt(parti[i]);		
		}
		return vettoreNumeri;
	}
	private void eseguiScambia() {
		int numeri[],posizione,q=0;
		boolean presente=false;
		posizione=Integer.parseInt(tfPosizione.getText());
		numeri=testoNumeri(tfNumeri.getText());
		int senzaPosizione[]=new int[numeri.length];
		for(int pos=0;pos<numeri.length;pos++) {
			presente=false;
			for(int x=0;x<q;x++) {
				if(pos==posizione) {
					presente=true;
				}
			}
			if(presente==false) {
				senzaPosizione[q]=numeri[pos];
				q++;
			}
		}
		int finale[]=new int[q];
		for(int pos=0;pos<q;pos++) {
			finale[pos]=senzaPosizione[pos];
		}
		String se="";
		for(int pos=0;pos<finale.length;pos++) {
			if (pos==0) {
				se+=""+finale[pos];			
			}else {
				se+=";"+finale[pos];
			}
		}
		lRisultato.setText(se);
	}
	public static void main(String[] args) {
		launch(args);
	}	
}
