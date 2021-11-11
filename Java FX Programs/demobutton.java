import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;

public class demobutton extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	public void start(Stage myStage)
	{
		myStage.setTitle("JavaFX Window");
		FlowPane rootNode = new FlowPane();
		rootNode.setAlignment(Pos.CENTER);
		Scene myScene = new Scene(rootNode, 300, 200);
		myStage.setScene(myScene);
		Button btn1 = new Button("OK");
		Label response = new Label();
		btn1.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent ae)
			{
				response.setText("OK button was pressed");
			}
		});
		rootNode.getChildren().addAll(btn1, response);
		myStage.show();
	}

}
