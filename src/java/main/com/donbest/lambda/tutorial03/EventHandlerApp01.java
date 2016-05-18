package com.donbest.lambda.tutorial03;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class EventHandlerApp01 extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button button=new Button("Click Me");
		button.setOnAction(new DemoEventHandler());
		
		primaryStage.setScene(new Scene(button));
		primaryStage.show();
	}
}

class DemoEventHandler implements EventHandler<ActionEvent> {

	@Override
	public void handle(ActionEvent event) {
		System.out.println("event handler triggered");
	}

}