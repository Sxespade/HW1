package HomeWork4.sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent fxml = FXMLLoader.load(getClass().getResource("/HomeWork4/sample/sample.fxml"));

        Scene scene = new Scene(fxml);

        scene.setFill(Color.TRANSPARENT);

        primaryStage.setScene(scene);

/*        primaryStage.initStyle(StageStyle.TRANSPARENT);*/

        primaryStage.show();
        

    }


    public static void main(String[] args) {
        launch(args);
    }
}
