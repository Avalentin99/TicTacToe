package TicTacToe;



import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Board extends Application {
	
	Stage aStage;
	
	public static void main(String [] args) {
		launch(args);
	}

	@Override
	public void start(Stage pStage) throws Exception {
		
		aStage=pStage;
		
		GridPane aGridPane = new GridPane();
		aGridPane.setPadding(new Insets(10,10,10,10));
		
		aGridPane.setVgap(8);
		aGridPane.setHgap(10);
		
		Label aNameLabel = new Label("Username:");
		GridPane.setConstraints(aNameLabel, 0,0);
		
		aGridPane.getChildren().addAll(aNameLabel);
		
		Scene aScene = new Scene(aGridPane, 300, 200);
		
		aStage.setScene(aScene);
		aStage.show();
		
		
	}

}
