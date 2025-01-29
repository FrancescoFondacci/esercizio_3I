package it.edu.iisgubbio.verifica;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Fondacci extends Application {
	
	TextField tfNumeri=new TextField();
	TextField tfPosizione=new TextField();
	Button bScambia=new Button("Scambia");
	Button bElimina=new Button("elimina");
	Label lRisultato=new Label("??");
	Button bVisualizza=new Button("Visualizza");
	
	@Override
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		
		principale.add(tfNumeri,0,0);
		principale.add(tfPosizione,0,1);
		principale.add(bScambia,0,2);
		principale.add(bElimina,1,2);
		principale.add(bVisualizza,0,3,2,1);
		principale.add(lRisultato,0,4);
		bVisualizza.setMaxWidth(Integer.MAX_VALUE);
		
		Scene scena = new Scene(principale);	  	        
	    finestra.setTitle("IndovinaNumero");
	    finestra.setScene(scena);
		finestra.show();	
		
		bScambia.setOnAction( e -> eseguiScambia() );
		bElimina.setOnAction( e -> eseguiElimina() );
		//bVisualizza.setOnAction( e -> eseguiVisualizza() );
	
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
		int numeri[],massimo,minimo,pMassimo=0,pMinimo=0;
		numeri=testoNumeri(tfNumeri.getText());
		massimo=numeri[0];
		for(int pos=1;pos<numeri.length;pos++) {
			if(numeri[pos]>massimo) {
				massimo=numeri[pos];
				pMassimo=pos;
			}
		}
		minimo=numeri[0];
		for(int pos=1;pos<numeri.length;pos++) {
			if(numeri[pos]<minimo) {
				minimo=numeri[pos];
				pMinimo=pos;
			}
		}
		numeri[pMinimo]=massimo;
		numeri[pMassimo]=minimo;
		String se="";
		for(int pos=0;pos<numeri.length;pos++) {
			se+=","+(numeri[pos]);
		}
		lRisultato.setText(se);
	}
	
	private void eseguiElimina() {
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
			se+=","+(finale[pos]);
		}
		lRisultato.setText(se);
	}
	/*private void eseguiVisualizza() {
		String se;
		se="";
		for(int pos=0;pos<numeri.length;pos++) {
			se+=","+(finale[pos]);
		}
		lRisultato.setText(se);
	}*/
	public static void main(String[] args) {
		launch(args);
	}
}
