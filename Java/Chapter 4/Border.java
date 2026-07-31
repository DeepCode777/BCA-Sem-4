import java.awt.*;
import javax.swing.*;

public class Border {
    JFrame f;
    Border() {
        f = new JFrame();
        f.add(new JButton("NORTH"), BorderLayout.NORTH);
        f.add(new JButton("SOUTH"), BorderLayout.SOUTH);
        f.add(new JButton("EAST"), BorderLayout.EAST);
        f.add(new JButton("WEST"), BorderLayout.WEST);
        f.add(new JButton("CENTER"), BorderLayout.CENTER);
        f.setSize(300,300);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new Border();
    }
}
