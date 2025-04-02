package it.edu.iisgubbio.file;

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

public class Demo extends Application {
	
	Label lEsito=new Label("???");
	Label lNome=new Label("Nome");
	Button bLeggi=new Button("Leggi");
	TextField tfNome=new TextField("Inserisci nome file");
	
	
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
		FileReader flussoCaratteri = null;
		String nomeFile=tfNome.getText();
		try {
			flussoCaratteri = new FileReader("c:\\Users\\francescofondacci\\Desktop\\"+nomeFile);
			char caratteri[] = new char[1000];
			int caratteriLetti = flussoCaratteri.read(caratteri);
			String testo = new String(caratteri,0,caratteriLetti);
			lEsito.setText(testo);
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
