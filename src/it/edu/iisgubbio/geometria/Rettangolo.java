package it.edu.iisgubbio.geometria;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Rettangolo extends Application {

	Label lBase = new Label("base");
	Label lAltezza = new Label("altezza");
	Label lRisultato = new Label("??");
	TextField tfBase = new TextField();
	TextField tfAltezza = new TextField();
	Button bArea = new Button("Area");
	Button bPerimetro = new Button("Perimetro");
	
	@Override
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		principale.add(lBase, 0,0);
		principale.add(lAltezza, 0,1);
		principale.add(lRisultato, 1,3);
		principale.add(tfBase, 1,0);
		principale.add(tfAltezza, 1,1);
		principale.add(bArea, 1,2);
		principale.add(bPerimetro, 0, 2);
		
		Scene scena = new Scene(principale);
		finestra.setTitle("rettangolo");
		finestra.setScene(scena);
		finestra.show();
		
		bArea.setOnAction( e -> eseguiArea() );
		bPerimetro.setOnAction( e -> eseguiPerimetro() );
		
	}
	
	private void eseguiArea() {
		String base,altezza,testo;
		int vBase,vAltezza,area;
		
		base = tfBase.getText();
		altezza = tfAltezza.getText();
		vBase = Integer.parseInt(base);
		vAltezza = Integer.parseInt(altezza);
		area = vBase * vAltezza;
		testo = "" + area;
		lRisultato.setText(testo);	
	}
	
	private void eseguiPerimetro() {
		String pBase,pAltezza,pTesto;
		int nBase,nAltezza,perimetro;
		
		pBase = tfBase.getText();
		pAltezza = tfAltezza.getText();
		nBase = Integer.parseInt(pBase);
		nAltezza = Integer.parseInt(pAltezza);
		perimetro = (nBase*2) + (nAltezza*2);
		pTesto = "" + perimetro;
		lRisultato.setText(pTesto);
	}
	
	public static void main(String[] args) {
	    launch(args);
	}
}
