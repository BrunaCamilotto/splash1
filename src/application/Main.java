package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
	
    public static Stage stage = null;

    @Override
    public void start(Stage primaryStage) {
    	try {
    	    Parent root = FXMLLoader.load(getClass().getResource("SplashUI.fxml"));
    	    Scene scene = new Scene(root);
    	    primaryStage.setScene(scene);
    	    primaryStage.initStyle(StageStyle.UNDECORATED);
    	    primaryStage.show();
    	    Main.stage = primaryStage;
    	} catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}