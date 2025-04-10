package it.edu.iisgubbio.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Comuni extends Application {
	
	Label lComune=new Label("Nome comune");
	Label lProvincia=new Label("Nome provincia");
	Label lEsitoCodice=new Label("???");
	Button bCodice=new Button("Codice");
	Button bProvincia=new Button("Provincia");
	TextField tfComune=new TextField();
	TextField tfProvincia=new TextField();
	ListView<String> lista = new ListView<>(); 
	
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		
		principale.add(lComune,0,0);
		principale.add(tfComune,1,0);
		principale.add(lProvincia,0,1);
		principale.add(tfProvincia,1,1);
		principale.add(bCodice,0,2);
		principale.add(bProvincia,0,3);
		principale.add(lEsitoCodice,1,2);
		principale.add(lista,2,0,2,5);
		
		Scene scena = new Scene(principale);
		finestra.setTitle("rettangolo");
		finestra.setScene(scena);
		finestra.show();
		
		bCodice.setOnAction( e -> eseguiCodice() );
		bProvincia.setOnAction( e -> eseguiProvincia() );
	}
	private void eseguiCodice() {
		String rigaLetta;
		String codice="";
		boolean trovato=false;
		try (
			 FileReader flussoCaratteri = new FileReader("c:\\Users\\francescofondacci\\Desktop\\comuni.txt");
			 BufferedReader lettoreDiRighe = new BufferedReader(flussoCaratteri);
		){
			while( (rigaLetta = lettoreDiRighe.readLine())!=null ) {
				if(rigaLetta.substring(4,54).trim().compareToIgnoreCase(tfComune.getText())==0) {
					trovato=true;
					codice=rigaLetta.substring(0,4);
				}
			}
			if(trovato) {
				lEsitoCodice.setText(codice);
			}else {
				lEsitoCodice.setText(tfComune.getText()+" non trovato");
			}		
		} catch (FileNotFoundException e) {
			lEsitoCodice.setText(e.getLocalizedMessage());
		} catch (IOException m) {
			m.printStackTrace();
		}
	}
	private void eseguiProvincia() {
		String rigaLetta;
		lista.getItems().clear();
		try (
			 FileReader flussoCaratteri = new FileReader("c:\\Users\\francescofondacci\\Desktop\\comuni.txt");
			 BufferedReader lettoreDiRighe = new BufferedReader(flussoCaratteri);
		){
			while( (rigaLetta = lettoreDiRighe.readLine())!=null ) {
				if(rigaLetta.substring(54,56).trim().equals(tfProvincia.getText())) {
					lista.getItems().add(rigaLetta.substring(4,54).trim());
				}
			}
		} catch (FileNotFoundException e) {
			lEsitoCodice.setText(e.getLocalizedMessage());
		} catch (IOException m) {
			m.printStackTrace();
		}
	}
	public static void main(String[] args) {
	    launch(args);
	}
}