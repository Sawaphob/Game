package application;
	
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			GridPane root = new GridPane();
			root.setAlignment(Pos.CENTER);
			VBox box = new VBox();
			root.setPadding(new Insets(220, 200, 0, 0));
			String backgroud_path= ClassLoader.getSystemResource("photo/Sega-Game-Backgrounds.jpg").toString();
			Image bimg = new Image(backgroud_path);
			Button start = new Button("Start !!!");
			box.setAlignment(Pos.TOP_RIGHT);
			//start.setBackground(new Background(new BackgroundFill(Color.BLACK, null, null)));
			start.setAlignment(Pos.CENTER_RIGHT);
			start.setPadding(new Insets(10));
			//start.setPrefSize(200, 100);
			box.getChildren().add(start);
			root.getChildren().add(0, box);
			root.setBackground(new Background(new BackgroundImage(bimg,null,null,null,new BackgroundSize(1000, 800, false, false,false,true))));
			Scene scene = new Scene(root,600,400);
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.setTitle("Game");
			primaryStage.setFullScreen(false);
			primaryStage.show();
			start.setOnMouseClicked(new EventHandler<MouseEvent>() {
				 public void handle(MouseEvent t) {
					 Enter enter = new Enter();
					 primaryStage.getScene().setRoot(enter.getRootPane());;
				 }
			});
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
