import javafx.application.Application;
//import javafx.geometry.Insets;
//import javafx.scene.Group;
import javafx.scene.Scene;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextArea;
//import javafx.scene.layout.HBox;
//import javafx.scene.paint.Color;
//import javafx.scene.text.Font;
//import javafx.scene.text.FontPosture;
//import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class textArea extends Application {
    public void start(Stage s) {
        Label l = new Label("Address");
        Font font = Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 12);
        l.setFont(font);
        TextArea area = new TextArea();
        area.setText("Enter your address here");
        area.setPrefColumnCount(15);
        area.setPrefHeight(120);
        area.setPrefWidth(300);
        HBox hbox = new HBox();
        hbox.setSpacing(20);
        hbox.setPadding(new Insets(20, 50, 50, 60));
        hbox.getChildren().addAll(l, area);
        Group root = new Group(hbox);
        Scene scene = new Scene(root, 595, 200, Color.BEIGE);
        s.setTitle("Text Area");
        s.setScene(scene);
        s.show();
    }
    public static void main(String args[]) {
        launch(args);
    }
}