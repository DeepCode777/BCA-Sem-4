import javafx.application.Application;
import javafx.scene.Scene;
//import javafx.scene.control.Label;
//import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class label extends Application {
    public void start(Stage s) {
        s.setTitle("Label");
        Label b = new Label("This is a label");
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
