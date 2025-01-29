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

public class Pallini extends Application {
	
	Button bVai = new Button("Vai");
	Label lNumero = new Label("Numero");
	TextField tfNumero = new TextField();
	Canvas tela = new Canvas(400, 400);
	GraphicsContext gc = tela.getGraphicsContext2D();
	
	@Override
	  public void start(Stage primaryStage) {
		
		 
	    GridPane pannello = new GridPane();
	    pannello.add(tela, 0, 1,3,1);
	    pannello.add(lNumero, 0, 0);
	    pannello.add(tfNumero, 1, 0);
	    pannello.add(bVai, 2, 0);
	    
	    Scene scene = new Scene(pannello);
	    primaryStage.setTitle("Pallini");
	    primaryStage.setScene(scene);
	    primaryStage.show();
	   
	    bVai.setOnAction( e -> eseguiVai() );
	  }
	private void eseguiVai() {
		double numero,numero2;
		numero=Double.parseDouble(tfNumero.getText());
		numero2=Double.parseDouble(tfNumero.getText());
		gc.setFill(Color.BLACK);
		for(double y=0;y<numero2;y++,numero--) {
			for(double x=0;x<numero;x++) {
				gc.fillOval(x*25,y*25,23,23);
			}
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
}
