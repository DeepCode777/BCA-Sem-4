import javafx.application.Application;
import javafx.scene.Scene;
//import javafx.collections.FXCollections;
import javafx.stage.Stage;

public class combobox extends Application {
    public void start(Stage s){
        s.setTitle("creating combo box ");
        String week_days[] = {"Monday","Tuesday","Wednesday","Thursday","Friday"};
        ComboBox cb = new ComboBox(FXCollections.observableArrayList(week_days));
        TilePane r = new TilePane(cb);
        Scene sc = new Scene(r, 200, 200);
        s.setScene(sc);
        s.show();
    }
    public static void main(String args[]) {
        launch(args);
    }
}
