package it.edu.iisgubbio.saluti;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * La mia prima classe
 */
public class CiaoMondo extends Application {

  Button pSaluto = new Button();
  Button pUno = new Button();
  Button pDue = new Button();
  Label lCiao = new Label();

  public void start(Stage finestra) {
    pSaluto.setText("Saluta!");
    pUno.setText("Uno");
    pDue.setText("Due");
    lCiao.setText("Ciao");
    pSaluto.setOnAction(e -> esegui());

    GridPane principale = new GridPane();
    principale.add(pSaluto,0,0);
    principale.add(pUno, 1, 0);
    principale.add(pDue, 0, 1);
    principale.add(lCiao, 2, 1);

    Scene scena = new Scene(principale);

    finestra.setTitle("Hello World!");
    finestra.setScene(scena);
    finestra.show();
  }

  private void esegui(){
    pSaluto.setText("Ciao Mondo!");
  }

  public static void main(String[] args) {
    launch(args);
  }
}
