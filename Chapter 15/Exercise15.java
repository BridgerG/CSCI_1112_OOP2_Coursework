package chapter15;

import javafx.animation.FadeTransition;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Exercise15 extends Application {
	boolean paused = false;

	@Override
	public void start(Stage primarystage) {
		// TODO Auto-generated method stub
		Pane pane = new Pane();
		Polygon polygon = new Polygon();
		ObservableList<Double> list = polygon.getPoints();
		
		double centerX = 500 / 2, centerY = 500 / 2;
		double radius = Math.min(500, 500) * 0.4;
		
		// Add points to the polygon list
		for (int i = 0; i < 8; i++) {
			list.add(centerX + radius * Math.cos(2 * i * Math.PI / 8 - Math.PI / 8)); 
			list.add(centerY - radius * Math.sin(2 * i * Math.PI / 8 - Math.PI / 8));
		    	}     

		polygon.setFill(Color.WHITE);
		polygon.setStroke(Color.BLACK);
		pane.getChildren().add(polygon);
		
		//Make the rectangle//
		Rectangle rect = new Rectangle(0, 0, 100 ,100);
		rect.setStroke(Color.BLUE);
		rect.setFill(Color.BLUE);
		
		//Give the rectangle the Fade//
		FadeTransition ft = new FadeTransition(Duration.millis(3000), rect);
	    ft.setFromValue(1.0);
	    ft.setToValue(0.1);
	    ft.setCycleCount(Timeline.INDEFINITE);
	    ft.setAutoReverse(true);
	    ft.play(); // Start animation 

	    // Create a path transition 
	    PathTransition pt = new PathTransition();
	    pt.setDuration(Duration.millis(4000));
	    pt.setPath(polygon);
	    pt.setNode(rect);
	    pt.setOrientation(
	      PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
	    pt.setCycleCount(Timeline.INDEFINITE);
	    pt.play(); // Start animation
	    
	    pane.setOnMouseClicked(e -> {
		    if (paused == false) {
		    	pt.pause();
		    	ft.pause();
		    	paused = true;
		    } else {
		    	pt.play();
		    	ft.play();
		    	paused = false;
		    }
	    });
		
	    pane.getChildren().add(rect);
		
		Scene scene = new Scene(pane, 500, 500);
		
		primarystage.setTitle("Polygon X Square crossover event :)");
		primarystage.setScene(scene);
		primarystage.show();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
}
