package it.edu.iisgubbio.testi;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Impiccato extends Application {

	TextField tfTesto= new TextField();
	Button bVia=new Button("Via");
	Button bProva=new Button("Prova");
	Label lLettera= new Label("Lettera");
	Label lvittoria= new Label("???");
	Label lErrori= new Label("6");
	Label lTentativi= new Label("Tentativi : ");
	TextField tfLettera= new TextField();
	char[] lettere;
	char[] soluzione;
	char parola[];
	int t=6;

	@Override
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();

		principale.add(tfTesto, 0,0,2,1);
		principale.add(bVia, 2,0 );
		principale.add(bProva, 2, 1);
		principale.add(lLettera, 0, 1);
		principale.add(lvittoria, 0, 2);
		principale.add(lErrori, 1, 3);
		principale.add(lTentativi, 0, 3);
		principale.add(tfLettera, 1, 1);

		Scene scena = new Scene(principale);	  	        
		finestra.setTitle("Impiccato");
		finestra.setScene(scena);
		finestra.show();

		bVia.setOnAction( e -> eseguiVia() );	
		bProva.setOnAction( e -> eseguiProva() );	
	}
	private void eseguiVia() {
		String lettera=tfTesto.getText();
		lettere=lettera.toCharArray();
		parola=lettera.toCharArray();
		for(int pos=1;pos<lettere.length-1;pos++) {
			lettere[pos]='-';
		}
		String testo = new String(lettere);
		tfTesto.setText(""+testo);
	}
	private void eseguiProva() {	    
		int c=0;
		boolean presente=false;
		String lettera=tfLettera.getText();
		soluzione=lettera.toCharArray();			
		for(int pos=1;pos<lettere.length-1;pos++) {
			if(parola[pos]==soluzione[0]) {
				lettere[pos]=soluzione[0];
				presente=true;
			}			
		}
		if(presente==false) {
			t--;
		}
		for(int pos=1;pos<lettere.length-1;pos++) {
			if(lettere[pos]!='-') {
				c++;
			}
		}
		if(c==lettere.length-2) {
			lvittoria.setText("hai vinto");
		}		
		
		lErrori.setText(""+t);
		if(t==0) {
			lErrori.setText("Hai perso");
		}
		String testo = new String(lettere);
		tfTesto.setText(""+testo);
	}
	public static void main(String[] args) {
		launch(args);
	}
}
