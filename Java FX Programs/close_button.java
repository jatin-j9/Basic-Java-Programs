import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;

public class close_button extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	public void start(Stage myStage)
	{
		myStage.setTitle("Close Button");
		FlowPane rootNode = new FlowPane();
		rootNode.setAlignment(Pos.CENTER);
		Scene myScene = new Scene(rootNode, 300, 200);
		myStage.setScene(myScene);
		Button btn = new Button("Close");
		Label response = new Label();
		btn.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent ae)
			{
				myStage.close();
			}
		});
		rootNode.getChildren().addAll(btn, response);
		myStage.show();
	}

}
