package it.edu.iisgubbio.matematica;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MinimoComuneMultiplo extends Application {
	
	Label lN1 = new Label("n1");
	Label lN2 = new Label("n2");
	Button bMcm = new Button("MCM");
	Label lRisultato = new Label("???");
	TextField tfN1 = new TextField();
	TextField tfN2 = new TextField();
	

	@Override
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		
		principale.add(lN1, 0, 0);
		principale.add(lN2, 0, 1 );
		principale.add(tfN1, 1, 0);
		principale.add(tfN2, 1, 1);
		principale.add(bMcm, 0, 2);
		principale.add(lRisultato, 1, 2);
		
		Scene scena = new Scene(principale);
		finestra.setTitle("IndovinaNumero");
		finestra.setScene(scena);
		finestra.show();
			
		bMcm.setOnAction( e -> eseguiMcm() );
	}
	private void eseguiMcm() {
		int n1, n2, mcm;
		String sMcm;
		n1=Integer.parseInt(tfN1.getText());
		n2=Integer.parseInt(tfN2.getText());
		sMcm="";
		for(int x=n1*n2;x>0;x--) {
			mcm=n1*x;
			if(mcm%n2==0) {
				sMcm=""+mcm;
			}
			
		}
		lRisultato.setText(sMcm);
	}
	public static void main(String[] args) {
		launch(args);
	}
}
