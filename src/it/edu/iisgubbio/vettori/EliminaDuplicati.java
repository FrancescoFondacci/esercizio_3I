package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class EliminaDuplicati extends Application {
	
	TextField tfNumeri= new TextField();
	Button bDuplicati=new Button("Conta duplicati");
	Button bElimina=new Button("Elimina duplicati");
	Label lRisposta = new Label("Risposta:");
	Label lNumeri = new Label("Numeri");
	Label lRisultato= new Label("???");
	
	
	@Override
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		
		principale.add(tfNumeri, 1,0);
		principale.add(lNumeri, 0,0);
		principale.add(bElimina, 1, 1);
		principale.add(bDuplicati, 1, 2);
		principale.add(lRisultato, 1, 3);
		principale.add(lRisposta, 0, 3);
		bElimina.setMaxWidth(Integer.MAX_VALUE);
		bDuplicati.setMaxWidth(Integer.MAX_VALUE);
		
		Scene scena = new Scene(principale);	  	        
	    finestra.setTitle("IndovinaNumero");
	    finestra.setScene(scena);
		finestra.show();
			
		bElimina.setOnAction( e -> eseguiElimina() );	
		bDuplicati.setOnAction( e -> eseguiDuplicati() );
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
	private void eseguiElimina() {
		int numeri[],c=0,q=0;
		boolean presente=false;
		numeri=testoNumeri(tfNumeri.getText());
		int senzaDuplicati[]= new int[numeri.length];
		senzaDuplicati[0]=numeri[0];
		for(int pos=0;pos<numeri.length;pos++) {			
			c=numeri[pos];
			presente=false;
			for(int x=0;x<q;x++) {
				if(c==senzaDuplicati[x]) {
					presente=true;
				}
			}
			if(presente==false) {
				senzaDuplicati[q]=c;
				q+=1;
			}
		}
		int nuovo[]=new int[q];
		for(int pos=0;pos<q;pos++) {
			nuovo[pos]=senzaDuplicati[pos];
		}
		String se="";
		for(int pos=0;pos<nuovo.length;pos++) {
			se+=","+(nuovo[pos]);
		}
		lRisultato.setText(se);
	}

	private void eseguiDuplicati() {
		int numeri[],c=0;
		numeri=testoNumeri(tfNumeri.getText());
		for(int pos=0;pos<numeri.length-1;pos++) {
			for(int i=pos+1;i<numeri.length;i++) {
				if(numeri[i]==numeri[pos]) {
					c++;
				}
			}
		}
		lRisultato.setText(""+c);
	}
	public static void main(String[] args) {
		launch(args);
	}
}
