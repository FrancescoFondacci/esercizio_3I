package it.edu.iisgubbio.disegni;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Griglia extends Application {
	
	Button bDisegna = new Button("Disegna");
	Button bPulisci = new Button("Pulisci");
	Label lDistanza = new Label("Distanza");
	TextField tfDistanza = new TextField();
	Canvas tela = new Canvas(300, 300);
	GraphicsContext gc = tela.getGraphicsContext2D();
	
	@Override
	  public void start(Stage primaryStage) {
		
		 
	    GridPane pannello = new GridPane();
	    pannello.add(tela, 0, 1,4,1);
	    pannello.add(lDistanza, 0, 0);
	    pannello.add(tfDistanza, 1, 0);
	    pannello.add(bDisegna, 2, 0);
	    pannello.add(bPulisci, 3, 0);

	    Scene scene = new Scene(pannello);
	    primaryStage.setTitle("Disegno");
	    primaryStage.setScene(scene);
	    primaryStage.show();
	   
	    bDisegna.setOnAction( e -> eseguiDisegna() );
	    bPulisci.setOnAction( e -> eseguiPulisci() );
	}
	private void eseguiDisegna() {
		double distanza;
		distanza=Double.parseDouble(tfDistanza.getText());
		gc.setStroke(Color.GREEN);
		gc.setLineWidth(3); 
		for(double x=0;x<=300;x+=distanza) {
		    gc.strokeLine(x, 0, x, 300);//linee verticali
		    gc.strokeLine(0, x, 300, x);//linee orizzontali
		}
	}
	private void eseguiPulisci() {
		gc.setFill(Color.WHITE);
		gc.fillRect(0, 0, 300, 300);
	}

	public static void main(String[] args) {
		launch(args);
	}
}
