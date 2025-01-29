package it.edu.iisgubbio.matematica;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class EquazioniSecondoGrado extends Application {
	
	Label lA = new Label("a");
	Label lB = new Label("b");
	Label lC = new Label("c");
	TextField tfA = new TextField();
	TextField tfB = new TextField();
	TextField tfC = new TextField();
	Button bRisolvi = new Button("Risolvi");
	Label lx1 = new Label("x1");
	Label lx2 = new Label("x2");
	Label lrx1 = new Label("??");
	Label lrx2 = new Label("??");
	
	@Override
	public void start(Stage finestra) throws Exception {
			GridPane principale = new GridPane();
			
			principale.add(lA, 0, 0);
			principale.add(lB, 0, 1);
			principale.add(lC, 0, 2);
			principale.add(lx1, 0, 3);
			principale.add(lx2, 2, 3);
			principale.add(lrx1, 1, 3);
			principale.add(lrx2, 3, 3);
			principale.add(bRisolvi, 2, 0,2,3);
			principale.add(tfA, 1, 0);
			principale.add(tfB, 1, 1);
			principale.add(tfC, 1, 2);
			bRisolvi.setMaxHeight(Integer.MAX_VALUE);
									
			Scene scena = new Scene(principale);
			
			scena.getStylesheets().add("it/edu/iisgubbio/matematica/EquazioniSecondoGrado.css");
			lx1.getStyleClass().add("risultato");
			lx2.getStyleClass().add("risultato");
			lrx1.getStyleClass().add("risultato");
			lrx2.getStyleClass().add("risultato");
			lrx1.getStyleClass().add("risultato1");
			lrx2.getStyleClass().add("risultato1");
			principale.getStyleClass().add("principale");
			
			finestra.setTitle("EquazioniSecondoGrado");
			finestra.setScene(scena);
			finestra.show();
			
			bRisolvi.setOnAction( e -> eseguiRisolvi() );
	}
	
	private void eseguiRisolvi() {
		double a,b,c,x1,x2,d;
		
		a=Double.parseDouble(tfA.getText());
		b=Double.parseDouble(tfB.getText());
		c=Double.parseDouble(tfC.getText());
		d=b*b-4*a*c;
		if(d>=0) {
			x1=((-b)+Math.sqrt(d))/(2*a);
			x2=((-b)-Math.sqrt(d))/(2*a);
			lrx1.setText(""+x1);
			lrx2.setText(""+x2);
		}else{
			lrx1.setText("Impossibile");
			lrx2.setText("Impossibile");
		}
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}	

}
