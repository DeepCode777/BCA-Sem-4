import javafx.application.Application;
import javafx.scene.Scene;
//import javafx.scene.control.TextField;
//import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Textfield extends Application {
    public void start(Stage s) {
        s.setTitle("TextField");
        TextField b = new TextField();
        StackPane r = new StackPane();
        r.getChildren().add(b);
        Scene sc = new Scene(r, 200, 200);
        s.setScene(sc);
        s.show();
    }
    public static void main(String args[]) {
        launch(args);
    }
}
