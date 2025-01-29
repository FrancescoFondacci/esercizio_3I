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

public class Quadrati extends Application  {
	
	Button bDisegna = new Button("Disegna");		
	Canvas tela = new Canvas(400, 400);
	GraphicsContext gc = tela.getGraphicsContext2D();
	
	@Override
	  public void start(Stage primaryStage) {
		
		 
	    GridPane pannello = new GridPane();
	    pannello.add(tela, 0, 0,3,1);	    	 
	    pannello.add(bDisegna, 0, 1);

	    Scene scene = new Scene(pannello);
	    primaryStage.setTitle("Scacchiera");
	    primaryStage.setScene(scene);
	    primaryStage.show();
	   
	    bDisegna.setOnAction( e -> eseguiDisegna() );
	}
	private void eseguiDisegna() {
		double dimensione;
		dimensione=20;
		for(double y=0;y<=400;y+=dimensione+1) {			
			for(double x=0;x<=400;x+=dimensione+1) {
				double z=Math.random();
				if(z<0.2) {
					gc.setFill(Color.BLUE);
					
				}else {
					if(z<0.5) {
						gc.setFill(Color.PINK);						
					}else {
						gc.setFill(Color.YELLOW);					
					}
				}
				gc.fillRect(x,y, dimensione,dimensione);
			
			}
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
}

