package chapter14;

import java.util.Random;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class ClockPaneTest extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    
	Random rand1 = new Random();
	  
	// Create a clock and a label
    ClockPane clock = new ClockPane();
    clock.setSecondHandVis(false);
    String timeString = clock.getHour() + ":" + clock.getMinute() 
      + ":" + clock.getSecond();
    Label lblCurrentTime = new Label(timeString);
    
    clock.setHour(rand1.nextInt(12));
    
    if (rand1.nextInt(2) == 0) {
    	
    	clock.setMinute(0);
    	
    } else {
    	
    	clock.setMinute(30);
    	
    }

    // Place clock and label in border pane
    BorderPane pane = new BorderPane();
    pane.setCenter(clock);
    pane.setBottom(lblCurrentTime);
    BorderPane.setAlignment(lblCurrentTime, Pos.TOP_CENTER);

    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, 250, 250);
    primaryStage.setTitle("DisplayClock"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }

  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}