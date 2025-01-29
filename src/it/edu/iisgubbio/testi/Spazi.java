package it.edu.iisgubbio.testi;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Spazi extends Application{
	Label lFrase= new Label("frase");
	TextField tfFrase= new TextField();
	Button bCompatta=new Button("compatta");
	TextField tfRisposta= new TextField();
	TextField tfLunghezza= new TextField();
	Button bEspandi=new Button("espandi");
	TextField tfEspanso= new TextField();
	
	
	
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		
		principale.add(lFrase,0,0);
		principale.add(tfFrase,2,0);
		principale.add(bCompatta,0,1,2,1);
		principale.add(tfRisposta,2,1);
		principale.add(tfLunghezza,0,2);
		principale.add(bEspandi,1,2);
		principale.add(tfEspanso,2,2);
		bCompatta.setMaxWidth(Integer.MAX_VALUE);
		principale.setVgap(10);
		principale.setHgap(10);
		Insets spazio=new Insets(10);
		principale.setPadding(spazio);
		tfFrase.getStyleClass().add("input");
		tfRisposta.getStyleClass().add("input");
		tfEspanso.getStyleClass().add("input");
		
		Scene scena = new Scene(principale);
		scena.getStylesheets().add("it/edu/iisgubbio/testi/Spazi.css");
		lFrase.getStyleClass().add("lFrase");
		finestra.setTitle("Spazi");
		finestra.setScene(scena);
		finestra.show();
		
		bCompatta.setOnAction( e -> eseguiCompatta() );
		bEspandi.setOnAction( e -> eseguiEspandi() );
	}
	
	private void eseguiCompatta() {
		int numeroSpazi=0;
		char frase[];
		frase=tfFrase.getText().toCharArray();
		for(int i=0;i<frase.length;i++) {
			if(frase[i]==' ') {
				numeroSpazi++;
			}
		}
		char finale[]=new char[frase.length-numeroSpazi];
		int indiceFinale=0;
		for(int indiceFrase=0;indiceFrase<frase.length;indiceFrase++) {
			if(frase[indiceFrase]!=' ') {
				finale[indiceFinale]=frase[indiceFrase];
				indiceFinale++;
			}
		}
		String f=new String(finale);
		tfRisposta.setText(f);
	}
	
	private void eseguiEspandi() {
		char frase[]=tfFrase.getText().toCharArray();
		int lunghezza=Integer.parseInt(tfLunghezza.getText());
		char espanso[]=new char[lunghezza];
		int spaziDaAggiungereTotale=lunghezza-frase.length;
		System.out.println(spaziDaAggiungereTotale);
		int numeroSpazi=0;
		
		for(int i=0;i<frase.length;i++) {
			if(frase[i]==' ') {
				numeroSpazi++;
			}
		}
		int spazidaAggiungere= spaziDaAggiungereTotale/ numeroSpazi;
		int spaziAvanzati=spaziDaAggiungereTotale % numeroSpazi;
		
		int indiceEspanso=0;
		
		for(int indiceFrase=0;indiceFrase<frase.length;indiceFrase++) {
			espanso[indiceEspanso]=frase[indiceFrase];
			
			indiceEspanso++;
			
			if(frase[indiceFrase]==' ') {
				
				for(int i=0;i<spazidaAggiungere;i++) {
					espanso[indiceEspanso]='#';
					indiceEspanso++;
				}
				if(spaziAvanzati > 0) {
					espanso[indiceEspanso]='#';
					indiceEspanso++;
					spaziAvanzati--;
				}
			}
		}

		String allungato= new String(espanso);
		tfEspanso.setText(allungato);
	}
	public static void main(String[] args) {
		launch(args);
	}
}