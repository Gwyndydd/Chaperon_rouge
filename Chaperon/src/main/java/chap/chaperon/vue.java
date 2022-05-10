package chap.chaperon;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class vue extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {

        GridPane root = new GridPane();

        Scene scene = new Scene(root,200,200);

        stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Petit Chaperon rouge");
        stage.show();


    }
}
