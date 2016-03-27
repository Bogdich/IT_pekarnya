package GUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("GreetingsWindowGUI.fxml"));
        Parent root1 = FXMLLoader.load(getClass().getResource("RegistrationWindowGUI.fxml"));
        Parent root2 = FXMLLoader.load(getClass().getResource("MapWindowGUI.fxml"));
        primaryStage.setTitle("IT Пекарня");
        Scene greetingsWindow = new Scene(root);
        Scene registrationWindow = new Scene(root1);
        Scene mapWindow = new Scene(root2);
        primaryStage.setScene(greetingsWindow);
        //primaryStage.setScene(mapWindow);
        //primaryStage.setScene(registrationWindow);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
