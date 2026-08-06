import javafx.application.Application;
import javafx.scene.Scene;
//import javafx.scene.control.Label;
//import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
//import javafx.scene.image.*;
import java.io.*;

public class ImageLabel extends Application {
    public void start(Stage s) throws Exception {
        s.setTitle("Image With Label");
        FileInputStream input = new FileInputStream("f:\\gfg.png");
        Image i = new Image(input);
        ImageView iw = new ImageView(i);
        Label b = new Label("", iw);
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