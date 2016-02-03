import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MainMenu extends Application
{

	public MainMenu(Stage stage)
	{

	}

	@Override
	public void start(Stage primaryStage)
	{
		BorderPane pane = new BorderPane();

		   HBox hbox = new HBox();
		    hbox.setPadding(new Insets(15, 12, 15, 12));
		    hbox.setSpacing(10);

		    Label welcomeLabel = new Label("Please Select A Category");
		    welcomeLabel.setFont(new Font("Arial", 40));

		    hbox.getChildren().addAll(welcomeLabel);

		    HBox hbox2 = new HBox();
		    hbox2.setPadding(new Insets(15, 12, 15, 12));
		    hbox2.setSpacing(10);

		    Button submit = new Button("Submit");

		    submit.setPrefSize(100, 20);

		    hbox2.getChildren().addAll(submit);

		    GridPane grid = new GridPane();
			grid.setHgap(10);
			grid.setVgap(10);
			grid.setPadding(new Insets(0, 10, 0, 10));

			//Add radio buttons
			RadioButton sales = new RadioButton("Sales");
			RadioButton members = new RadioButton("Members");
			RadioButton employees = new RadioButton("Employees");
			RadioButton inventory = new RadioButton("Inventory");
			RadioButton financial = new RadioButton("Financial Reports");
			RadioButton alerts = new RadioButton("Alerts");

			grid.add(sales, 0, 0);
			grid.add(members, 0, 1);
			grid.add(employees, 0, 2);
			grid.add(inventory, 15, 0);
			grid.add(financial, 15, 1);
			grid.add(alerts, 15, 2);

		pane.setTop(hbox);
		pane.setBottom(hbox2);
		pane.setCenter(grid);

		Scene scene = new Scene(pane);
		primaryStage.setTitle("Main Menu");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}


