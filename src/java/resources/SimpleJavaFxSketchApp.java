import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SimpleJavaFxSketchApp extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		Canvas canvas = new Canvas(410, 400);
		VBox vbox = new VBox();
		vbox.setStyle("-fx-background-color: white;");
		vbox.getChildren().add(getHBox1(canvas));
		vbox.getChildren().add(getHBox2(canvas));

		stage.setTitle("Simple JavaFx Sketch App");
		stage.setScene(new Scene(vbox, canvas.getWidth() - 10, canvas.getHeight() + 30));
		stage.setResizable(false);
		stage.show();
	}

	private Node getHBox1(Canvas canvas) {
		GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
		graphicsContext.setLineWidth(5L);
		canvas.addEventHandler(MouseEvent.MOUSE_PRESSED, e -> {
			graphicsContext.beginPath();
			graphicsContext.moveTo(e.getX(), e.getY());
			graphicsContext.stroke();
			graphicsContext.closePath();
		});
		canvas.addEventHandler(MouseEvent.MOUSE_DRAGGED, e -> {
			graphicsContext.lineTo(e.getX(), e.getY());
			graphicsContext.stroke();
		});
		HBox hbox = new HBox();
		hbox.getChildren().add(canvas);
		hbox.setStyle("-fx-border-color: black;");
		return hbox;
	}

	private Node getHBox2(Canvas canvas) {
		GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
		ColorPicker colorPicker = new ColorPicker(Color.BLACK);
		Button button = new Button("Erase");
		button.setOnAction(e -> {
			if (button.getText().equals("Erase")) {
				graphicsContext.setStroke(Color.WHITE);
				colorPicker.setVisible(false);
				button.setText("Sketch");
				graphicsContext.setLineWidth(30);
				canvas.setCursor(Cursor.TEXT);
			} else {
				graphicsContext.setStroke(colorPicker.getValue());
				colorPicker.setVisible(true);
				button.setText("Sketch");
				graphicsContext.setLineWidth(5L);
				canvas.setCursor(Cursor.DEFAULT);
			}
		});
		colorPicker.setOnAction(e -> {
			graphicsContext.setStroke(colorPicker.getValue());
		});
		HBox hbox = new HBox();
		hbox.setSpacing(5L);
		hbox.getChildren().add(button);
		hbox.getChildren().add(colorPicker);
		hbox.setStyle("-fx-border-color: black;");
		return hbox;
	}

}
