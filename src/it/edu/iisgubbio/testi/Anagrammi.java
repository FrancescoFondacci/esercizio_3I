package it.edu.iisgubbio.testi;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Anagrammi extends Application {
	
	Button bAnagramma=new Button("Anagramma");
	TextField tfParola1= new TextField();
	TextField tfParola2= new TextField();
	Label lParola1= new Label("Parola 1");
	Label lParola2= new Label("Parola 2");
	Label lRisultato= new Label("??");
	

	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		
		principale.add(lParola1, 0, 0);
		principale.add(lParola2, 0, 1);
		principale.add(tfParola1, 1, 0);
		principale.add(tfParola2, 1, 1);
		principale.add(bAnagramma, 0, 2);
		principale.add(lRisultato, 1, 2);
		
		Scene scena = new Scene(principale);		
		finestra.setTitle("Spazi");
		finestra.setScene(scena);
		finestra.show();
		
		bAnagramma.setOnAction( e -> eseguiAnagramma() );
	
	}
	private void eseguiAnagramma() {		
		char parola1[]=tfParola1.getText().toCharArray();
		char parola2[]=tfParola2.getText().toCharArray();
		int c=0;
		for(int pos=0;pos<parola1.length;pos++) {
			boolean presente=false;
			for(int i=0; i<parola2.length && presente==false;i++) {
				if(parola1[pos]==parola2[i] ) {
					parola2[i]='#';
					presente=true;
					c++;
				}
			}			
		}
		if(c==parola1.length) {
			lRisultato.setText(" è un anagramma");
		}else {
			lRisultato.setText("non è un anagramma");
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
}
