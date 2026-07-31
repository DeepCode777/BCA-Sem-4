import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class HelloMenu extends Application {
    public void start(Stage stage) {
        Image image = new Image("flower.png");
        ImageView iv = new ImageView(image);
        HBox box = new HBox(iv);
        Scene scene = new Scene(box, 400, 200);
        stage.setScene(scene);
        stage.setTitle("ImageView");
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
