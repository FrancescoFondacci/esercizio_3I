package it.edu.iisgubbio.geometria;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TriangoloRettangolo extends Application {

	Label lCateto1 = new Label("Cateto 1");
	Label lCateto2 = new Label("Cateto 2");
	Label lIpotenusa = new Label("Ipotenusa");
	TextField tfCateto1 = new TextField();
	TextField tfCateto2 = new TextField();
	TextField tfIpotenusa= new TextField();
	Button bCateto1 = new Button("Calcola cateto 1");
	Button bCateto2 = new Button("Calcola cateto 2");
	Button bIpotenusa = new Button("Calcola ipotenusa");
	
	@Override
	public void start(Stage finestra) throws Exception {
			GridPane principale = new GridPane();
			
			principale.add(lCateto1, 0, 0);
			principale.add(lCateto2, 0, 1);
			principale.add(lIpotenusa, 0, 2);
			principale.add(tfCateto1, 1, 0);
			principale.add(tfCateto2, 1, 1);
			principale.add(tfIpotenusa, 1, 2);
			principale.add(bCateto1, 2, 0);
			principale.add(bCateto2, 2, 1);
			principale.add(bIpotenusa, 2, 2);
			
			Scene scena = new Scene(principale);
			finestra.setTitle("TriangoloRettangolo");
			finestra.setScene(scena);
			finestra.show();
			
			bCateto1.setOnAction( e -> eseguiCateto1() );
			bCateto2.setOnAction( e -> eseguiCateto2() );
			bIpotenusa.setOnAction( e -> eseguiIpotenusa() );
	}
	private void eseguiCateto1() {
		double vCateto2,vIpotenusa,vCateto1;
		String Cateto2,Ipotenusa,Cateto1;
		
		Cateto2=tfCateto2.getText();
		Ipotenusa=tfIpotenusa.getText();
		vIpotenusa=Double.parseDouble(Ipotenusa);
		vCateto2=Double.parseDouble(Cateto2);
		vCateto1=Math.sqrt(vIpotenusa*vIpotenusa-vCateto2*vCateto2);
		Cateto1=""+vCateto1;
		tfCateto1.setText(Cateto1);
	}	
	private void eseguiCateto2() {
		double vCateto2,vIpotenusa,vCateto1;
		String Cateto2,Ipotenusa,Cateto1;
			
		Cateto1=tfCateto1.getText();
		Ipotenusa=tfIpotenusa.getText();
		vIpotenusa=Double.parseDouble(Ipotenusa);
		vCateto1=Double.parseDouble(Cateto1);
		vCateto2=Math.sqrt(vIpotenusa*vIpotenusa-vCateto1*vCateto1);
		Cateto2=""+vCateto2;
		tfCateto2.setText(Cateto2);
	}
	private void eseguiIpotenusa() {
		double vCateto2,vIpotenusa,vCateto1;
		String Cateto2,Ipotenusa,Cateto1;
			
		Cateto1=tfCateto1.getText();
		Cateto2=tfCateto2.getText();
		vCateto2=Double.parseDouble(Cateto2);
		vCateto1=Double.parseDouble(Cateto1);
		vIpotenusa=Math.sqrt(vCateto2*vCateto2+vCateto1*vCateto1);
		Ipotenusa=""+vIpotenusa;
		tfIpotenusa.setText(Ipotenusa);
	}
	public static void main(String[] args) {
		launch(args);
	}
}
