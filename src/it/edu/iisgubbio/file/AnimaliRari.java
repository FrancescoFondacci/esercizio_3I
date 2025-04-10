package it.edu.iisgubbio.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AnimaliRari extends Application {
	
	Label lEsito=new Label("???");
	Label lNome=new Label("Nome");
	Button bLeggi=new Button("Cerca");
	TextField tfNome=new TextField("Inserisci nome Animale");
	
	
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		
		principale.add(lNome,0,0);
		principale.add(tfNome,1,0);
		principale.add(bLeggi,0,1);
		principale.add(lEsito,0,2);
		
		Scene scena = new Scene(principale);
		finestra.setTitle("rettangolo");
		finestra.setScene(scena);
		finestra.show();
		
		bLeggi.setOnAction( e -> eseguiLettura() );
	}
	private void eseguiLettura() {
		String rigaLetta;
		boolean trovato=false;
		try (
			 FileReader flussoCaratteri = new FileReader("c:\\Users\\francescofondacci\\Desktop\\animaliRari.txt");
			 BufferedReader lettoreDiRighe = new BufferedReader(flussoCaratteri);
		){
			while( (rigaLetta = lettoreDiRighe.readLine())!=null ) {
				if(rigaLetta.equals(tfNome.getText())) {
					trovato=true;
				}
			}
			if(trovato) {
				lEsito.setText(""+tfNome.getText()+" trovato");
			}else {
				lEsito.setText(tfNome.getText()+" non trovato");
			}		
		} catch (FileNotFoundException e) {
			lEsito.setText(e.getLocalizedMessage());
			//e.printStackTrace();
		} catch (IOException m) {
			m.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
	    launch(args);
	}
}