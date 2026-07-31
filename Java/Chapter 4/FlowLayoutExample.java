import java.awt.*;
import javax.swing.*;

public class FlowLayoutExample {
    JFrame frameObj;
    FlowLayoutExample() {
        frameObj = new JFrame();
        for(int i=1;i<=10;i++){
            frameObj.add(new JButton(String.valueOf(i)));
        }
        frameObj.setLayout(new FlowLayout());
        frameObj.setSize(300,300);
        frameObj.setVisible(true);
    }
    public static void main(String args[]) {
        new FlowLayoutExample();
    }
}
