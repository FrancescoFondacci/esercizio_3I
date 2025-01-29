package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SopraMedia extends Application {
	
	TextField tfNumeri=new TextField();
	Label lRisultato= new Label("???");
	Button bCalcola= new Button("Sopra la Media");
	
	@Override
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		
		principale.add(tfNumeri, 0, 0,3,1);
		principale.add(bCalcola, 0, 1,3,1);
		principale.add(lRisultato, 0, 2,3,1);
		bCalcola.setMaxWidth(Integer.MAX_VALUE);
		principale.setVgap(10);
		principale.setHgap(10);
		
		Scene scena = new Scene(principale);
		//scena.getStylesheets().add("it/edu/iisgubbio/vettori/Cerca.css");
		//principale.getStyleClass().add("principale");
	    finestra.setTitle("cerca");
	    finestra.setScene(scena);
		finestra.show();
			
		bCalcola.setOnAction( e -> eseguiCalcola() );	
	}
	int[] testoNumeri (String testo) {
		String parti[];
		int vettoreNumeri[];
		parti= testo.split(" ");
		vettoreNumeri= new int[parti.length];
		for(int i=0;i<parti.length;i++) {
			vettoreNumeri[i]= Integer.parseInt(parti[i]);		
		}
		return vettoreNumeri;
	}

	private void eseguiCalcola() {
		int numeri[];
		double somma=0,media;
		numeri=testoNumeri(tfNumeri.getText());
		for(int pos=0;pos<numeri.length;pos++) {
			somma+=numeri[pos];
		}
		media=somma/numeri.length;
		//System.out.println(media);
		String se="";
		for(int pos=0;pos<numeri.length;pos++) {
			if(numeri[pos]>media) {
				se+=","+(numeri[pos]);
			}
		}
		lRisultato.setText(se);
	}
	public static void main(String[] args) {
		launch(args);
	}
}
