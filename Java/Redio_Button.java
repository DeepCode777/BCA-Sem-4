import javafx.application.Application;
import javafx.scene.Scene;
//import javafx.scene.control.*;
//import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class Radio_Button extends Application {
    public void start(Stage s) {
        s.setTitle("RadioButton");
        TilePane r = new TilePane();
        Label l = new Label("This is a Radiobutton");
        
        RadioButton r1 = new RadioButton("male");
        RadioButton r2 = new RadioButton("female");
        RadioButton r3 = new RadioButton("others");
        
        r.getChildren().addAll(l, r1, r2, r3);
        Scene sc = new Scene(r, 200, 200);
        s.setScene(sc);
        s.show();
    }
    public static void main(String args[]) {
        launch(args);
    }
}