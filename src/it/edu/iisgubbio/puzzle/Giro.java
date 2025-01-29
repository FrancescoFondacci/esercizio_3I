package it.edu.iisgubbio.puzzle;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Giro extends Application {

	TextField tf1 = new TextField();
	TextField tf2 = new TextField();
	TextField tf3 = new TextField();
	TextField tf4 = new TextField();
	Button bGiro = new Button("Giro");
	
	@Override
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		principale.add(tf1, 0, 0);
		principale.add(tf2, 2, 0);
		principale.add(tf3, 2, 2);
		principale.add(tf4, 0, 2);
		principale.add(bGiro, 1, 1);
		
		Scene scena = new Scene(principale);
		finestra.setTitle("giro");
		finestra.setScene(scena);
		finestra.show();
		
		bGiro.setOnAction( e -> eseguiGiro() );
	}
	
	private void eseguiGiro() {
		String g1,g2,g3,g4;
		
		g1=tf1.getText();
		g2=tf2.getText();
		g3=tf3.getText();
		g4=tf4.getText();
		tf1.setText(g4);
		tf2.setText(g1);
		tf3.setText(g2);
		tf4.setText(g3);
	}
	
	
	public static void main(String[] args) {
	    launch(args);
	}
}
