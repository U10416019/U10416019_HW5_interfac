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
		
		
		
		//create seven button lines
		Line b1 = new Line(85, 380, 85, 315);
		Line b2 = new Line(120, 380, 120, 315);
		Line b3 = new Line(155, 380, 155, 315);
		Line b4 = new Line(190, 380, 190, 315);
		Line b5 = new Line(225, 380, 225, 315);
		Line b6 = new Line(260, 380, 260, 315);
		Line b7 = new Line(295, 380, 295, 315);
		//add lines in pane
		pane.getChildren().add(b1);
		pane.getChildren().add(b2);
		pane.getChildren().add(b3);
		pane.getChildren().add(b4);
		pane.getChildren().add(b5);
		pane.getChildren().add(b6);
		pane.getChildren().add(b7);
		
		
		
		//create top left and top right line
		Line topLeft = new Line(172.5, 15, 172.5, 55);
		Line topRight = new Line(207.5, 15, 207.5, 55);
		//add lines in pane
		pane.getChildren().add(topLeft);
		pane.getChildren().add(topRight);
		
		
		
		//create right and left slash lines
		Line left = new Line(50, 315, 172.5, 55);
		Line right = new Line(330, 315, 207.5, 55);
		//add lines in pane
		pane.getChildren().add(left);
		pane.getChildren().add(right);
		

		
		//Create a scene and place it in the stage
		Scene scene = new Scene(pane, 380, 410);
		primaryStage.setTitle("U10416019");
		primaryStage.setScene(scene);
		primaryStage.show();
	
	}
}