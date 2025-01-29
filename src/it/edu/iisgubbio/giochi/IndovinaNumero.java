package it.edu.iisgubbio.giochi;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class IndovinaNumero extends Application {
	
	TextField tfN = new TextField();
	Button bProva = new Button("Prova");
	Label lRisultato = new Label("??");
	int numero=(int)(Math.random()*100)+1;
	
	@Override
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		
		principale.add(tfN, 0, 0);
		principale.add(bProva, 0, 1);
		principale.add(lRisultato, 0, 2);
		
        Scene scena = new Scene(principale);
        scena.getStylesheets().add("it/edu/iisgubbio/giochi/IndovinaNumero.css");
        principale.getStyleClass().add("principale");
        
		finestra.setTitle("IndovinaNumero");
		finestra.setScene(scena);
		finestra.show();
		
		bProva.setOnAction( e -> eseguiProva() );			
	}
	
	private void eseguiProva() {
		int n;
		
		n=Integer.parseInt(tfN.getText());
		if(n==numero){
			lRisultato.setText("Hai indovinato!!");
		}else {
			if(n<numero){
				lRisultato.setText("Piu grande");
			}else{
				lRisultato.setText("Piu piccolo");
			}
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}	
}
