package it.edu.iisgubbio.testi;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class InizialiMaiuscole extends Application {
	
	TextField tfFrase= new TextField();
	Button bMaiuscole=new Button("Maiuscole");
	
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		
		principale.add(tfFrase, 0, 0);
		principale.add(bMaiuscole, 0, 1);
		
		Scene scena = new Scene(principale);
		finestra.setTitle("Spazi");
		finestra.setScene(scena);
		finestra.show();
		
		bMaiuscole.setOnAction( e -> eseguiMaiuscole() );
	}
	private void eseguiMaiuscole() {
		char frase[]=tfFrase.getText().toCharArray();
		frase[0]= (char)(frase[0]-32);
		for(int pos=0;pos<frase.length;pos++) {
			if (frase[pos]=='.'&& frase[pos+1]==' ') {
				frase[pos+2]=(char)(frase[pos+2]-32);
			}
		}
		String testo = new String(frase);
		tfFrase.setText(testo);
	}
	public static void main(String[] args) {
		launch(args);
	}
}
