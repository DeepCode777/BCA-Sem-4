import java.awt.*;
import javax.swing.*;

public class GridLayoutExample {
    JFrame frameObj;
    GridLayoutExample() {
        frameObj = new JFrame();
        for(int i=1;i<=9;i++){
            frameObj.add(new JButton(String.valueOf(i)));
        }
        frameObj.setLayout(new GridLayout());
        frameObj.setSize(300,300);
        frameObj.setVisible(true);
    }
    public static void main(String args[]) {
        new GridLayoutExample();
    }
}
