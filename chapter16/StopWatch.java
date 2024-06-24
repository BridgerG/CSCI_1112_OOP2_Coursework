package chapter16;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.media.*;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;

public class StopWatch extends Application{

	
	public static void main(String[] args) {
		launch(args);
		
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		//int itimer = 30;
		//String stimer = Integer.toString(itimer);
		
		TextField text = new TextField("5");
		Media media1 = new Media("https://liveexample.pearsoncmg.com/common/audio/anthem/anthem0.mp3");
		MediaPlayer media = new MediaPlayer(media1);
		
		VBox pane = new VBox();
		pane.getChildren().addAll(text);
		
		
		Scene scene = new Scene(pane, 300, 100);
		
		text.setPrefWidth(stage.getWidth());
		text.setPrefHeight(250);
		pane.setAlignment(Pos.CENTER);
		text.setAlignment(Pos.CENTER);
		
		
		Timeline time = new Timeline(new KeyFrame(Duration.seconds(1), e -> {
			
			int a = Integer.valueOf(text.getText());

			if (a > 0) {
				
				a -= 1;
			text.setText(Integer.toString(a));
				
			} else {
			
				media.play();
				
			}
	
		}));
		
		text.setOnAction(e -> {			
			
				time.setCycleCount(Integer.valueOf(text.getText()) + 1);
				time.play();
		});

		
		stage.setScene(scene);
		stage.show();
		
		
	}
}
