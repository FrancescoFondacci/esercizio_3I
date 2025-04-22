package it.edu.iisgubbio.animazioni;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Bounds;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Animazione extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	static final int DIMENSIONE_X=400;
	static final int DIMENSIONE_Y=400;
	Rectangle personaggio = new Rectangle(20,20);
	Rectangle racchettaSinistra = new Rectangle(2000,20);
	double cordinataY=360;
	int cordinataX=0;
	int direzione=0;
	boolean space;
	boolean d;
	boolean a;
	double cordinataSaltoY=personaggio.getX();
	//boolean shift;


	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane areaDiGioco = new Pane();
		areaDiGioco.setPrefSize(DIMENSIONE_X, DIMENSIONE_Y);
		areaDiGioco.getChildren().add(racchettaSinistra);
		areaDiGioco.getChildren().add(personaggio);
		personaggio.setY(cordinataY);
		racchettaSinistra.setY(DIMENSIONE_Y-20);


		Scene scena = new Scene(areaDiGioco);
		primaryStage.setScene(scena);
		primaryStage.setTitle("Rimbalzo");
		primaryStage.show();

		Timeline timeline = new Timeline(new KeyFrame(
				Duration.seconds(0.02),
				x -> aggiornaTimer()));
		timeline.setCycleCount(-1);
		timeline.play();

		scena.setOnKeyPressed(e -> tastoPremuto(e));
		scena.setOnKeyReleased(e -> tastoR(e));		
	}
	double orizzontale=5;
	double verticale=3;
	private void aggiornaTimer(){ 
		boolean g=true;
		Bounds bSinistra = racchettaSinistra.getBoundsInParent();
		Bounds bPersonaggio = personaggio.getBoundsInParent();
		if(!(bSinistra.intersects(bPersonaggio))&& g) {
			personaggio.setY(cordinataY+=+6);
		}
		if(d) {
			personaggio.setX(cordinataX+=5);
		}
		if(a) {
			personaggio.setX(cordinataX+=-5);
		}
		if(space && cordinataY>=320) {
			personaggio.setY(cordinataY+=-20);
		}
		/*if(shift) {
			personaggio.setX(cordinataX+=15*direzione);
		}*/
	}
	private void tastoPremuto(KeyEvent tasto){
		

		if(tasto.getText().equals("d")) {
			d=true;
			direzione=1;
		}
		if(tasto.getText().equals("a")) {
			a=true;
			direzione=-1;
		}
		if(tasto.getCode()==KeyCode.SPACE) {
			space=true;
		}
		/*if(tasto.getCode()==KeyCode.SHIFT) {
			timeline.play();
			shift=true;
		 }*/

	}
	private void tastoR(KeyEvent tasto){
		if(tasto.getCode()==KeyCode.SPACE) {
			space=false;
		}
		/* if(tasto.getCode()==KeyCode.SHIFT) {
			 shift=false;
		 }*/
		if(tasto.getText().equals("d")) {
			d=false;
		}
		if(tasto.getText().equals("a")) {
			a=false;
		}
	}
}
