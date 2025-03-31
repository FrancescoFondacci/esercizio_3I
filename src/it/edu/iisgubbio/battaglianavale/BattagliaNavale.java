package it.edu.iisgubbio.battaglianavale;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class BattagliaNavale extends Application {
	
	ImageView[][]q;
	Image acqua = new Image(getClass().getResourceAsStream("acqua.png"));
	Image affondato = new Image(getClass().getResourceAsStream("affondato.png"));
	Image colpito = new Image(getClass().getResourceAsStream("colpito.png"));
	Image nonColpito = new Image(getClass().getResourceAsStream("nonColpito.png"));
	TextField tfCordinataX=new TextField();
	TextField tfCordinataY=new TextField();
	Button bSpara=new Button("Spara");
	Label lEsito=new Label("???");
	/*se la nave è lunga 2 si chiama incrociatore
	 * se lunga 3 è un sottomarino
	 * se lunga 4 porta-aerei
	 */
	int[] misure= {3,3,4,4,4};
	
	Nave[] flotta=new Nave[misure.length];
	
	@Override
	public void start(Stage finestra) throws Exception {
		
		q=new ImageView[10][10];
	
		for(int i=0;i<flotta.length;i++) {
			String nomeNave=" ";
			boolean sovrapposte;
			do{	
				switch(misure[i]) {
				case 3:
					nomeNave="sottomarino";
					break;
				case 2:
					nomeNave="incrociatore";
					break;
				case 4:
					nomeNave="porta-aerei";
					break;
					default:
						nomeNave=" ";
				}
				flotta[i]=new Nave(""+nomeNave+i,(int)(Math.random()*(10-misure[i])),(int)(Math.random()*10),misure[i],false);
				
				sovrapposte=false;
				for(int p=0;p<i;p++) {
					if(flotta[i].sovrappone(flotta[p])){
						sovrapposte=true;
					}
				}
			}while(sovrapposte==true);
			System.out.println(flotta[i]);
		}
	
		GridPane principale = new GridPane();
		
		for(int x=0;x<q.length;x++) {
			for(int y=0;y<q[x].length;y++) {
				q[x][y]= new ImageView(acqua);
				principale.add(q[x][y],x,y);
			}			
		}
		
		principale.add(tfCordinataX ,0 ,10);
		principale.add(tfCordinataY ,1 ,10);
		principale.add(bSpara ,2,10 ,2,1);
		principale.add(lEsito ,4,10 ,3,1);
		
		tfCordinataX.setPrefWidth(30);
		tfCordinataY.setPrefWidth(30);
		tfCordinataX.setPromptText("cordinata X");
		tfCordinataY.setPromptText("cordinata Y");
		
		Scene scena = new Scene(principale);
		finestra.setTitle("IndovinaNumero");
		finestra.setScene(scena);
		finestra.show();
		
		bSpara.setOnAction(e->azioneColpo());
		
	}private void azioneColpo() {
		boolean bColpito=false;
		boolean affondata=false;
		Pezzo[]k = null;
		int x=Integer.parseInt(tfCordinataX.getText());
		int y=Integer.parseInt(tfCordinataY.getText());
		for(int i=0;i<flotta.length;i++) {
			if(flotta[i].colpo(x,y)) {
				bColpito=true;
				if(flotta[i].affondata()) {
					affondata=true;
					k = flotta[i].getPezzi();
					for(int pos=0;pos<k.length;pos++) {
						q[k[pos].x][k[pos].y].setImage(affondato);
					}
				}
			}
			
		}
		if(!affondata) {
			if(bColpito) {
				q[x][y].setImage(colpito);
				lEsito.setText("colpito");
			}else {
				q[x][y].setImage(nonColpito);
				lEsito.setText("non colpito");
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}

	
	
	

}
