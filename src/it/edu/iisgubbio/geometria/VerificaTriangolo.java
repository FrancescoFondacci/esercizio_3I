package it.edu.iisgubbio.geometria;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class VerificaTriangolo extends Application {
	
	Label lLato1 = new Label("Lato 1");
	Label lLato2 = new Label("Lato 2");
	Label lLato3 = new Label("Lato 3");
	Label lRisultato = new Label("???");
	Label lTipo1 = new Label("???");
	Label lRettangolo = new Label("???");
	TextField tfLato1 = new TextField();
	TextField tfLato2 = new TextField();
	TextField tfLato3 = new TextField();
	Button bControlla = new Button("Controlla");
	Button bTipo = new Button("Tipo");
	Button bRettangolo = new Button("Rettangolo");
	
	@Override
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		principale.add(lLato1, 0, 0);
		principale.add(lLato2, 0, 1);
		principale.add(lLato3, 0, 2);
		principale.add(lRisultato, 1, 3);
		principale.add(lTipo1, 3, 3);
		principale.add(lRettangolo, 4, 3);
		principale.add(tfLato1, 1, 0);
		principale.add(tfLato2, 1, 1);
		principale.add(tfLato3, 1, 2);
		principale.add(bControlla, 2,0,1,3);
		principale.add(bTipo, 3,0,1,2);
		principale.add(bRettangolo, 4,0,1,2);
		principale.setHgap(10);
		bControlla.setMaxHeight(Integer.MAX_VALUE);
		bTipo.setMaxHeight(Integer.MAX_VALUE);
		bRettangolo.setMaxHeight(Integer.MAX_VALUE);
		
		Scene scena = new Scene(principale);
		finestra.setTitle("Triangolo");
		finestra.setScene(scena);
		finestra.show();
		
		bControlla.setOnAction( e -> eseguiControlla() );
		bTipo.setOnAction( e -> eseguiTipo() );
		bRettangolo.setOnAction( e -> eseguiRettangolo() );
	}
	
	private void eseguiControlla() {
		double lato1,lato2,lato3;
		String tLato1,tLato2,tLato3;
		tLato1=tfLato1.getText();
		tLato2=tfLato2.getText();
		tLato3=tfLato3.getText();
		lato1=Double.parseDouble(tLato1);
		lato2=Double.parseDouble(tLato2);
		lato3=Double.parseDouble(tLato3);
		if(lato1+lato2>lato3 && lato1+lato3>lato2 && lato2+lato3>lato1){
			lRisultato.setText("è un triangolo");
		}else {
			lRisultato.setText("Non è un triangolo");
		}
	}
	
	private void eseguiTipo() {
		double lato1,lato2,lato3;
		String tLato1,tLato2,tLato3;
		tLato1=tfLato1.getText();
		tLato2=tfLato2.getText();
		tLato3=tfLato3.getText();
		lato1=Double.parseDouble(tLato1);
		lato2=Double.parseDouble(tLato2);
		lato3=Double.parseDouble(tLato3);
		if(lato1==lato2 && lato2==lato3 && lato3==lato1) {
			lTipo1.setText("è un triangolo equilatero");
		}else
			if(lato1==lato2 || lato2==lato3 || lato3==lato1) {
				lTipo1.setText("è un triangolo isoscele");
			}else
				if(lato1!=lato2 && lato2!=lato3 && lato3!=lato1) {
					 lTipo1.setText("è un triangolo scaleno");
				}
			    
			
	}
	
	private void eseguiRettangolo() {
		double lato1,lato2,lato3;
		String tLato1,tLato2,tLato3;
		tLato1=tfLato1.getText();
		tLato2=tfLato2.getText();
		tLato3=tfLato3.getText();
		lato1=Double.parseDouble(tLato1);
		lato2=Double.parseDouble(tLato2);
		lato3=Double.parseDouble(tLato3);
		if(lato1*lato1+lato2*lato2==lato3*lato3 || lato3*lato3+lato2*lato2==lato1*lato1 || lato3*lato3+lato1*lato1==lato2*lato2) {
			lRettangolo.setText("è un triangolo rettangolo");
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
}