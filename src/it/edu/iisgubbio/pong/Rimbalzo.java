package it.edu.iisgubbio.pong;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Rimbalzo extends Application {
	
	static final int DIMENSIONE_X=400;
	static final int DIMENSIONE_Y=400;
	Circle cerchio = new Circle(10);
	 @Override
		public void start(Stage primaryStage) throws Exception {
		        Pane areaDiGioco = new Pane();
		        areaDiGioco.setPrefSize(DIMENSIONE_X, DIMENSIONE_Y);
		        
		        cerchio.setCenterX(20);
		        cerchio.setCenterY(20);
		        cerchio.setFill( Color.GREEN );
		        areaDiGioco.getChildren().add(cerchio);
		        
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
	 double direzione=5;
	 double verticale=3;
	 private void aggiornaTimer(){
		double z=Math.random();
		cerchio.setCenterY(cerchio.getCenterY()+verticale);
		if(cerchio.getCenterY()>=DIMENSIONE_Y-10) {
				verticale=-5;
				if(z>0.4) {
					verticale=-6;
				}
				if(z>0.8) {
					verticale=-8;
				}
		}
		if(cerchio.getCenterY()<=10) {
				 verticale=5;
				 if(z>0.5) {
				     verticale=6;
				 }
				 if(z>0.8) {
						verticale=8;
				 }
		}	
		cerchio.setCenterX(cerchio.getCenterX()+direzione);
		if(cerchio.getCenterX()>=DIMENSIONE_X-10) {
			 direzione=-3;
			 if(z>0.5) {
				 direzione=-6;
			 }if(z>0.8) {
					direzione=-	8;
			 }
		}
		if(cerchio.getCenterX()<=10) {
			 direzione=3;
			 if(z>0.5) {
				  direzione=6;
			 }if(z>0.8) {
					direzione=8;
			 }
		}	
	 }


	public static void main(String[] args) {
        launch(args);
    }
}