package it.edu.iisgubbio.animazioni;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class PannelloPallina extends Application {
	public static void main(String[] args) {
        launch(args);
    }
	
	int x =20;
	double z=20;
	Circle cerchio = new Circle(z);
	
	 @Override
	public void start(Stage primaryStage) throws Exception {
	        Pane areaDiGioco = new Pane();
	        areaDiGioco.setPrefSize(400, 400);
	        
	        cerchio.setCenterX(x);
	        cerchio.setCenterY(20);
	        cerchio.setFill( Color.GREEN );
	        areaDiGioco.getChildren().add(cerchio);
	        
	        Scene scena = new Scene(areaDiGioco);
	        primaryStage.setScene(scena);
	        primaryStage.setTitle("L1");
	        primaryStage.show();
	        
	        Timeline timeline = new Timeline(new KeyFrame(
	  		    Duration.seconds(0.02),
	  		    x -> aggiornaTimer()));
	  		timeline.setCycleCount(100);
	  		timeline.play();
	}
	 private void aggiornaTimer(){
		 x+=5;
		 cerchio.setCenterX(x);
		 z-=0.25;
		 cerchio.setRadius(z);
		 
		 
		
	 }

}
