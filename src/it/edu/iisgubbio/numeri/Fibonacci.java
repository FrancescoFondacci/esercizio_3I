package it.edu.iisgubbio.numeri;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Fibonacci extends Application {
	
	Label lN=new Label("n");
	TextField tfNumero=new TextField();
	Button bCalcola=new Button("Calcola");
	Label lFib=new Label("Fib(n)");
	Label lRisultato=new Label("???");
	
	@Override
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		
		principale.add(lN, 0, 0);
		principale.add(tfNumero, 1,0);
		principale.add(bCalcola, 1, 1);
		principale.add(lRisultato, 1, 3);
		
		
		Scene scena = new Scene(principale);	  	        
	    finestra.setTitle("IndovinaNumero");
	    finestra.setScene(scena);
		finestra.show();
			
		bCalcola.setOnAction( e -> eseguiCalcola() );		
	}
	int fib(int n) {
		if(n==0) {
			return 0;
		}else if(n==1) {
			return 1;
		}else {
			return fib(n-2)+fib(n-1);
		}
	}
			 
				
				
	
	private void eseguiCalcola() {
		int numero;
		numero=Integer.parseInt(tfNumero.getText());
		int fib=fib(numero);
		lRisultato.setText(""+fib);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
