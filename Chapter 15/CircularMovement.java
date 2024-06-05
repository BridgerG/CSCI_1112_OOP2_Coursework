package chapter15;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CircularMovement extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		CircleMakingBasic circle = new CircleMakingBasic();
	    Pane pane = new Pane();
	    circle.setWidth(100);
	    circle.setHeight(100);
	    pane.getChildren().add(circle);
	   
	    //Movement

	    // Create a scene and place it in the stage
	    Scene scene = new Scene(pane, 500, 500);    
	    
	    
	    primaryStage.setTitle("BALL");
	    primaryStage.setScene(scene);
	   	
	    
	    scene.setOnKeyPressed(e -> {
			
	    	if (e.getCode() == KeyCode.W && circle.getY() - 25 > 35) {
	    		
	    		circle.setY(circle.getY() - 10);
	    		
	    	} else if (e.getCode() == KeyCode.W && circle.getY() - 25 <= 25) {
	    		
	    		circle.setY(25);
	    		
	    	}
	    
	    	if (e.getCode() == KeyCode.A && circle.getX() - 25 > 35) {
	    		
	    		circle.setX(circle.getX() - 10);
	    		
	    	} else if (e.getCode() == KeyCode.A && circle.getX() - 25 <= 25) {
	    		
	    		circle.setX(25);
	    		
	    	}
	    	
	    	if (e.getCode() == KeyCode.S && circle.getY() < scene.getHeight() - 60) {
	    		
	    		circle.setY(circle.getY() + 10);
	    		
	    	} else if (e.getCode() == KeyCode.S && circle.getY() <= scene.getHeight() - 60) {
	    		
	    		circle.setY(scene.getHeight() - 55);
	    		
	    	}
	    
	    	if (e.getCode() == KeyCode.D && circle.getX() < scene.getWidth() - 60) {
	    		
	    		circle.setX(circle.getX() + 10);
	    		
	    	} else if (e.getCode() == KeyCode.D && circle.getX() <= scene.getWidth() - 60) {
	    		
	    		circle.setX(55);
	    		
	    	}
	    });
	    
	    primaryStage.show();  


	}

}

class CircleMakingBasic extends Pane{
	
	double Y = 150, X = 100;
	
	public void paint() {
		
		getChildren().clear();
		double radius =  50;
	    Circle circle = new Circle(X, Y, radius);
	    circle.setFill(Color.BLUEVIOLET);
	    circle.setStroke(Color.BLACK);
	    getChildren().add(circle);
	    
	}
	
	
	public void setX(double x) {
		
		X = x;
		paint();
		
	}
	
	public void setY(double y) {
		
		Y = y;
		paint();
		
	}
	
	public double getX() {
		
		return X;

	}
	
	public double getY() {
		
		return Y;
		
	}

	  @Override
	  public void setWidth(double width) {
	    super.setWidth(width);
	    paint();
	  }
	  
	  @Override
	  public void setHeight(double height) {
	    super.setHeight(height);
	    paint();
	  }
	
	
	
	
}