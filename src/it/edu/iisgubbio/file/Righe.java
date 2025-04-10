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

public class Righe extends Application{
	
	Label lEsito=new Label("???");
	Label lRiga=new Label("riga");
	Button bLeggi=new Button("Leggi");
	TextField tfRiga=new TextField("Inserisci riga da leggere");
	
	
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		
		principale.add(lRiga,0,0);
		principale.add(tfRiga,1,0);
		principale.add(bLeggi,0,1);
		principale.add(lEsito,0,2);
		
		Scene scena = new Scene(principale);
		finestra.setTitle("rettangolo");
		finestra.setScene(scena);
		finestra.show();
		
		bLeggi.setOnAction( e -> eseguiLettura() );
	}
	private void eseguiLettura() {
		int rigaFile=Integer.parseInt(tfRiga.getText());
		String testo=" ";
		try {
			FileReader flussoCaratteri = new FileReader("c:\\Users\\francescofondacci\\Desktop\\prova.txt");
			BufferedReader lettoreDiRighe = new BufferedReader(flussoCaratteri);
			for(int riga=0;riga<rigaFile;riga++) {
				 testo = lettoreDiRighe.readLine();
			}
		
			lEsito.setText(testo+"\n");
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


