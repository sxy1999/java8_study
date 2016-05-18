package com.donbest.lambda.tutorial03;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class EventHandlerApp03 extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button button = new Button("Click Me");
//		button.setOnAction((ActionEvent e) -> System.out.println(e.toString()));
		button.setOnAction(System.out::println);
		primaryStage.setScene(new Scene(button));
		primaryStage.show();
	}
}
