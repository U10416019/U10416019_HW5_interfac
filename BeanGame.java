//U10416019鄭文琪

import javafx.application.Application;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.paint.*;
import javafx.scene.shape.*;


public class BeanGame extends Application{
	@Override
	public void start(Stage primaryStage){
		//create a pane to add all lines and circles
		Pane pane = new Pane();
		
		//create the button, lower left and lower right line
		Line button = new Line(50, 380, 330, 380);
		Line bleft = new Line(50, 380, 50, 315);
		Line bright = new Line(330, 380, 330, 315);
		//add lines in pane
		pane.getChildren().add(button);
		pane.getChildren().add(bleft);
		pane.getChildren().add(bright);
		

		//Create a scene and place it in the stage
		Scene scene = new Scene(pane, 380, 410);
		primaryStage.setTitle("U10416019");
		primaryStage.setScene(scene);
		primaryStage.show();
	
	}
}