package it.edu.iisgubbio.animazioni;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Bounds;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Animazione extends Application {
	public static void main(String[] args) {
        launch(args);
    }
	
	static final int DIMENSIONE_X=400;
	static final int DIMENSIONE_Y=400;
	Line linea = new Line(200,200,200,200);
	
	 @Override
		public void start(Stage primaryStage) throws Exception {
		        Pane areaDiGioco = new Pane();
		        areaDiGioco.setPrefSize(DIMENSIONE_X, DIMENSIONE_Y);
		        areaDiGioco.getChildren().add(linea);
		        linea.setFill( Color.BLACK );
		        
		        Scene scena = new Scene(areaDiGioco);
		        primaryStage.setScene(scena);
		        primaryStage.setTitle("Rimbalzo");
		        primaryStage.show();
		        
		        Timeline timeline = new Timeline(new KeyFrame(
						Duration.seconds(0.02),
						x -> aggiornaTimer()));
				timeline.setCycleCount(-1);
				timeline.play();
				
				
	 }
	 double orizzontale=5;
	 double verticale=3;
	 private void aggiornaTimer(){
		 linea.setStartX(orizzontale+=1);
		 linea.setStartY(verticale+=2);
		 linea.setEndX(orizzontale+=1);
		 linea.setEndY(verticale+=2);	
		 //if(linea.getEndX())
	 }
}
