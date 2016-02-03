import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Logon extends Application
{

	//Start method to launch scene
	@Override
	public void start(Stage primaryStage)
	{
		//Border pane to hold horizontal boxes and grid panes
		BorderPane pane = new BorderPane();

			//box to hold the welcome message
		    HBox labelBox = new HBox();
		    labelBox.setPadding(new Insets(15, 12, 15, 12));
		    labelBox.setSpacing(10);

		    //Welcome message
		    Label welcomeLabel = new Label("Welcome To Video Shope");
		    welcomeLabel.setFont(new Font("Arial", 40));

		    //add welcome message to the hbox
		    labelBox.getChildren().addAll(welcomeLabel);

		    //hbox for the submit button
		    HBox subBox = new HBox();
		    subBox.setPadding(new Insets(15, 12, 15, 12));
		    subBox.setSpacing(10);

		    //Submit button and instance of the event handler class
		    Button btSubmit = new Button("Submit");
		    SubmitHandlerClass handler1 = new SubmitHandlerClass();
			btSubmit.setOnAction(handler1);
		    btSubmit.setPrefSize(100, 20);

		    subBox.getChildren().addAll(btSubmit);

		    //Grid panel with sizable rows and columbs to store labels and text fields
			GridPane grid = new GridPane();
			grid.setHgap(10);
			grid.setVgap(10);
			grid.setPadding(new Insets(0, 10, 0, 10));

			//labels
			Text logonID = new Text("Logon ID");
			Text passwordLabel = new Text("Password");

			//text fields
			final TextField ID = new TextField();
			final TextField password = new TextField();

			//add to the gridpane
			grid.add(logonID, 10, 0);
			grid.add(passwordLabel, 10, 1);
			grid.add(ID, 11, 0);
			grid.add(password, 11, 1);

		//Add the two hboxes and gridpane to the main border pane
		pane.setTop(labelBox);
		pane.setBottom(subBox);
		pane.setCenter(grid);

		//Create the scene using pane
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Log In");
		primaryStage.setScene(scene);
		primaryStage.show();


	}


	public static void main(String[] args)
	{
		Application.launch(args);

	}

	//This class handles the submit button event. It opens the Main Menu class
	class SubmitHandlerClass implements EventHandler<ActionEvent>
	{
		@Override
		public void handle(ActionEvent e)
		{
             Stage secondStage = new Stage();

             MainMenu menu = new MainMenu(secondStage);
             menu.start(secondStage);

		}
	}

}
