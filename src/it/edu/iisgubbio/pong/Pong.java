package it.edu.iisgubbio.pong;


import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Bounds;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;


public class Pong extends Application {

	static final int DIMENSIONE_X=400;
	static final int DIMENSIONE_Y=400;
	Rectangle racchettaSinistra = new Rectangle(20,100);
	Rectangle racchettaDestra = new Rectangle(20,100);
	Circle cerchio = new Circle(10);
	int ySinistra=40;
	int yDestra=40;
	Text puntiSinistra = new Text();
	Text puntiDestra = new Text();
	int pSinistra=0;
	int pDestra=0;


	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane areaDiGioco = new Pane();
		areaDiGioco.setPrefSize(DIMENSIONE_X, DIMENSIONE_Y);	
		areaDiGioco.getChildren().add(racchettaSinistra);
		racchettaSinistra.setFill( Color.WHITE );
		areaDiGioco.getChildren().add(racchettaDestra);
		racchettaDestra.setFill( Color.WHITE );
		areaDiGioco.getChildren().add(puntiSinistra);
		areaDiGioco.getChildren().add(puntiDestra);

		puntiDestra.setY(100);
		puntiDestra.setX(300);

		puntiSinistra.setY(100);
		puntiSinistra.setX(100);

		cerchio.setCenterX(20);
		cerchio.setCenterY(20);
		cerchio.setFill( Color.WHITE );
		areaDiGioco.getChildren().add(cerchio);

		racchettaSinistra.setY(ySinistra);
		racchettaDestra.setY(yDestra);
		racchettaDestra.setX(380);

		Scene scena = new Scene(areaDiGioco);
		scena.getStylesheets().add("it/edu/iisgubbio/pong/Pong.css");
		puntiSinistra.getStyleClass().add("punteggio");
		puntiDestra.getStyleClass().add("punteggio");
		areaDiGioco.getStyleClass().add("sfondo");

		primaryStage.setScene(scena);
		primaryStage.setTitle("Racchette");
		primaryStage.show();

		Timeline timeline = new Timeline(new KeyFrame(
				Duration.seconds(0.02),
				x -> aggiornaTimer()));
		timeline.setCycleCount(-1);
		timeline.play();

		scena.setOnKeyPressed(e -> tastoPremuto(e));

	}
	double orizzontale=5;
	double verticale=3;
	private void aggiornaTimer(){
		double z=Math.random()-0.5;		
		cerchio.setCenterY(cerchio.getCenterY()+verticale);
		if(cerchio.getCenterY()>=DIMENSIONE_Y-10) {
			verticale=-5+z;
		}
		if(cerchio.getCenterY()<=10) {
			verticale=5+z;
		}	
		cerchio.setCenterX(cerchio.getCenterX()+orizzontale);
		if(cerchio.getCenterX()>=DIMENSIONE_X-10) {
			orizzontale=-3+z;
		}
		if(cerchio.getCenterX()<=10) {
			orizzontale=3+z;
		}	

		Bounds bCerchio = cerchio.getBoundsInParent();
		Bounds bSinistra = racchettaSinistra.getBoundsInParent();
		Bounds bDestra = racchettaDestra.getBoundsInParent();
		if(bCerchio.intersects(bSinistra)) {
			orizzontale=4;	 
		}	     
		if(bCerchio.intersects(bDestra)) {	    	
			orizzontale=-4;
		}
		if(cerchio.getCenterX()>=DIMENSIONE_X-10) {
			pSinistra++;
			puntiSinistra.setText(""+pSinistra);
			cerchio.setCenterX(200);
	    	cerchio.setCenterY(200);
	    	orizzontale=3;
	    	verticale=1;
		}
		if(cerchio.getCenterX()<=10) {
			pDestra++;
			puntiDestra.setText(""+pDestra);
			cerchio.setCenterX(200);
	    	cerchio.setCenterY(200);
	    	orizzontale=-3;
	    	verticale=1;
		}
	}
	private void tastoPremuto(KeyEvent tasto){
		if(tasto.getText().equals("s")) {
			ySinistra+=20;			 
		}
		if(tasto.getText().equals("w")) {
			ySinistra-=20;
		}
		racchettaSinistra.setY(ySinistra);

		if(tasto.getCode()==KeyCode.DOWN) {
			yDestra+=20;		 
		}
		if(tasto.getCode()==KeyCode.UP) {
			yDestra-=20;
		}
		racchettaDestra.setY(yDestra);
		if(ySinistra>=300) {
			racchettaSinistra.setY(300);
			ySinistra=300;
		}
		if(ySinistra<=0) {
			racchettaSinistra.setY(0);
			ySinistra=0;
		}
		if(yDestra>=300) {
			racchettaDestra.setY(300);
			yDestra=300;
		}
		if(yDestra<=0) {
			racchettaDestra.setY(0);
			yDestra=0;
		}		 
	}
	public static void main(String[] args) {
		launch(args);
	}
}