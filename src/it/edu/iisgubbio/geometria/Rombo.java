package it.edu.iisgubbio.geometria;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Rombo extends Application {

	Label lDMag = new Label("Diag. MAggiore");
	Label lDMin = new Label("Diag Minore");
	TextField tfDMag = new TextField();
	TextField tfDMin = new TextField();
	Button bArea = new Button("Area");
	Button bPerimetro = new Button("Perimetro");
	Label lArea = new Label();
	Label lPerimetro = new Label();
	
	@Override
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		principale.add(lDMag, 0,0);
		principale.add(lDMin, 0,1);
		principale.add(tfDMag, 1,0);
		principale.add(tfDMin, 1,1);
		principale.add(bArea, 0,2);
		principale.add(bPerimetro, 0,3);
		principale.add(lArea, 1,2);
		principale.add(lPerimetro, 1,3);
		
		Scene scena = new Scene(principale);
		finestra.setTitle("Rombo");
		finestra.setScene(scena);
		finestra.show();
		
		bArea.setOnAction( e -> eseguiArea() );
		bPerimetro.setOnAction( e -> eseguiPerimetro() );
	}
	private void eseguiArea() {
		double area;
		int vdMag,vdMin;
		String dMag,dMin,testo;
		
		dMag=tfDMag.getText();
		dMin=tfDMin.getText();
		vdMag = Integer.parseInt(dMag);
		vdMin= Integer.parseInt(dMin);
		area=(vdMag*vdMin)/2;
		testo=""+area;
		lArea.setText(testo);
	}
	private void eseguiPerimetro() {
		double perimetro;
		int vdMag,vdMin;
		String dMag,dMin,testo;
		
		dMag=tfDMag.getText();
		dMin=tfDMin.getText();
		vdMag = Integer.parseInt(dMag);
		vdMin= Integer.parseInt(dMin);
		perimetro= Math.sqrt((vdMag/2)*(vdMag/2) + (vdMin/2)*(vdMin/2))*4;
		testo=""+perimetro;
		lPerimetro.setText(testo);
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	    
}
