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

public class Pizza extends Application {
	
	Label lEsito=new Label("???");
	Label lNome=new Label("Nome");
	Button bPrezzo=new Button("Prezzo");
	TextField tfNome=new TextField();
	
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		
		principale.add(lNome,0,0);
		principale.add(tfNome,1,0);
		principale.add(bPrezzo,0,1);
		principale.add(lEsito,1,1);
		
		Scene scena = new Scene(principale);
		finestra.setTitle("rettangolo");
		finestra.setScene(scena);
		finestra.show();
		
		bPrezzo.setOnAction( e -> eseguiCalcolo() );
	}
	private void eseguiCalcolo() {
		String rigaLetta;
		String prezzo="";
		boolean trovato=false;
		try (
			 FileReader flussoCaratteri = new FileReader("c:\\Users\\francescofondacci\\Desktop\\pizze.txt");
			 BufferedReader lettoreDiRighe = new BufferedReader(flussoCaratteri);
		){
			while( (rigaLetta = lettoreDiRighe.readLine())!=null ) {
				if(rigaLetta.substring(2).trim().equals(tfNome.getText())) {
					trovato=true;
					prezzo=rigaLetta.substring(0,2);
				}
			}
			if(trovato) {
				lEsito.setText(prezzo+"€");
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