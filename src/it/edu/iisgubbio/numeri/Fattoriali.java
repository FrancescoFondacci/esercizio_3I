package it.edu.iisgubbio.numeri;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Fattoriali extends Application{
	

	TextField tfNumero= new TextField();
	Button bIterativo=new Button("Fattoriale Iterativo");
	Button bRicorsivo=new Button("Fattoriale Ricorsivo");
	Label lRisultato = new Label("??");
	Label lNumero = new Label("Numero");

	

	@Override
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		
		principale.add(lNumero, 0, 0);
		principale.add(tfNumero, 1,0);
		principale.add(bIterativo, 1, 1);
		principale.add(bRicorsivo, 1, 2);
		principale.add(lRisultato, 1, 3);
		
		
		Scene scena = new Scene(principale);	  	        
	    finestra.setTitle("IndovinaNumero");
	    finestra.setScene(scena);
		finestra.show();
			
		bIterativo.setOnAction( e -> eseguiIterativo() );
		bRicorsivo.setOnAction( e -> eseguiRicorsivo() );
	}
	int fattorialeFor(int x) {
		int fattoriale=1;
		for(int i=1;i<=x;i++) {
			fattoriale=fattoriale*i;
		}
		return fattoriale;
	}
	int fattorialeRicorsivo(int x) {
		if(x==1) {
			return 1;
		}else {
			return x*fattorialeRicorsivo(x-1);
		}	
	}
	private void eseguiIterativo() {
		int n=Integer.parseInt(tfNumero.getText());
		int f=fattorialeFor(n);
		lRisultato.setText(""+f);
	}
	private void eseguiRicorsivo() {
		int n=Integer.parseInt(tfNumero.getText());
		int f=fattorialeRicorsivo(n);
		lRisultato.setText(""+f);
	}
	public static void main(String[] args) {
		launch(args);
	}
}
