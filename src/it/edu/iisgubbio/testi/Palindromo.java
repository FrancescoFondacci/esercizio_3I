package it.edu.iisgubbio.testi;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Palindromo extends Application {

	TextField tfTesto= new TextField();
	Button bProva=new Button("Prova");
	Label lTesto= new Label("Lettera");
	Label lRisultato= new Label("???");

	@Override
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();

		principale.add(lTesto, 0, 0);
		principale.add(bProva, 0, 1,2,1);
		principale.add(tfTesto, 1, 0);
		principale.add(lRisultato, 0, 2,2,1);
		bProva.setMaxWidth(Integer.MAX_VALUE);

		Scene scena = new Scene(principale);	  	        
		finestra.setTitle("Impiccato");
		finestra.setScene(scena);
		finestra.show();

		bProva.setOnAction( e -> eseguiProva() );		
	}
	private void eseguiProva() {
		char lettere[];		
		String lettera=tfTesto.getText();
		lettere=lettera.toCharArray();
		char contrario[]=new char[lettere.length];
		for(int pos=0,i=lettere.length-1;pos<lettere.length;pos++) {
			contrario[pos]=lettere[i];
			i--;
		}
		String testo = new String(lettere);
		//System.out.println(testo);
		String opposto = new String(contrario);
		//System.out.println(opposto);
		if(testo.equals(opposto)) {
			lRisultato.setText("è un palindromo");
		}else {
			lRisultato.setText("non è un palindromo");
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
}
