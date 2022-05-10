package chap.chaperon;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class vue extends Application {

    private Rectangle[][] board;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {

        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);

        board = new Rectangle[5][5];

        root.setHgap(1);
        root.setVgap(1);
        for(int i = 0; i<4; i++){
            root.getColumnConstraints().add(new ColumnConstraints(80));
            root.getRowConstraints().add(new RowConstraints(80));

            for(int j = 0; j<4; j++) {
                board[i][j] = new Rectangle(80,80);
                board[i][j].setFill(Color.GREEN);

                root.add(board[i][j],i,j);
            }
        }

        Scene scene = new Scene(root,400,400);

        stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Petit Chaperon rouge");
        stage.show();


    }
}
