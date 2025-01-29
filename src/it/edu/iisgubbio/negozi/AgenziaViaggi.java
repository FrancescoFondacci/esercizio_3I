package it.edu.iisgubbio.negozi;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AgenziaViaggi extends Application{
	
	Label lNPers = new Label("Numero persone");
	Label lCapA = new Label("Capienza autobus");
	Label lCostA = new Label("Costo autobus");
	Label lNA = new Label("Autobus necessari");
	Label lCostP = new Label("Costo Persona");
	TextField tfNPers = new TextField();
	TextField tfCapA = new TextField();
	TextField tfCostA= new TextField();
	
	@Override
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		
		principale.add(lNPers, 0, 0);
		principale.add(lCapA, 0, 1);
		principale.add(lCostA, 0, 2);
		principale.add(lNA, 0, 3,2,1);
		principale.add(lCostP, 0, 4,2,1);
		principale.add(tfNPers, 1, 0);
		principale.add(tfCapA, 1, 1);
		principale.add(tfCostA, 1, 2);
		
		Scene scena = new Scene(principale);
		
		scena.getStylesheets().add("it/edu/iisgubbio/negozi/AgenziaViaggi.css");
		 principale.getStyleClass().add("principale");
		 lNA.getStyleClass().add("risultato");
		 lCostP.getStyleClass().add("risultato");
		 
		finestra.setTitle("Agenzia Viaggi");
		finestra.setScene(scena);
		finestra.show();
		
		tfCostA.setOnAction( e -> eseguiCalcoli() );
	}
	
	private void eseguiCalcoli(){
		double costA,costPers;
		int nPers,nA,capA;
		
		nPers=Integer.parseInt(tfNPers.getText());
		capA=Integer.parseInt(tfCapA.getText());
		costA=Double.parseDouble(tfCostA.getText());
		if(nPers%capA!=0){
			nA=nPers/capA+1;	
		}else{
			nA=nPers/capA;	
		}
		lNA.setText("Autobus necessari: "+nA);
		costPers=costA*nA/nPers;
		lCostP.setText("Costo Persona: "+(""+costPers));
	}
	public static void main(String[] args) {
		launch(args);
	}	

}
