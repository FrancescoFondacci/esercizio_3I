package it.edu.iisgubbio.disegni;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class HelloCanvas extends Application {

  @Override
  public void start(Stage primaryStage) {
    // creiamo un pannello specificando larghezza e altezza
    Canvas tela = new Canvas(300, 260);
    // otteniamo l'oggetto che ci permette di disegnare
    GraphicsContext gc = tela.getGraphicsContext2D();
    gc.setFill(Color.YELLOW);
    gc.setLineWidth(5);
    gc.fillOval(50, 50, 200, 200);
    gc.setFill(Color.BLACK);
    gc.fillOval(100, 100, 20, 20);
    gc.fillOval(180, 100, 20, 20);
    gc.setStroke(Color.RED);
    gc.setLineWidth(8);
    gc.strokeLine(100, 200, 150, 180);
    gc.strokeLine(150, 180, 200, 200);

    GridPane pannello = new GridPane();
    // inseriamo il nostro canvas nella finestra
    pannello.add(tela, 0, 0);

    Scene scene = new Scene(pannello);
    primaryStage.setTitle("Hello Canvas!");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}