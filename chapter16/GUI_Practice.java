package chapter16;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GUI_Practice extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
		BorderPane pane = new BorderPane();
		
		Pane textPane = new Pane();
		Text tx = new Text(300, 100, "I love PROGRAMING");
		textPane.getChildren().add(tx);
		pane.setCenter(textPane);
		
	    HBox hBox = new HBox(15); 
	    hBox.setPrefWidth(150);
	    hBox.setAlignment(Pos.CENTER);
	    hBox.setPadding(new Insets(15, 15, 15, 15));
	    hBox.setStyle("-fx-background-color: white");
	    Button right = new Button("====>");
	    Button left = new Button("<====");
	    hBox.getChildren().add(left);
	    hBox.getChildren().add(right);
		pane.setBottom(hBox);
		
		//All actions done by the hBox buttons//
	    right.setOnAction(e -> { 
	    	
	    	if (tx.getX() < 580) {
	    		
	    		tx.setX(tx.getX() + 10);
	    		
	    	}
	    	
	    });
	    
	    left.setOnAction(e -> { 
	    	
	    	if (tx.getX() > 10) {
	    		
	    		tx.setX(tx.getX() - 10);
	    		
	    	}
	    	
	    });
		
	    HBox hBoxr = new HBox(15); 
	    hBoxr.setPrefWidth(150);
	    hBoxr.setAlignment(Pos.CENTER);
	    hBoxr.setPadding(new Insets(15, 15, 15, 15));
	    hBoxr.setStyle("-fx-background-color: white");
	    RadioButton btr = new RadioButton("Red");
	    RadioButton btg = new RadioButton("Green");
	    RadioButton btbl = new RadioButton("Blue");
	    RadioButton btb = new RadioButton("Black");
	    ToggleGroup bt = new ToggleGroup();
	    btr.setToggleGroup(bt);
	    btg.setToggleGroup(bt);
	    btbl.setToggleGroup(bt);
	    btb.setToggleGroup(bt);
	    hBoxr.getChildren().addAll(btr, btg, btbl, btb);
		pane.setTop(hBoxr);
		
		//Sets all the hBoxr buttons to change the colors//
		btr.setOnAction(e -> tx.setFill(Color.RED));
		btg.setOnAction(e -> tx.setFill(Color.GREEN));
		btbl.setOnAction(e -> tx.setFill(Color.BLUE));
		btb.setOnAction(e -> tx.setFill(Color.BLACK));

				
		Scene scene = new Scene(pane, 700, 300);
		arg0.setScene(scene);
		arg0.show();
	}

}
