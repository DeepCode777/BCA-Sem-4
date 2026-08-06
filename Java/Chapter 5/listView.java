import javafx.application.Application;
import javafx.scene.Scene;
//import javafx.scene.control.ListView;
//import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class listView  extends Application {
    public void start(Stage s) throws Exception{
        s.setTitle("ListView");
        ListView lv = new ListView();
        
        lv.getItems().addAll("Item 1","Item 2","Item 3");
        HBox hbox = new HBox(lv);
        Scene sc = new Scene(hbox, 300, 120);
        s.setScene(sc);
        s.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}