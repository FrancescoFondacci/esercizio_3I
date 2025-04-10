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

public class Somma extends Application {
	
	Label lEsito=new Label("???");
	Button bLeggi=new Button("Somma");
	
	
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		
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
		int somma=0;
		try {
			FileReader flussoCaratteri = new FileReader("c:\\Users\\francescofondacci\\Desktop\\prova.txt");
			BufferedReader lettoreDiRighe = new BufferedReader(flussoCaratteri);
			do {
			    rigaLetta = lettoreDiRighe.readLine();
			    if(rigaLetta!=null) {   
			        somma+=Integer.parseInt(rigaLetta);
			    }
			}while(rigaLetta!=null);
			lEsito.setText(""+somma);
			lettoreDiRighe.close();
			flussoCaratteri.close();
		} catch (FileNotFoundException e) {
			lEsito.setText(e.getLocalizedMessage());
			//e.printStackTrace();
		} catch (IOException m) {
			// TODO Auto-generated catch block
			m.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
	    launch(args);
	}
}

