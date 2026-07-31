import java.awt.*;
import java.awt.event.*;

public class GFG extends Frame {
    GFG() {
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
    public void paint(Graphics g){
        g.setColor(Color.GREEN);
        g.setFont(new Font("Algerian", Font.BOLD, 50));
        g.drawString("GEEKS FOR GEEKS", 100, 200);
    }
    public static void main(String args[]){
        GFG obj = new GFG();
        obj.setTitle("GeeksForGeeks");
        obj.setSize(600,600);
        obj.setVisible(true);
    }
}
